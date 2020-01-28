package junkjumper.m412;

import java.util.ArrayList;

public class Personne {

    private String nom;
    private char genre;
    private ArrayList<String> langage;

    public Personne() {
        this("Nom Par Defaut", 'x');
    }

    public Personne(String n) {
        this(n, 'x');
    }

    public Personne(char g) {
        this("Nom Par Defaut", g);
    }


    public Personne(String n, char g) {
        this.nom = n;
        this.genre = g;
    }

    public ArrayList<String> getLangage() {
        return this.langage;
    }

    public char getGenre() {
        return this.genre;
    }

    public String getNom() {
        return this.nom;
    }

}
