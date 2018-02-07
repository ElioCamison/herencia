package com.elio.camison.herencia.Exercici4.Personal;

public class Main {
    public static void main(String[] args) {
        Empleat emp1 = new Empleat("Tonina","Ramis","43195578R",1500.00);
        Encarregat encar1 = new Encarregat("Desarrollo","Toni","Tomas","99877566A",2000);

        System.out.println(encar1.getSou());

    }
}
