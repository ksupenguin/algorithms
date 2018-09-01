import org.junit.Assert;
import org.junit.Test;

public class BinaryTest {
    @Test
    public void test_main() {
        int result = Binary.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 8);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test2_main() {
        int result = Binary.search(new int[]{11, 22, 33, 41, 57, 63, 75, 81, 98, 110}, 8);
        Assert.assertEquals(-1, result);
    }
}
