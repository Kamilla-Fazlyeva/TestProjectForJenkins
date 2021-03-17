import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    private void positiveMathTest() {
        int a = 2;
        int b = 3;
        int actual = a + b;
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    private void negativeMathTest() {
        int a = 2;
        int b = 3;
        int actual = a + b;
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }
}
