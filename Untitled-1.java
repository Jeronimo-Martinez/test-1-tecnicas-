/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstjavaproject;

import java.util.Scanner;

/**
 *
 * @author EstudianteLIS
 */
public class FirstJavaProject {

    public static void main(String[] args) {

        String[] list = new String[10];
        list[0] = "arroz";
        list[2] = "frijoles";
        list[3] = "leche";
        list[4] = "platano";
        list[5] = "manzana";
        list[6] = "huevos";
        list[7] = "pan";
        list[8] = "lentejas";
        list[9] = "chicharron";

        String[] new_list = new String[10];
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 10) {
            System.out.println("Ingrese un alimento");
            String alimento = scanner.nextLine();
            System.out.println(alimento);
            int j = 0;
            boolean kiki = false;
            while (j < 10) {
                if (alimento.equals(list[j])) {
                    kiki = true;
                }
                j++;
            }
            if (kiki == true) {
                new_list[i] = alimento;
                i++;
            } else {
                System.out.println("alimento no valido");
            }
            
        }

        System.out.println("Hello World!");
    }
}
