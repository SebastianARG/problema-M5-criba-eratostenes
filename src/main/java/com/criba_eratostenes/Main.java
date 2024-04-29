package com.criba_eratostenes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        boolean control = true;
        List<Integer> numeros = new ArrayList();
        do {
            System.out.print("Dime un número mayor a cero para encontrar los "
                    + "numeros primos que hay hasta ese número:\n>");
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                sc.nextLine();
                if (valor > 0) {
                    control = false;
                } else {
                    System.out.println("Valor negativo");
                }
            } else {
                sc.nextLine();
                System.out.println("Lo siento no has colcado un valor válido");
            }
        } while (control);
        
        numeros = CribaEratostenes.encontrarPrimos(valor);
        
        System.out.println("Los números primos hasta el número " + valor + " son: ");
        System.out.println(numeros);
//        for (Integer numero : numeros) {
//            System.out.println("- " + numero);
//        }

    }
}
