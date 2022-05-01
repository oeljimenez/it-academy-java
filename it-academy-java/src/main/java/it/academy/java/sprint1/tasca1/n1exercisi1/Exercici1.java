package it.academy.java.sprint1.tasca1.n1exercisi1;

import it.academy.java.sprint1.tasca1.Corda;
import it.academy.java.sprint1.tasca1.Percussio;
import it.academy.java.sprint1.tasca1.Vent;

public class Exercici1 {

    public static void main(String[] args) {
        System.out.println("Tasca S1.01. Herència i Polimorfisme (Spring1), Nivell 1, Exercisi 1");

        Corda corda = new Corda();
        //using class instantiation
        corda.tocar();
        //using static method
        Corda.tocar();

        Vent vent = new Vent();
        //using class instantiation
        vent.tocar();
        //using static method
        Vent.tocar();

        Percussio percussio = new Percussio();
        //using class instantiation
        percussio.tocar();
        //using static method
        Percussio.tocar();


    }
}
