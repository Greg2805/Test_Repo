package org.oxyl;

import static java.lang.Math.*;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Triangle {
    private Point coin1;
    private Point coin2;
    private Point coin3;

    public Triangle(double x1, double y1,double x2, double y2,double x3, double y3 ){
        this.coin1 = new Point(x1, y1);
        this.coin2 = new Point(x2, y2);
        this.coin3 = new Point(x3, y3);
    }

    public Triangle(){
        this.coin1 = new Point(0.0, 0.0);
        this.coin2 = new Point(0.0, 1.0);
        this.coin3 = new Point(0.5, 0.5);
    }

    public Triangle(Triangle autre){
        this.coin1 = new Point(autre.coin1.getX(), autre.coin1.getY());
        this.coin2 = new Point(autre.coin2.getX(), autre.coin2.getY());
        this.coin3 = new Point(autre.coin3.getX(), autre.coin3.getY());
    }

    public void deplacer(double distanceX, double distanceY){
        this.coin1.setX(this.coin1.getX() + distanceX);
        this.coin1.setY(this.coin1.getY() + distanceX);
        this.coin2.setX(this.coin2.getX() + distanceX);
        this.coin2.setY(this.coin2.getY() + distanceX);
        this.coin3.setX(this.coin3.getX() + distanceX);
        this.coin3.setY(this.coin3.getY() + distanceX);
    }

    public void tourner(double theta){

        double thetaRad=(theta* PI)/180;

        double barycentreX = (coin1.getX()+ coin2.getX()+ coin3.getX())/3;
        double barycentreY = (coin1.getY()+ coin2.getY()+ coin3.getY())/3;

        double tempX1 = coin1.getX()-barycentreX;
        double tempX2 = coin2.getX()-barycentreX;
        double tempX3 = coin3.getX()-barycentreX;
        double tempY1 = coin1.getY()-barycentreY;
        double tempY2 = coin2.getY()-barycentreY;
        double tempY3 = coin3.getY()-barycentreY;

        coin1.setX((tempX1*cos(thetaRad)-tempY1*sin(thetaRad))+barycentreX);
        coin1.setX((tempX2*cos(thetaRad)-tempY2*sin(thetaRad))+barycentreX);
        coin1.setX((tempX3*cos(thetaRad)-tempY3*sin(thetaRad))+barycentreX);
        coin1.setY((tempX1*sin(thetaRad)+tempY1*cos(thetaRad))+barycentreY);
        coin1.setY((tempX2*sin(thetaRad)+tempY2*cos(thetaRad))+barycentreY);
        coin1.setY((tempX3*sin(thetaRad)+tempY3*cos(thetaRad))+barycentreY);



    }

}
