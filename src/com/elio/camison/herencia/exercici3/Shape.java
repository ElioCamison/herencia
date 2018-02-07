package com.elio.camison.herencia.exercici3;

import sun.security.provider.SHA;

public class Shape {

    private String color = "red";
    private boolean filled = true;
    //--o ---------------------------------------------------------
    Shape(){

    }

    //--o ---------------------------------------------------------

    Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //--o ---------------------------------------------------------

    boolean isFilled(){
        return false;
    }

    //--o ---------------------------------------------------------

    public String getColor() {
        return color;
    }

    //--o ---------------------------------------------------------

    public void setColor(String color) {
        this.color = color;
    }

    //--o ---------------------------------------------------------

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //--o ---------------------------------------------------------

    @Override
    public String toString() {
        return "Shape{" +
                "Shape with color of='" + color + '\'' +
                "and, filled=" + filled +
                '}';
    }

}
