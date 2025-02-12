package org.oxyl;

public class RectangleAvecPoint {
    private Point centre;
    private double longueur;
    private double largeur;
    private double angle;

    // Constructeur principal
    public RectangleAvecPoint(Point centre, double longueur, double largeur, double angle) {
        this.centre = new Point(centre);
        this.longueur = longueur;
        this.largeur = largeur;
        this.angle = angle;
    }

    // Constructeur par défaut
    public RectangleAvecPoint() {
        centre = new Point();
        this.longueur = 1.0;
        this.largeur = 1.0;
        this.angle = 0.0;
    }

    // Constructeur par copie
    public RectangleAvecPoint(RectangleAvecPoint autre) {
        this.centre = new Point(autre.centre.getX(), autre.centre.getY());
        this.longueur = autre.longueur;
        this.largeur = autre.largeur;
        this.angle = autre.angle;
    }


    public void deplacer(double distanceX, double distanceY) {
        this.centre.setX(this.centre.getX() + distanceX);
        this.centre.setY(this.centre.getY() + distanceY);
    }


    public boolean isCarre() {
        return this.longueur == this.largeur;
    }


    public void redimensionner(double facteur) {
        this.longueur *= facteur;
        this.largeur *= facteur;
    }

    public void tourner(double theta){
        this.angle += theta;
    }

}
