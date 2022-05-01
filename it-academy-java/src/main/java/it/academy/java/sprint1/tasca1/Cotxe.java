package it.academy.java.sprint1.tasca1;

public class Cotxe {
    private static final String marca = "seat";//needs to be initialized
    private static String model;
    private final String potencia;

    //attributes that can be initialized by the constructor
    public Cotxe(String potencia) {
        this.potencia = potencia;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

}
