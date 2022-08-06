package com.entity;

import java.util.Date;

/**
 * @@IbrahimaFAYE
 * Class définissant les attributs d'une demande
 */
public class Demande{
    private int idD;
    private String nomDemandeur;
    private String prenomDemandeur;
    private String emailDemandeur;
    private User emailReceveur;
    private Category catD;
    private Priority priorityD;
    private Date dateD;
    private String corpsD;

    public Demande(){

    }

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public String getNomDemandeur() {
        return nomDemandeur;
    }

    public void setNomDemandeur(String nomDemandeur) {
        this.nomDemandeur = nomDemandeur;
    }

    public String getPrenomDemandeur() {
        return prenomDemandeur;
    }

    public void setPrenomDemandeur(String prenomDemandeur) {
        this.prenomDemandeur = prenomDemandeur;
    }

    public String getEmailDemandeur() {
        return emailDemandeur;
    }

    public User getEmailReceveur() {
        return emailReceveur;
    }

    public void setEmailDemandeur(String emailDemandeur) {
        this.emailDemandeur = emailDemandeur;
    }

    public void setEmailReceveur(User emailReceveur) {
        this.emailReceveur = emailReceveur;
    }

    public Category getCatD() {
        return catD;
    }

    public void setCatD(Category catD) {
        this.catD = catD;
    }

    public Priority getPriorityD() {
        return priorityD;
    }

    public void setPriorityD(Priority priorityD) {
        this.priorityD = priorityD;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public String getCorpsD() {
        return corpsD;
    }

    public void setCorpsD(String corpsD) {
        this.corpsD = corpsD;
    }

    public Demande(int idD, String nomDemandeur, String prenomDemandeur, String emailDemandeur,User emailReceveur, Category catD, Priority priorityD, Date dateD, String corpsD) {
        this.idD = idD;
        this.nomDemandeur = nomDemandeur;
        this.prenomDemandeur = prenomDemandeur;
        this.emailDemandeur = emailDemandeur;
        this.emailReceveur = emailReceveur;
        this.catD = catD;
        this.priorityD = priorityD;
        this.dateD = dateD;
        this.corpsD = corpsD;
    }
}
