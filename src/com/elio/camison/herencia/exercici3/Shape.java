package com.elio.camison.herencia.exercici3;

import sun.security.provider.SHA;

public class Shape {

    private String color = "red";

    private boolean filled = true;

    Shape(){

    }

    Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

      boolean isFilled(){
        return false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
