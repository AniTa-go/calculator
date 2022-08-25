package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void Mult_long() {
        if (calc.mult(2, 2) == 4) {
            System.out.println("Test sub(long) passed!");
        } else {
            System.out.println("Test sub(long) failed!");
        }
    }

    @Test
    public void Mult_double() {
        if (calc.mult(2.20, 2.11) == 4.642) {
            System.out.println("Test sub(double) passed!");
        } else {
            System.out.println("Test sub(double) failed!");
        }
    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }
}