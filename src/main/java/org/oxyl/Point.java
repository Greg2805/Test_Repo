package org.oxyl;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x=0.0;
        this.y=0.0;
    }

    public Point(Point autrePoint){
        this.x= autrePoint.x;
        this.y= autrePoint.y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Object object){
        if(object instanceof Point point){
            return this.x== point.x && this.y == point.y;
        }
        return false;
    }

    public double calculerDistance(Point point){
        return sqrt(pow(point.x - this.x, 2)+pow(point.y - this.y, 2));
    }

}
