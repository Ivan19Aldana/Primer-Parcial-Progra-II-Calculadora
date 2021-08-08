package com.company;
import java.util.Scanner;

public class VolverMenu {

    public static boolean backMenu() {
        Scanner in = new Scanner(System.in);
        int option = 0;
        System.out.println(
                "\n Si quiere regresar al menu oprima el numero ' 1 ' " +
                        "\n Si quiere abandonar o Salir del Programa, oprima cualquier numero" );
        option = in.nextInt();
        if (option== 1) {
            return true;
        } else {
            System.out.println(" SALIR DEL POGRAMA...");
            return false;
        }
    }
}