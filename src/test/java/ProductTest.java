import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    @Test
    public void test() {
        Product product = new Product(1, 0, 0, 0, 0);
        int total = product.total();
        Assert.assertEquals(100, total);

    }

    @Test
    public void test1() {
        Product product = new Product(1, 1, 0, 0, 0);
        int total = product.total();
        Assert.assertEquals(190, total);

    }

    @Test
    public void test2() {
        Product product = new Product(1, 1, 1, 0, 0);
        int total = product.total();
        Assert.assertEquals(270, total);

    }

    @Test
    public void test3() {
        Product product = new Product(1, 1, 1, 1, 0);
        int total = product.total();
        Assert.assertEquals(320, total);

    }

    @Test
    public void test4() {
        Product product = new Product(1, 1, 1, 1, 1);
        int total = product.total();
        Assert.assertEquals(375, total);

    }

}
