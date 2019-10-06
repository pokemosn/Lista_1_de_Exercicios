package com.company;

import java.util.Scanner;

public class Lista1ExerciciosF {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double preso, presof;
            int numero;
            System.out.println("Digite o numero de produtos:");
            numero = sc.nextInt();
            System.out.println("Digite o preso do produto:");
            preso = sc.nextDouble();
            presof = numero * preso;
            System.out.println("o valor final da compra é:" + presof);
        }
}
