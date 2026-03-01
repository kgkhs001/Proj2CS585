package org.example.utils;


public class Vector {

    public double w;
    public double x;
    public double y;
    public double z;
    public Vector(double w, double x, double y, double z){
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(String vString){
        String[] vParts = vString.split(",");
        w = Double.valueOf(vParts[0]);
        x = Double.valueOf(vParts[1]);
        y = Double.valueOf(vParts[2]);
        z = Double.valueOf(vParts[3]);
    }
    public double dist(Vector other){
        return Math.sqrt((other.w - w) * (other.w - w)
                + (other.x - x) * (other.x - x)
                + (other.y - y) * (other.y - y)
                + (other.z - z) * (other.z - z));
    }
    public String toString(){
        return w+","+x+","+y+","+z;
    }
    public void scalarMult(double s){
        w*=s;
        x*=s;
        y*=s;
        z*=s;
    }
    public void vecAdd(Vector other){
        w += other.w;
        x += other.x;
        y += other.y;
        z += other.z;
    }
}



