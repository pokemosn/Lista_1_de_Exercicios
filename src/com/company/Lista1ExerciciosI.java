package com.company;

import java.util.Scanner;

public class Lista1ExerciciosI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor,desconto,presof;
        System.out.println("Valor de compra:");
        valor = sc.nextDouble();
        System.out.println("Percentual de descomto:");
        desconto = sc.nextDouble();
        presof = valor - (valor * desconto);
        System.out.println("O valor do salario reajustado é: " + presof);
}}
