package com.example.lenovoe330.notesincall;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Bryan Audic on 31/08/2017.
 *
 * La classe note ayant pour but de contenir du texte et d'autres informations
 */

public class Note {
    private String contenu;
    private boolean favori;
    private Date dateCreation;
    private Date dateModif;
    private Contact contact;

    //Format pour une date (trouvé sur internet)
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


    //Constructor
    public Note(boolean favori, Contact contact) {
        this.contenu = "";
        this.favori = favori;
        this.dateCreation = new Date();
        this.dateModif =new Date();
        this.contact = contact;

    }



    // Getter and Setter
    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public boolean isFavori() {
        return favori;
    }

    public void setFavori(boolean favori) {
        this.favori = favori;
    }

    public Date getDateCreation() {
        return dateCreation;
    }


    public Date getDateModif() {
        return dateModif;
    }

    public void setDateModif(Date dateModif) {
        this.dateModif = dateModif;
    }

    public Contact getContact() {
        return contact;
    }
}
