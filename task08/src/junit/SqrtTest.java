package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void sqrt() {
        if (calc.sqrt(4) ==2 ) {
            System.out.println("Test sqrt(4) passed!");
        } else {
            System.out.println("Test sqrt(4) failed!");
        }

    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }


}