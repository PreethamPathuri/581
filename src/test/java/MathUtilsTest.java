import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest {
    private MathUtils math;

    @Before
    public void setUp() {
        math = new MathUtils();
    }

    @After
    public void tearDown() {
        math = null;
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(8, math.add(5, 3));
        Assert.assertEquals(-8, math.add(-5, -3)); // Testing negative numbers
        Assert.assertEquals(0, math.add(0, 0)); // Testing zero
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(2, math.subtract(5, 3));
        Assert.assertEquals(-8, math.subtract(-5, 3)); // Testing negative numbers
        Assert.assertEquals(0, math.subtract(5, 5)); // Testing zero
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(15, math.multiply(5, 3));
        Assert.assertEquals(-15, math.multiply(5, -3)); // Testing negative numbers
        Assert.assertEquals(0, math.multiply(5, 0)); // Testing multiplication by zero
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(1.6666666666666667, math.divide(5, 3), 0.0001); // Delta for double comparison
        Assert.assertEquals(-1.0, math.divide(5, 0), 0.0001); // Testing division by zero
        Assert.assertEquals(2.5, math.divide(5, 2), 0.0001); // Testing non-integer division
    }
}
