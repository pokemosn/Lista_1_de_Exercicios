package com.company;

import java.util.Scanner;

public class Lista1ExerciciosD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio,area,constante;
        System.out.println("Raio do ciculo:");
        raio = sc.nextDouble();
        raio = raio * raio;
        constante = 3.14;
        area = constante * raio;
        System.out.println("A area do circulo é:"+area);
    }
}

