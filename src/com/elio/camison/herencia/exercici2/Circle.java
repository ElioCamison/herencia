package com.elio.camison.herencia.exercici2;

public class Circle {
    public double radius = 1.0;
    private String color = "red";

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area = 0.0;
        return area = Math.pow(this.radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= '" + radius + '\'' +
                ", area=" + this.getArea() +
                '}';
    }

}
