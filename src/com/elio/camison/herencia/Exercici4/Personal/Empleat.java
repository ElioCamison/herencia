package com.elio.camison.herencia.Exercici4.Personal;

public class Empleat {
    String nom;
    String llinatge;
    String dni;
    double sou;

    Empleat(){

    }

    Empleat(String nom, String llinatge, String dni, double sou){
        this.nom = nom;
        this.llinatge = llinatge;
        this.dni = dni;
        this.sou = sou;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge() {
        return llinatge;
    }

    public void setLlinatge(String llinatge) {
        this.llinatge = llinatge;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }

    @Override
    public String toString() {
        return "Empleat{" +
                "nom='" + nom + '\'' +
                ", llinatge='" + llinatge + '\'' +
                ", dni='" + dni + '\'' +
                ", sou=" + sou +
                '}';
    }

}
