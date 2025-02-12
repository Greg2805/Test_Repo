package org.oxyl;

public class Cercle {
    private double centreX;
    private double centreY;
    private double rayon;

    // Constructeur principal
    public Cercle(double centreX, double centreY, double rayon) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
    }

    // Constructeur par défaut
    public Cercle() {
        this(0.0, 0.0, 1.0);
    }

    // Constructeur par copie
    public Cercle(Cercle autre) {
        this(autre.centreX, autre.centreY, autre.rayon);
    }


    public void deplacer(double distanceX, double distanceY) {
        this.centreX += distanceX;
        this.centreY += distanceY;
    }


    public boolean isGrand() {
        return this.rayon > 100;
    }

    public void redimensionner(double f) {
        this.rayon *= f;
    }

}
