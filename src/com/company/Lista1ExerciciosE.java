package com.company;

import java.util.Scanner;

public class Lista1ExerciciosE {
    public  static  void  main ( String [] args ) {
        Scanner sc = new  Scanner ( System . in);
        double total , comissaoo;
        System.out.println ( " digite o valor total em vendas: " );
        total = sc . nextDouble ();
        comissaoo = total *  0.10 ;
        System.out.println ( " Uma operação do funcionamento é: "  + comissaoo);

    }
}
