package com.company;

import com.entity.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {
    /**
     * @@IbrahimaFAYE
     * Class principal
     */
    public static void main(String[] args) throws ParseException {
        //Initialisation des dates d'envoies de différentes demandes
        String date_string = "04-08-2022";
        String date_string1 = "05-08-2022";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Formatage des dates
        Date date = formatter.parse(date_string);
        Date date1 = formatter.parse(date_string1);


        Priority p = Priority.Faible;
        Priority p1 = Priority.Moyenne;
        Priority p2 = Priority.Haute;
        Role role = new Role(1,"Technicien");
        Role role1 = new Role(2,"Directeur");
        Category category = new Category(1, "Matériel");
        Category category1 = new Category(2,"Logiciel");
        User user = new User(1,"FAYE","Ibrahima","faye@gmail.com",role1);
        User user1 = new User(1,"CAMARA","Foussein","camara@gmail.com",role);
        Demande demande = new Demande(1,"RAOUF","Abdou","raouf@gmail.com",user1,category,p,date,"Demande de Raouf");
        Demande demande1 = new Demande(1,"KEITA","Adja","adjia@gmail.com",user,category1,p1,date1,"Demande de Adja");
        Demande demande2 = new Demande(1,"NDIAYE","Talla","talla@gmail.com",user,category,p,date,"Demande de Talla");
        Demande demande3 = new Demande(1,"FAYE","Oumy","oumou@gmail.com",user,category1,p2,date1,"Demande de Oumou");
	// write your code here
        AbstractFiltreDemande chaine = new FiltreTechnicien(new FiltreDirecteur(new FiltreAutre(null)));
        chaine.request(demande,"Test@0");
        chaine.request(demande1,"Test@1");
        chaine.request(demande2,"Test@2");
        chaine.request(demande3,"Test@3");
        //LocalDate today = LocalDate.now();
        //System.out.println(today);
    }
}
