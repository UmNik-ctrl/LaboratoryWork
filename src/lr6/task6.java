package lr6;

public class task6 {
    public static int[] getFirstElements(int[] array, int n) {
        if (n >= array.length) {
            return array.clone();
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = array[i];
        }
        return result;
    }
}