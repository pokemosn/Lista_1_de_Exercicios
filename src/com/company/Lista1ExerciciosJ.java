package com.company;

import java.util.Scanner;

public class Lista1ExerciciosJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dolar;
        double real,mut;
        System.out.println("Valor em dolar: ");
        dolar = sc.nextInt();
        real = 4.17;
        mut = real * dolar;
        System.out.println("o valor de "+ dolar + "dolares é igual a"+ mut);
}}
