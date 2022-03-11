package models;

import java.util.List;

public class Animal {

    private String nume;
    private double greutate;
    private String specie;
    private double pret;


    public Animal(String nume, double greutate, String specie, double pret) {
        this.nume = nume;
        this.greutate = greutate;
        this.specie = specie;
        this.pret=pret;

    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
