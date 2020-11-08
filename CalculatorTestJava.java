/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.calculator.Calculator;
import com.mycompany.calculator.Operaciones;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafa
 */
public class CalculatorTestJava {
    Operaciones calculator1 = new Operaciones();
    
    @Test
    public void testSuma1() {
        assertEquals(5, calculator1.Suma(2,3));
    }
    
    @Test
    public void testSuma2() {
        assertEquals(6, calculator1.Suma(3,3));
    }
    
    @Test
    public void testResta1() {
        assertEquals(2, calculator1.Resta(5,3));
    }
    
    @Test
    public void testResta2() {
        assertEquals(3, calculator1.Resta(6,3));
    }
}
