package Programas;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContarCaracteresTest {
    @Test
    public void testContarCaracteres() {
        System.out.println("contarCaracteres");
        String str = "Programación";
        char ch = 'a';
        int expResult = 2;
        int result = ContarCaracteres.contarCaracteres(str, ch);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testContarCaracteres2() {
        System.out.println("contarCaracteres");
        String str = "repositorio";
        char ch = 'o';
        int expResult = 3;
        int result = ContarCaracteres.contarCaracteres(str, ch);
        assertEquals(expResult, result);       
    }
}

