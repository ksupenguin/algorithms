public class Binary {
    public static int search(int[] args, int x) {
        int bottom = 0;
        int top = args.length - 1;
        while (top > bottom) {
            int middle = bottom + (top - bottom) / 2;
            if (args[middle] == x) {
                return middle;
            } else if (args[middle] < x) {
                bottom = middle + 1;
            } else {
                top = middle - 1;
            }
        }
        return -1;
    }
}
