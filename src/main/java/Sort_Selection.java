public class Sort_Selection {
    public static int[] sortSelection(int[] args) {
        int[] newArgs = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            int max = args[0];
            int maxIndex = 0;
            int index = 0;
            while (index < args.length - i) {
                if (max < args[index]) {
                    max = args[index];
                    maxIndex = index;
                }
                index++;
            }
            newArgs[i] = args[maxIndex];
            System.arraycopy(args, maxIndex + 1, args, maxIndex, args.length - 1 - maxIndex);
        }
        return newArgs;
    }
}
