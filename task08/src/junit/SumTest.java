package junit;

import org.junit.Test;

import org.junit.BeforeClass;
import org.junit.AfterClass;

import static org.junit.Assert.*;

public class SumTest {

    private static Calculator calc;
    @BeforeClass //在所有方法运行之前运行
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void Sum_long() {
        if (calc.sum(8888, 8888) == 17776) {
            System.out.println("Test sum(long) passed!");
        } else {
            System.out.println("Test sum(long) failed!");
        }
    }

    @Test
    public void Sum_double() {
        if (calc.sum(8.88, 6.6) == 15.54) {
            System.out.println("Test sum(double) passed!");
        } else {
            System.out.println("Test sum(double) failed!");
        }

    }

    @AfterClass  ////在所有方法运行之后运行
    public static void tearDown() {System.out.println("Test done.");
    }

}