/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.criba_eratostenes;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Sebastian
 */
public class CribaEratostenesTest {
    
    public CribaEratostenesTest() {
    }
    
    @Test
    public void encontrarPrimos(){
        List<Integer> numeros = new ArrayList();
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        assertEquals(numeros, CribaEratostenes.encontrarPrimos(10));
        numeros.add(11);
        numeros.add(13);
        numeros.add(17);
        numeros.add(19);
        assertEquals(numeros, CribaEratostenes.encontrarPrimos(20));
        numeros.add(23);
        assertEquals(numeros, CribaEratostenes.encontrarPrimos(25));
    }
        
}
