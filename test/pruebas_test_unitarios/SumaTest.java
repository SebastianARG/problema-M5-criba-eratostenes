/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pruebas_test_unitarios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static pruebas_test_unitarios.Suma.*;

/**
 *
 * @author Sebastian
 */
public class SumaTest {
    
    @Test
    public void suma(int par, int par1){
        var cont = Suma.suma(1, 1);
        assertEquals(2, cont);
    }
    
}
