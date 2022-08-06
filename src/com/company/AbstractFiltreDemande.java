package com.company;

import com.entity.Demande;

public abstract class AbstractFiltreDemande {
    private AbstractFiltreDemande sucessor = null;
    public AbstractFiltreDemande(AbstractFiltreDemande next) {
        this.sucessor = next;
    }
    public AbstractFiltreDemande getNextHandler() {
        return this.sucessor;
    }
    public abstract void request(Demande demande, String message);
}
