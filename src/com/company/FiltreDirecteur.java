package com.company;

import com.entity.Demande;

import java.time.LocalDate;

public class FiltreDirecteur extends AbstractFiltreDemande{
    public FiltreDirecteur(AbstractFiltreDemande next) {
        super(next);
    }
    LocalDate today = LocalDate.now();
    LocalDate yesterday = today.minusDays(1);

    public void request(Demande demande, String message) {
        int demandeDay = demande.getDateD().getDate();
        int instantDay = yesterday.getDayOfMonth();
        int dureeDemande = instantDay - demandeDay;
        if (demande.getCatD().getNomCat().equalsIgnoreCase("matériel") && dureeDemande >= 2) {
            System.out.println("Cette de demande est à classer dans la catégorie matériel");
        }else if(demande.getCatD().getNomCat().equalsIgnoreCase("logiciel") && dureeDemande >= 2){
            System.out.println("Cette de demande est à classer dans la catégorie logiciel");
        }
        else {
            getNextHandler().request(demande, message);
        }
    }
}
