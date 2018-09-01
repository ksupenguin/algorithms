public class QuickSort {

    public static void qsort(int[] args) {
        quickSort(args, 0, args.length - 1);
    }

    private static void quickSort(int[] args, int bottom, int top) {
        if (args.length < 2 || bottom >= top) {
            return;
        }
        int middle = args[bottom];
        int i = bottom;
        int j = top;
        while (i <= j) {
            while (args[i] < middle) {
                i++;
            }
            while (args[j] > middle) {
                j--;
            }
            if (i <= j) {
                int temp = args[j];
                args[j] = args[i];
                args[i] = temp;
                i++;
                j--;
            }
        }
        if (bottom < j) {
            quickSort(args, bottom, j);
        }
        if (top > i) {
            quickSort(args, i, top);
        }
    }
}
