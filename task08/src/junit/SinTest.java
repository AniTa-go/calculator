package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void sin() {
        if (calc.sin(0) ==0 ) {
            System.out.println("Test sin(0) passed!");
        } else {
            System.out.println("Test sin(0) failed!");
        }

    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }
}