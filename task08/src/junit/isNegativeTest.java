package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class isNegativeTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void isNegative() {
        if (calc.isNegative(-1) ==true ) {
            System.out.println("Test isNegative(-1) passed!");
        } else {
            System.out.println("Test isNegative(-1) failed!");
        }

        if (calc.isNegative(1) ==false ) {
            System.out.println("Test isNegative(1) passed!");
        } else {
            System.out.println("Test isNegative(1) failed!");
        }

    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }
}