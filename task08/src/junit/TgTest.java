package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TgTest {

    private static Calculator calc;
    @BeforeClass
    public static void init() {
        System.out.println("Test started...");
        calc=new Calculator();
    }

    @Test
    public void Tg() {
        if (calc.tg(45) ==1 ) {
            System.out.println("Test tg(45) passed!");
        } else {
            System.out.println("Test tg(45) failed!");
        }

    }

    @AfterClass
    public static void tearDown() {System.out.println("Test done.");
    }
}