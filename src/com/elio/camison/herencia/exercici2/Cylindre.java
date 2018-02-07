package com.elio.camison.herencia.exercici2;

public class Cylindre extends Circle {

    private double heigth = 1.0;

    Cylindre(){

    }

    Cylindre(double radius){
        super(radius);
    }

    Cylindre(double radius, double heigth){
        super(radius);
        this.heigth = heigth;
    }

    public double getArea(){
        double area = 0.0;
        return area = ((2 * Math.PI * super.getRadius() * heigth) + (2 * super.getArea()));
    }

    /**
     * V = Math.PI * Math.pow(this.getRadius(),2) * this.getHeigth()
     *
     * @return
     */
    public double getVolum(){
        double volum = Math.PI * Math.pow(super.getRadius(),2) * this.getHeigth();
        return volum;
    }

    public double getHeigth() {
        return heigth;
    }

}
