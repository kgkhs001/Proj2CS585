import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CentroidViz extends Application {

    // Setup
    private static final double MIN_VAL = 0.0;
    private static final double MAX_VAL = 100.0;
    private static final String FILE_PATH = "part-r-00000"; // Hadoop output

    @Override
    public void start(Stage stage) {
        List<double[]> centroids = loadCentroids(FILE_PATH);

        Canvas canvas = new Canvas(800, 600);
        drawParallelCoordinates(canvas.getGraphicsContext2D(), centroids);

        StackPane root = new StackPane(canvas);
        stage.setTitle("4D Centroid Visualization - Parallel Coordinates");
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void drawParallelCoordinates(GraphicsContext gc, List<double[]> data) {
        double width = gc.getCanvas().getWidth();
        double height = gc.getCanvas().getHeight();
        double padding = 50;

        // 1. Draw the 4 Vertical Axes (W, X, Y, Z)
        double[] axisXPositions = {padding, (width/3), (2*width/3), width - padding};
        String[] labels = {"W", "X", "Y", "Z"};

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        for (int i = 0; i < 4; i++) {
            gc.strokeLine(axisXPositions[i], padding, axisXPositions[i], height - padding);
            gc.fillText(labels[i], axisXPositions[i] - 5, padding - 10);
        }

        // 2. Draw each Centroid as a Line
        int colorHue = 0;
        for (double[] point : data) {
            gc.setStroke(Color.hsb(colorHue, 0.8, 0.8, 0.6)); // Unique color per centroid
            gc.setLineWidth(1.5);

            for (int i = 0; i < 3; i++) {
                double x1 = axisXPositions[i];
                double y1 = mapToY(point[i], height, padding);

                double x2 = axisXPositions[i+1];
                double y2 = mapToY(point[i+1], height, padding);

                gc.strokeLine(x1, y1, x2, y2);
            }
            colorHue += (360 / Math.max(1, data.size())); // Shift color for next line
        }
    }

    private double mapToY(double val, double canvasHeight, double padding) {
        // Normalizes the 4D value to the pixel height of the screen
        double availableHeight = canvasHeight - (2 * padding);
        double normalized = (val - MIN_VAL) / (MAX_VAL - MIN_VAL);
        return (canvasHeight - padding) - (normalized * availableHeight);
    }

    private List<double[]> loadCentroids(String path) {
        List<double[]> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    list.add(new double[]{
                            Double.parseDouble(parts[0]),
                            Double.parseDouble(parts[1]),
                            Double.parseDouble(parts[2]),
                            Double.parseDouble(parts[3])
                    });
                }
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public static void main(String[] args) { launch(args); }
}

