package com.company;
import java.util.Scanner;
public class FuncionesAvanzadas {

    public static void RaizCuadrada(){
        Scanner in = new Scanner(System.in);

        double valor1 = 0, resultado = 0;

        System.out.println("\tOPERACION RAIZ CUADRADA");
        System.out.println("Digite el numero al que le quiere encontrar la RAIZ CUADRADA: ");valor1 = in.nextInt();


        resultado = Math.sqrt(valor1);


        System.out.println("LA RAIZ CUADRADA DE " + valor1 + " ES:  "+ resultado);
    }


    public static void Potencia(){
        Scanner in = new Scanner(System.in);

        double base = 0, exponente = 0, resultado = 0;

        System.out.println("\t OPERACION CALCULAR POTENCIA");
        System.out.println("Cual es el valor BASE: "); base = in.nextInt();
        System.out.println("Cual es el valor del EXPONENTE: "); exponente = in.nextInt();


        resultado = Math.pow(base, exponente);


        System.out.println("RESULTADO DE OPERACION POTENCIA: "+ resultado);
    }


    public static void Seno(){
        Scanner in = new Scanner(System.in);

        double valor1 = 0, resultado = 0;

        System.out.println("\tOPERACION SENO");
        System.out.println("DIGITE UN VALOR PARA REALIZAR LA OPERACION: "); valor1 = in.nextInt();


        valor1 = Math.toRadians(valor1);
        resultado = Math.sin(valor1);


        System.out.println("EL SENO DE: " + valor1 + "ES DE: "+ resultado);
    }


    public static void Coseno(){
        Scanner in = new Scanner(System.in);

        double valor1 = 0,  resultado = 0;


        System.out.println("\t OPERACION COSENO");
        System.out.println("DIGITE UN VALOR PARA REALIZAR LA OPERACION: "); valor1 = in.nextInt();


        valor1 = Math.toRadians(valor1);
        resultado = Math.cos(valor1);


        System.out.println("EL COSENO DE: " + valor1 + "ES DE: "+ resultado);
    }

    public static void Tangente(){
        Scanner in = new Scanner(System.in);

        double valor1 = 0, resultado = 0;


        System.out.println("\t OPERACION TANGENTE");
        System.out.println("DIGITE UN VALOR PARA REALIZAR LA OPERACION: "); valor1 = in.nextInt();


        valor1 = Math.toRadians(valor1);
        resultado = Math.tan(valor1);


        System.out.println("LA TANGENTE DE: " + valor1 + "ES DE: "+ resultado);
    }
}
