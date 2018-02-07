package com.elio.camison.herencia.exercici3;

public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    Rectangle(){

    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        double area = this.width * this.length;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * (this.width + this.length);
        return perimeter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

}
