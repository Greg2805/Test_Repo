package org.oxyl;

public class CercleAvecPoint {
    private double rayon;
    private Point centre;
    // Constructeur principal
    public CercleAvecPoint(Point centre, double rayon) {
        this.centre = new Point(centre);
        this.rayon = rayon;
    }

    // Constructeur par défaut
    public CercleAvecPoint() {
        this.centre = new Point();
        this.rayon = 1.0;
    }

    // Constructeur par copie
    public CercleAvecPoint(CercleAvecPoint autre) {
        this.centre = new Point(autre.centre.getX(), autre.centre.getY());
        this.rayon = autre.rayon;
    }


    public void deplacer(double distanceX, double distanceY) {
        this.centre.setX(this.centre.getX() + distanceX);
        this.centre.setY(this.centre.getY() + distanceY);
    }


    public boolean isGrand() {
        return this.rayon > 100;
    }


    public void redimensionner(double f) {
        this.rayon *= f;
    }
}
