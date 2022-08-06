package com.entity;

public class Category {
    private int idCat;
    private String nomCat;

    public Category(){

    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public Category(int idCat, String nomCat) {
        this.idCat = idCat;
        this.nomCat = nomCat;
    }
}
