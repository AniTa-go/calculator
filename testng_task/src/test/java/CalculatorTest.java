import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    public class groups {
        public static final String bug = "bug";
        public static final String pass = "pass";
    }

    @BeforeClass(groups = "bug")
    public void setUp() {
        System.out.println("Test started...");
        calculator=new Calculator();
    }

    @AfterClass(groups = "bug")
    public void tearDown() {
        System.out.println("end test");
    }



    @Test(groups = "pass")
    public void testSum() {
        long result = calculator.sum(1, 1);
        Assert.assertEquals(2, result);
    }

    @Test(groups = "pass")
    public void testSum_double() {
        double result = calculator.sum(1.1, 1);
        Assert.assertEquals(2.1, result);
    }

    @Test(groups = "pass")
    public void testSub_long() {
        //Calculator calculator = new Calculator();
        long result = calculator.sub(1, 1);
        Assert.assertEquals(0, result);
    }

    @Test(groups = "pass")
    public void testSub_double() {
        //Calculator calculator = new Calculator();
        double result = calculator.sub(1.5, 1);
        Assert.assertEquals(0.5, result);
    }

    @Test(groups = "pass")
    public void testMult_long() {
        //Calculator calculator = new Calculator();
        long result = calculator.mult(2, 1);
        Assert.assertEquals(2, result);
    }

    @Test(groups = "pass")
    public void testMult_double() {
        //Calculator calculator = new Calculator();
        double result = calculator.mult(1.0, 1);
        Assert.assertEquals(1, result);
    }

    @Test(groups = "pass")
    public void testDiv_long() {
        //Calculator calculator = new Calculator();
        long result = calculator.div(2, 1);
        Assert.assertEquals(2, result);
    }

    @Test(groups = "pass")
    public void testDiv_double() {
        //Calculator calculator = new Calculator();
        double result = calculator.div(3.0, 2);
        Assert.assertEquals(1.5, result);
    }

    @Test(groups = "pass")
    public void testPow() {
        //Calculator calculator = new Calculator();
        double result = calculator.pow(2, 2);
        Assert.assertEquals(4, result);
    }

    @Test(groups = "pass")
    public void testSqrt() {
        //Calculator calculator = new Calculator();
        double result = calculator.sqrt(4);
        Assert.assertEquals(2, result);
    }

    @Test(groups = "pass")
    public void testTg() {
        //Calculator calculator = new Calculator();
        double result = calculator.tg(45);
        Assert.assertEquals(1, result);
    }

    @Test(groups = "pass")
    public void testCtg() {
       // Calculator calculator = new Calculator();
        double result = calculator.ctg(45);
        Assert.assertEquals(1, result);
    }

    @Test(groups = "bug")
    public void testCos() {
        double d=Math.toRadians(0);
        Assert.assertEquals(calculator.cos(d),1,"cos(0)=1");
    }

    @Test(groups = "bug")
    public void testSin() {
        double result = calculator.sin(0);
        Assert.assertEquals(1, result);
    }

    @Test(groups = "pass")
    public void testIsPositive() {
        //Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(2);
        Assert.assertEquals(true, result);
    }

    @Test(groups = "pass")
    public void testIsNegative() {
        //Calculator calculator = new Calculator();
        boolean result = calculator.isNegative(2);
        Assert.assertEquals(false, result);
    }
}