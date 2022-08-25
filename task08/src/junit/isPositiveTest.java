package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class isPositiveTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void isPositive() {
        if (calc.isPositive(-1) ==false ) {
            System.out.println("Test isPositive(-1) passed!");
        } else {
            System.out.println("Test isPositive(-1) failed!");
        }

        if (calc.isPositive(1) ==true ) {
            System.out.println("Test isPositive(1) passed!");
        } else {
            System.out.println("Test isPositive(1) failed!");
        }

    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }
}