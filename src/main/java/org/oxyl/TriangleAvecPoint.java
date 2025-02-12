package org.oxyl;

import static java.lang.Math.*;

public class TriangleAvecPoint {
    private Point point1;
    private Point point2;
    private Point point3;

    public TriangleAvecPoint(Point point1, Point point2, Point point3){
        this.point1 = new Point(point1);
        this.point2 = new Point(point2);
        this.point3 = new Point(point3);
    }

    public TriangleAvecPoint(){
        this.point1 = new Point(0.0, 0.0);
        this.point2 = new Point(0.0, 1.0);
        this.point3 = new Point(0.5, 0.5);
    }

    public TriangleAvecPoint(TriangleAvecPoint autre){
        this.point1 = new Point(autre.point1.getX(), autre.point1.getY());
        this.point2 = new Point(autre.point2.getX(), autre.point2.getY());
        this.point3 = new Point(autre.point3.getX(), autre.point3.getY());
    }

    public void deplacer(double distanceX, double distanceY){
        this.point1.setX(this.point1.getX() + distanceX);
        this.point1.setY(this.point1.getY() + distanceY);
        this.point2.setX(this.point2.getX() + distanceX);
        this.point2.setY(this.point2.getY() + distanceY);
        this.point3.setX(this.point3.getX() + distanceX);
        this.point3.setY(this.point3.getY() + distanceY);
    }

    public void tourner(double theta){

        double thetaRad=(theta* PI)/180;

        double barycentreX = (point1.getX()+ point2.getX()+ point3.getX())/3;
        double barycentreY = (point1.getY()+ point2.getY()+ point3.getY())/3;

        double tempX1 = point1.getX()-barycentreX;
        double tempX2 = point2.getX()-barycentreX;
        double tempX3 = point3.getX()-barycentreX;
        double tempY1 = point1.getY()-barycentreY;
        double tempY2 = point2.getY()-barycentreY;
        double tempY3 = point3.getY()-barycentreY;

        point1.setX((tempX1*cos(thetaRad)-tempY1*sin(thetaRad))+barycentreX);
        point1.setX((tempX2*cos(thetaRad)-tempY2*sin(thetaRad))+barycentreX);
        point1.setX((tempX3*cos(thetaRad)-tempY3*sin(thetaRad))+barycentreX);
        point1.setY((tempX1*sin(thetaRad)+tempY1*cos(thetaRad))+barycentreY);
        point1.setY((tempX2*sin(thetaRad)+tempY2*cos(thetaRad))+barycentreY);
        point1.setY((tempX3*sin(thetaRad)+tempY3*cos(thetaRad))+barycentreY);



    }

}
