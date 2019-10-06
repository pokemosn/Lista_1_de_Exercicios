package com.company;

import java.util.Scanner;

public class Lista1ExerciciosG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comprimento,altura,area,area2;
        System.out.println("Digite a altura:");
        altura = sc.nextDouble();
        System.out.println("Digite o comprimento:");
        comprimento = sc.nextDouble();
        area = altura * comprimento;


        System.out.println("A medida da sala é "+ area +" m²");

}}
