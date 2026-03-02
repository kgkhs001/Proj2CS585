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

public class AViz extends Application {

    private static String FILE_PATH;

    // Min and max for each of the 4 dimensions
    private double[] minValues = new double[4];
    private double[] maxValues = new double[4];

    @Override
    public void start(Stage stage) {
        List<double[]> centroids = loadCentroids(FILE_PATH);

        // Calculate dynamic ranges before drawing
        calculateRanges(centroids);

        Canvas canvas = new Canvas(900, 600);
        drawParallelCoordinates(canvas.getGraphicsContext2D(), centroids);

        StackPane root = new StackPane(canvas);
        stage.setTitle("Part A: 4D Parallel Coordinates");
        stage.setScene(new Scene(root, 950, 650));
        stage.show();
    }

    private void calculateRanges(List<double[]> data) {
        for (int i = 0; i < 4; i++) {
            minValues[i] = Double.MAX_VALUE;
            maxValues[i] = -Double.MAX_VALUE;
        }

        for (double[] point : data) {
            for (int i = 0; i < 4; i++) {
                if (point[i] < minValues[i]) minValues[i] = point[i];
                if (point[i] > maxValues[i]) maxValues[i] = point[i];
            }
        }
    }

    private void drawParallelCoordinates(GraphicsContext gc, List<double[]> data) {
        double width = gc.getCanvas().getWidth();
        double height = gc.getCanvas().getHeight();
        double padding = 60;

        double[] axisXPositions = {padding, (width - padding) * 0.33 + padding, (width - padding) * 0.66 + padding, width - padding};
        String[] labels = {"Dim W", "Dim X", "Dim Y", "Dim Z"};

        // Draw Axes and Labels
        gc.setStroke(Color.DARKGRAY);
        for (int i = 0; i < 4; i++) {
            gc.strokeLine(axisXPositions[i], padding, axisXPositions[i], height - padding);
            gc.setFill(Color.BLACK);
            gc.fillText(labels[i], axisXPositions[i] - 15, padding - 20);
            gc.setFont(javafx.scene.text.Font.font(10));
            gc.fillText(String.format("%.2f", maxValues[i]), axisXPositions[i] + 5, padding);
            gc.fillText(String.format("%.2f", minValues[i]), axisXPositions[i] + 5, height - padding);
        }

        // Draw Data Lines
        double hueStep = 360.0 / data.size();
        double currentHue = 0;

        for (double[] point : data) {
            gc.setStroke(Color.hsb(currentHue, 0.7, 0.8, 0.5));
            gc.setLineWidth(2.0);

            for (int i = 0; i < 3; i++) {
                double x1 = axisXPositions[i];
                double y1 = normalize(point[i], i, height, padding);
                double x2 = axisXPositions[i+1];
                double y2 = normalize(point[i+1], i+1, height, padding);
                gc.strokeLine(x1, y1, x2, y2);
            }
            currentHue += hueStep;
        }
    }

    private double normalize(double val, int dimIndex, double canvasHeight, double padding) {
        double range = maxValues[dimIndex] - minValues[dimIndex];
        if (range == 0) return canvasHeight / 2; // Avoid division by zero if all values are same

        double availableHeight = canvasHeight - (2 * padding);
        double normalized = (val - minValues[dimIndex]) / range;

        // Invert Y because JavaFX (0,0) is top-left
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
                            Double.parseDouble(parts[0]), Double.parseDouble(parts[1]),
                            Double.parseDouble(parts[2]), Double.parseDouble(parts[3])
                    });
                }
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java AViz <file_path>");
            System.exit(1);
        }
        FILE_PATH = args[0];
        launch(args);
    }

}