package com.company;

import com.entity.Demande;

public class FiltreAutre extends AbstractFiltreDemande{
    public FiltreAutre(AbstractFiltreDemande next) {
        super(next);
    }

    public void request(Demande demande, String message) {
        System.out.println("Cette demande est Irrecevable");
    }
}
