/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.criba_eratostenes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class CribaEratostenes {
        public static List<Integer> encontrarPrimos(int n) {
        List<Integer> primos = new ArrayList();
        if (n > 0) {
            boolean[] esPrimo = new boolean[n + 1];
            for (int i = 2; i <= n; i++) {
                esPrimo[i] = true;
            }
            for (int p = 2; p * p <= n; p++) {
                if (esPrimo[p]) {
                    for (int i = p * p; i <= n; i += p) {
                        esPrimo[i] = false;
                    }
                }
            }
            for (int i = 2; i <= n; i++) {
                if (esPrimo[i]) {
                    primos.add(i);
                }
            }
            return primos;

        } else {
            return null;
        }
    }
}
