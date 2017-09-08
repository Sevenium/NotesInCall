package com.example.lenovoe330.notesincall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bryan Audic on 31/08/2017.
 *
 * Un contact est associé à une personne avec un nom, un num, et une liste de notes. modifLocale correspond à un changement dans l'appli d'un nom de contact
 */

public class Contact {
    private String nom;
    private String numéro;
    private boolean modifLocale = false;
    private List<Note> listeNotes = null;

    public Contact(String nom, String numéro) {
        this.nom = nom;
        this.numéro = numéro;
        this.listeNotes =new ArrayList<Note>();
    }

    //Ajout d'une nouvelle note par défaut
    public void ajoutNote(){
        this.listeNotes.add(new Note(false,this));
    }

    //Ajout d'une nouvelle note
    public void ajoutNote(Note nouvelleNote){
        this.listeNotes.add(nouvelleNote);
    }

    public void supprimeNote(int index){
        if(index < this.listeNotes.size()){
            this.listeNotes.remove(index);
        }
    }
    public Note getLastNote(){
        if(!this.listeNotes.isEmpty()){
            return this.listeNotes.get(this.listeNotes.size());
        }
        return null;
    }
    public Note getNote(int index){
        if(index < this.listeNotes.size()) {
            return this.listeNotes.get(index);
        }
        return null;
    }
    public int getIndex(Note wantedNote){
        return this.listeNotes.indexOf(wantedNote);
    }
    public void modifNote(Note modifiedNote, int index){
        if(index < this.listeNotes.size()) {
            this.listeNotes.set(index, modifiedNote);
        }
    }
    public int nombresNotes(){
        return this.listeNotes.size();
    }

    // Getter and Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNuméro() {
        return numéro;
    }

    public void setNuméro(String numéro) {
        this.numéro = numéro;
    }

    public boolean isModifLocale() {
        return modifLocale;
    }

    public void setModifLocale(boolean modifLocale) {
        this.modifLocale = modifLocale;
    }

}
