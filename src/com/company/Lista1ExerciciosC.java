package com.company;

import java.util.Scanner;

public class Lista1ExerciciosC {
    public  static  void  main ( String [] args ) {
        Scanner sc =  new  Scanner ( System . in);
        int base, altura, area;
        System.out.println ( " Digite base da sala: " );
        base = sc . nextInt ();
        System.out.println ( " Digite altura da sala: " );
        altura = sc . nextInt ();
        area = base * altura;
        System.out.println ( " A area da sala é "  + area);
    }
}


