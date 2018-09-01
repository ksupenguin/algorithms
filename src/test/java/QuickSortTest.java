import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
    @Test
    public void test_main() {
        int[] arr = new int[]{3, 6, 2, 7, 1, 0, 5, 9};
        QuickSort.qsort(arr);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 5, 6, 7, 9}, arr);
    }

    @Test
    public void test_main2() {
        int[] arr = new int[]{0, 1, 2, 3, 5, 6, 7, 9};
        QuickSort.qsort(arr);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 5, 6, 7, 9}, arr);
    }
}
