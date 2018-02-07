package com.elio.camison.herencia.exercici3;

public class Circle extends Shape {

    public double radius = 1.0;

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super( color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area = 0.0;
        return area = Math.pow(this.radius,2) * Math.PI;
    }

    public double getPerimeter(){
        return 0.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Circle with radius= '" + radius + '\'' +
                " which is a subclass of, area=" + this.getArea() +
                '}';
    }
}
