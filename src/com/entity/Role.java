package com.entity;

/**
 * @@IbrahimaFAYE
 * Class définissant les attributs d'un role que peut avoir un utilisateur
 */
public class Role {
    private int idR;
    private String nomR;

    public Role(){

    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public Role(int idR, String nomR) {
        this.idR = idR;
        this.nomR = nomR;
    }

}

