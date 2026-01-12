package lr6;

public class task10 {
    public static int[] getMinMax(int... nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }
}