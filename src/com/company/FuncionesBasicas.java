package com.company;

import java.util.Scanner;

public class FuncionesBasicas{

    public static void suma(){
        Scanner in = new Scanner(System.in);

        double valor1 =0, valor2 = 0, resultado= 0;


        System.out.println("\tOPERACION SUMA");
        System.out.println("\tIngrese sus valores...... VALIDO PARA 2 VALORES");
        System.out.println("Valor1  : "); valor1 = in.nextInt();
        System.out.println("Valor2  : "); valor2 = in.nextInt();


        resultado= valor1  +  valor2;


        System.out.println("EL RESULTADO DE LA OPERACION " + valor1 + " + "+ valor2 + " ES: "+ resultado);
    }


    public static void resta(){
        Scanner in = new Scanner(System.in);

        double valor1 =0, valor2 = 0, resultado= 0;

        System.out.println("\tOPERACION RESTA");
        System.out.println("\tIngrese sus valores...... VALIDO PARA 2 VALORES");
        System.out.println("Valor1  : "); valor1 = in.nextInt();
        System.out.println("Valor2  : "); valor2 = in.nextInt();


        resultado= valor1  -  valor2;


        System.out.println("EL RESULTADO DE LA OPERACION " + valor1 + " - "+ valor2 + " ES: "+ resultado);
    }


    public static void multiplicacion(){
        Scanner in = new Scanner(System.in);

        double valor1 =0, valor2 = 0, resultado= 0;

        System.out.println("\tOPERACION Multiplicacion");
        System.out.println("\tIngrese sus valores...... VALIDO PARA 2 VALORES");
        System.out.println("Valor1  : "); valor1 = in.nextInt();
        System.out.println("Valor2  : "); valor2 = in.nextInt();

        resultado= valor1  *  valor2;


        System.out.println("EL RESULTADO DE LA OPERACION " + valor1 + " * "+ valor2 + " ES: "+ resultado);
    }


    public static void division(){
        Scanner in = new Scanner(System.in);

        double valor1 =0, valor2 = 0, resultado= 0;


        System.out.println("\tOPERACION DIVISION");
        System.out.println("\tIngrese sus valores...... VALIDO PARA 2 VALORES");
        System.out.println("Valor1  : "); valor1 = in.nextInt();
        System.out.println("Valor2  : "); valor2 = in.nextInt();


        resultado= valor1  /  valor2;


        System.out.println("EL RESULTADO DE LA OPERACION " + valor1 + " / "+ valor2 + " ES: "+ resultado);
    }
}