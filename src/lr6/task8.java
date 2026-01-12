package lr6;

public class task8 {
    public static double getAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return (double) sum / nums.length;
    }
}