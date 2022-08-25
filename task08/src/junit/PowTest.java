package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void pow() {
        if (calc.pow(2, 2) ==4 ) {
            System.out.println("Test pow(2,2) passed!");
        } else {
            System.out.println("Test pow(2,2) failed!");
        }

        if (calc.pow(2.2, 2) ==4.84 ) {
            System.out.println("Test pow(2.2,2) passed!");
        } else {
            System.out.println("Test pow(2.2,2) failed!");
        }
    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }
}