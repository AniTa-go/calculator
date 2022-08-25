import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class SumTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Test started...");
    }


    // 加法测试
    @Test(dataProvider = "testAddData")
    public void testSum(long a, long b, long expect){
        System.out.println("开始执行testAdd");
        Calculator calculator = new Calculator();
        long result = calculator.sum(a, b);
        Assert.assertEquals(expect, result);
    }

    // 提供了三组测试数据：{数字1, 数字2, 期望值}
// 因为返回类型的Object，所以数组中也可以写其他数据类型，String、int、char、float等
    @DataProvider(name = "testAddData")
    public Object[][] testAddData(){
        Object[][] data = new Object[][]{ {1, 1, 2}, {2, 2, 4}, {3, 3, 5}};
        return data;
    }



    @AfterClass
    public void tearDown() {
        System.out.println("end test");
    }
}