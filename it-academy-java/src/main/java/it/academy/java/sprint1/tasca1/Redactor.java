package it.academy.java.sprint1.tasca1;

import java.util.List;

public class Redactor {

    private String nom;
    public final String DNI ;
    private static int sou;
    private List<Noticia> noticies;

    public Redactor(String dni) {
        DNI = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static int getSou() {
        return sou;
    }

    public static void setSou(int sou) {
        Redactor.sou = sou;
    }

    public List<Noticia> getNoticies() {
        return noticies;
    }

    public void setNoticies(List<Noticia> noticies) {
        this.noticies = noticies;
    }

    @Override
    public String toString() {
        return "Redactor{" +
                "nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", noticies=" + noticies +
                '}';
    }
}
