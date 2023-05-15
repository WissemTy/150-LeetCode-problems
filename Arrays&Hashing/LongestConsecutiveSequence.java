import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] tab) {
        int longestConsecutiveSequence = 1;
        if (tab.length == 0) {
            return 0;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : tab) {
            hashSet.add(value);
        }
        for (int value : tab) {
            if (!hashSet.contains(value - 1)) {
                int consecutiveSequence = 1;
                while (hashSet.contains(value + 1)) {
                    value++;
                    consecutiveSequence++;
                }
                longestConsecutiveSequence = Math.max(consecutiveSequence, longestConsecutiveSequence);
            }
        }
        return longestConsecutiveSequence;
    }

    public static void main(String[] args) {
        int[] test1 = new int[] { 100, 4, 200, 1, 3, 2 };
        int[] test2 = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        int[] test3 = new int[] {};
        System.out.println(longestConsecutive(test1)); // 4
        System.out.println(longestConsecutive(test2)); // 9
        System.out.println(longestConsecutive(test3));
    }
}
