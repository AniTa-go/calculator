package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void Div_long() {
        if (calc.div(2, 2) == 1) {
            System.out.println("Test Div(long) passed!");
        } else {
            System.out.println("Test Div(long) failed!");
        }
    }

    @Test
    public void Div_double() {
        if (calc.div(3, 1.5) == 2) {
            System.out.println("Test Div(double) passed!");
        } else {
            System.out.println("Test Div(double) failed!");
        }
    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }
}