package lr6;

public class task3 {
    public static int max(int... nums) {
        int m = nums[0];
        for (int n : nums) if (n > m) m = n;
        return m;
    }

    public static int min(int... nums) {
        int m = nums[0];
        for (int n : nums) if (n < m) m = n;
        return m;
    }

    public static double avg(int... nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return (double) sum / nums.length;
    }
}