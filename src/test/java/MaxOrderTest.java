import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxOrderTest {
    @Test
    public void test1(){
        MaxOrder maxOrder = new MaxOrder();
        long res =  maxOrder.getResult(8);
        assertEquals(8, res);
    }

    @Test
    public void test2(){
        MaxOrder maxOrder = new MaxOrder();
        long res =  maxOrder.getResult(12);
        assertEquals(12, res);
    }

    @Test
    public void test3(){
        MaxOrder maxOrder = new MaxOrder();
        long res =  maxOrder.getResult(54);
        assertEquals(49, res);
    }

    @Test
    public void test4(){
        MaxOrder maxOrder = new MaxOrder();
        long res =  maxOrder.getResult(31);
        assertEquals(29, res);
    }

    @Test
    public void test5(){
        MaxOrder maxOrder = new MaxOrder();
        long res =  maxOrder.getResult(123);
        assertEquals(123, res);
    }

    @Test
    public void test6(){
        MaxOrder maxOrder = new MaxOrder();
        long res =  maxOrder.getResult(132);
        assertEquals(129, res);
    }

    @Test
    public void test7(){
        MaxOrder maxOrder = new MaxOrder();
        long res =  maxOrder.getResult(1234);
        assertEquals(1234, res);
    }

    @Test
    public void test8(){
        MaxOrder maxOrder = new MaxOrder();
        long res =  maxOrder.getResult(3000);
        assertEquals(2999, res);
    }
}
