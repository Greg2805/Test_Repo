package org.oxyl;

public class Rectangle {
    private double centreX;
    private double centreY;
    private double longueur;
    private double largeur;
    private double angle;

    // Constructeur principal
    public Rectangle(double centreX, double centreY, double longueur, double largeur, double angle) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.longueur = longueur;
        this.largeur = largeur;
        this.angle = angle;
    }

    // Constructeur par défaut
    public Rectangle() {
        this(0.0, 0.0, 1.0, 1.0, 0.0);
    }

    // Constructeur par copie
    public Rectangle(Rectangle autre) {
        this(autre.centreX, autre.centreY, autre.longueur, autre.largeur, autre.angle);
    }

    // Méthode pour déplacer le rectangle
    public void deplacer(double distanceX, double distanceY) {
        this.centreX += distanceX;
        this.centreY += distanceY;
    }

    // Méthode pour vérifier si le rectangle est un carré
    public boolean isCarre() {
        return this.longueur == this.largeur;
    }

    // Méthode pour redimensionner le rectangle
    public void redimensionner(double facteur) {
        this.longueur *= facteur;
        this.largeur *= facteur;
    }

    public void tourner(double theta){
        this.angle += theta;
    }

}
