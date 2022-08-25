package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void sub_long() {
        if (calc.sub(8888, 8888) == 0) {
            System.out.println("Test sub(long) passed!");
        } else {
            System.out.println("Test sub(long) failed!");
        }
    }

    @Test
    public void sub_double() {
        if (calc.sub(8.8, 6.66) == 2.14) {
            System.out.println("Test sub(double) passed!");
        } else {
            System.out.println("Test sub(double) failed!");
        }
    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }

}