package timus;

import java.util.Scanner;
import java.util.HashMap;

public class task_1723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();
        String maxSub = s.substring(0, 1);
        int maxCount = 1;

        for (int len = 1; len <= s.length(); len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                String sub = s.substring(i, i + len);
                int count = map.getOrDefault(sub, 0) + 1;
                map.put(sub, count);

                if (count > maxCount || (count == maxCount && len > maxSub.length())) {
                    maxCount = count;
                    maxSub = sub;
                }
            }
        }

        System.out.println(maxSub);
        sc.close();
    }
}