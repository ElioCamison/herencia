package com.elio.camison.herencia.Exercici4.Personal;

public class Encarregat extends Empleat {

    String departament;

    Encarregat(){

    }

    Encarregat(String departament, String nom, String llinatge, String dni, double sou){
        super(nom,llinatge,dni,sou);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    @Override
    public double getSou() {
        return super.getSou() * 0.10 ;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Encarregat{" +
                "departament='" + departament + '\'' +
                '}';
    }

}
