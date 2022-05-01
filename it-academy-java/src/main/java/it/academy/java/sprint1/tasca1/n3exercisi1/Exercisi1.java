package it.academy.java.sprint1.tasca1.n3exercisi1;

import it.academy.java.sprint1.tasca1.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercisi1 {
     public static void main(String[] args) {
          System.out.println("Tasca S1.01. Herència i Polimorfisme (Spring1), Nivell 3, Exercisi 1");

          Scanner sn = new Scanner(System.in);
          boolean salir = false;
          int opcion; //save the user input

          List<Redactor> redactorList = new ArrayList<>();
          List<Noticia> noticiaList = new ArrayList<>();
          List<Noticia> noticies = new ArrayList<>();

          while(!salir) {
               System.out.println("1. Introduir redactor");
               System.out.println("2. Eliminar redactor");
               System.out.println("3. Introduir notícia a un redactor");
               System.out.println("4. Eliminar notícia (ha de demanar redactor i titular de la notícia)");
               System.out.println("5. Mostrar totes les notícies per redactor");
               System.out.println("6. Calcular puntuació de la notícia");
               System.out.println("7. Calcular preu notícia");
               System.out.println("8. Sortir");

               try {
                    System.out.println("Selecciona una opció");
                    opcion = sn.nextInt();

                    switch (opcion) {
                         case 1:
                              System.out.println("Introdueix el DNI del redactor");
                              Redactor redactor = new Redactor(sn.next());
                              System.out.println("Introdueix el nom del redactor");
                              redactor.setNom(sn.next());
                              System.out.println(redactor.toString());
                              redactorList.add(redactor);
                              System.out.println("size redactorList-->"+redactorList.size());
                              break;
                         case 2:
                              System.out.println("Introdueix el nom del redactor que vols eliminar");
                              String nom = sn.next();
                              redactorList.removeIf(r-> r.getNom().equalsIgnoreCase(nom));
                              System.out.println("size redactorList-->"+redactorList.size());
                              break;
                         case 3:

                              System.out.println("Introdueix el nom del redactor la noticia");
                              Redactor redact = redactorList.stream().filter(r-> r.getNom().equalsIgnoreCase(sn.next())).findFirst().get();

                              salir = true;
                              while(!salir) {
                                   System.out.println("1. futbol");
                                   System.out.println("2. bàsquet");
                                   System.out.println("3. Tenis");
                                   System.out.println("4. F1");
                                   System.out.println("5. Motociclisme");
                                   try {
                                        System.out.println("Selecciona el tipus de noticia");
                                        int tipusNoticia = sn.nextInt();
                                        switch(tipusNoticia) {
                                             case 1:
                                                  NoticiaFutbol noticiaFutbol = new NoticiaFutbol();
                                                  System.out.println("Introdueix el titular la noticia");
                                                  noticiaFutbol.setTitular(sn.next());
                                                  System.out.println("Introdueix el text la noticia");
                                                  noticiaFutbol.setText(sn.next());
                                                  noticies.add(noticiaFutbol);
                                                  redact.setNoticies(noticies);
                                                  System.out.println("redact-->"+redact.toString());
                                                  salir=true;
                                                  break;
                                             case 2:
                                                  NoticiaBasquet noticiaBasquet = new NoticiaBasquet();
                                                  System.out.println("Introdueix el titular la noticia");
                                                  noticiaBasquet.setTitular(sn.next());
                                                  System.out.println("Introdueix el text la noticia");
                                                  noticiaBasquet.setText(sn.next());
                                                  noticies.add(noticiaBasquet);
                                                  redact.setNoticies(noticies);
                                                  System.out.println("redact-->"+redact.toString());
                                                  salir=true;
                                                  break;
                                             case 3:
                                                  NoticiaTenis noticiaTenis = new NoticiaTenis();
                                                  System.out.println("Introdueix el titular la noticia");
                                                  noticiaTenis.setTitular(sn.next());
                                                  System.out.println("Introdueix el text la noticia");
                                                  noticiaTenis.setText(sn.next());
                                                  noticies.add(noticiaTenis);
                                                  redact.setNoticies(noticies);
                                                  System.out.println("redact-->"+redact.toString());
                                                  salir=true;
                                                  break;
                                             case 4:
                                                  NoticiaF1 noticiaF1 = new NoticiaF1();
                                                  System.out.println("Introdueix el titular la noticia");
                                                  noticiaF1.setTitular(sn.next());
                                                  System.out.println("Introdueix el text la noticia");
                                                  noticiaF1.setText(sn.next());
                                                  noticies.add(noticiaF1);
                                                  redact.setNoticies(noticies);
                                                  System.out.println("redact-->"+redact.toString());
                                                  salir=true;
                                                  break;
                                             case 5:
                                                  NoticiaMotociclisme noticiaMotociclisme = new NoticiaMotociclisme();
                                                  System.out.println("Introdueix el titular la noticia");
                                                  noticiaMotociclisme.setTitular(sn.next());
                                                  System.out.println("Introdueix el text la noticia");
                                                  noticiaMotociclisme.setText(sn.next());
                                                  noticies.add(noticiaMotociclisme);
                                                  redact.setNoticies(noticies);
                                                  System.out.println("redact-->"+redact.toString());
                                                  salir=true;
                                                  break;
                                             default:
                                                  System.out.println("No és una opció vàlida");
                                        }

                                   } catch (InputMismatchException e) {
                              System.out.println("Introdueix un nombre vàlid");
                              sn.next();
                         }

                              }

                              break;
                         case 4:
                              System.out.println("Introdueix el redactor la noticia");
                              String  nomRedactor= sn.next();
                              System.out.println("Introdueix el titular la noticia");
                              String  titular= sn.next();
                              redactorList.removeIf(r-> r.getNom().equalsIgnoreCase(nomRedactor) &&
                                      r.getNoticies().stream().filter(n ->
                                              n.getTitular().equalsIgnoreCase(titular)).findFirst().get().getTitular().equalsIgnoreCase(titular));
                              break;
                         case 5:
                              redactorList.forEach(r -> {
                                   System.out.println(r.getNom());
                                   System.out.println(r.getNoticies());
                              });
                              break;
                         case 6:
                              System.out.println("Introdueix el titular de la noticia per calcular la seva puntuació");
                              String  titularPuntuacio= sn.next();
                              break;
                         case 7:
                              System.out.println("Introdueix el titular de la noticia per calcular el seu preu");
                              String  titularPreu= sn.next();


                              break;
                         case 8:
                              salir = true;
                              break;
                         default:
                              System.out.println("No és una opció vàlida");
                    }
               } catch (InputMismatchException e) {
                    System.out.println("Introdueix un nombre vàlid");
                    sn.next();
               }
          }
     }

}
