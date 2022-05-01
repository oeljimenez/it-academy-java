package it.academy.java.sprint1.tasca1.n1exercisi2;

import it.academy.java.sprint1.tasca1.Cotxe;

public class Exercisi2 {

    public static void main(String[] args) {
        System.out.println("Tasca S1.01. Herència i Polimorfisme (Spring1), Nivell 1, Exercisi 2");

        Cotxe.frenar();

        Cotxe cotxe = new Cotxe("50 CV");
        cotxe.accelerar();

    }
}
