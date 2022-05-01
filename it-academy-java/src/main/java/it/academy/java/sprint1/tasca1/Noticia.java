package it.academy.java.sprint1.tasca1;

public class Noticia {

    private String titular;
    private String text;
    private int puntuacio ;
    private int preu;

    public static void calcularPreuNoticia(){
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                ", puntuacio=" + puntuacio +
                ", preu=" + preu +
                '}';
    }
}
