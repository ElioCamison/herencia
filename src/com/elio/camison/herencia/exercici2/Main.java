package com.elio.camison.herencia.exercici2;

public class Main {

    public static void main(String[] args) {
        Circle crl1 = new Circle(2.5);
        Cylindre cylr = new Cylindre(2.5,1.5);
        //System.out.println(crl1);
        System.out.println("Area del círculo " + crl1.getArea());
        System.out.println("Area del cilindro " + cylr.getArea());
        System.out.println("Volumen del cilindro " + cylr.getVolum());



    }

}
