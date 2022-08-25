package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CtgTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void ctg() {
        if (calc.ctg(45) ==1 ) {
            System.out.println("Test ctg(45) passed!");
        } else {
            System.out.println("Test ctg(45) failed!");
        }

    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }

}