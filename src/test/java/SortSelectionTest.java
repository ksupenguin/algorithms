import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortSelectionTest {
    @Test
    public void test_main() {
        int[] result = Sort_Selection.sortSelection(new int[]{6, 9, 1, 4, 3, 7, 2, 8, 0});
        System.out.println(Arrays.toString(result));
        Assert.assertArrayEquals(new int[]{9, 8, 7, 6, 4, 3, 2, 1, 0}, result);
    }
}
