package com.company;
import java.util.Scanner;


public class MenuPrincipal {

    public static void menu(){
        int opcion= 0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\nPARCIAL I DE PROGRAMACION II\n");
            System.out.println("\n*****BIENVENID@ A LA CALCULADORA VIRTUAL*****\n");
            System.out.println("OPERACIONES BASICAS CON DOS DATOS: \n" +
                    " 1.Sumar\n" +
                    " 2.Restar\n" +
                    " 3.Multiplicar\n" +
                    " 4.Dividir\n" );
            System.out.println( "OPERACIONES AVANZADAS: \n" +
                    " 5.Raiz Cuadrada\n" +
                    " 6.Potencia\n" +
                    " 7.Seno\n" +
                    " 8.Coseno\n" +
                    " 9.Tangente\n" );
            System.out.println( "Precione el 0 para abandonar el programa");
            System.out.println("Inserte  su opcion : ");
            opcion = in.nextInt();

            switch(opcion){
                case 1 :
                     com.company.FuncionesBasicas.suma();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }

                case 2 :
                    com.company.FuncionesBasicas.resta();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 3 :
                    com.company.FuncionesBasicas.multiplicacion();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 4 :
                    com.company.FuncionesBasicas.division();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 5 :
                    FuncionesAvanzadas.RaizCuadrada();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 6 :
                   FuncionesAvanzadas.Potencia();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 7 :
                   FuncionesAvanzadas.Seno();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 8 :
                   FuncionesAvanzadas.Coseno();
                    if (VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 9 :
                    FuncionesAvanzadas.Tangente();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 0 : System.out.println("FINALIZAR SISTEMA...................."); break;
                default: System.out.println("ERROR.....................INSERTE UNA OPCION VALIDA");

            }
        }while (opcion!=0);
    }
}
