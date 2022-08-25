package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CosTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void cos() {
        if (calc.cos(0) ==1 ) {
            System.out.println("Test cos(0) passed!");
        } else {
            System.out.println("Test cos(0) failed!");
        }

    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }
}