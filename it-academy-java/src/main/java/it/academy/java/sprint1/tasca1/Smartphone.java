package it.academy.java.sprint1.tasca1;

public class Smartphone extends  Telefon implements Camera, Rellotge{


    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto");
    }

    @Override
    public void alarmar() {
        System.out.println("Està sonant l’alarma");

    }
}
