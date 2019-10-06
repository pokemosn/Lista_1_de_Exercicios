package com.company;

import java.util.Scanner;

public class Lista1ExerciciosH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario,reajuste,salariof;
        System.out.println("Salario do funcionario:");
        salario = sc.nextDouble();
        System.out.println("Valor de Reajuste:");
        reajuste = sc.nextDouble();
        salariof = salario + (salario * reajuste);
        System.out.println("O valor do salario reajustado é: " + salariof);

}}
