import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] tab) {
        Set<Integer> hashSet = new HashSet<>();
        for (int val : tab) {
            if (hashSet.contains(val)) {
                return true;
            }
            hashSet.add(val);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = new int[] { 1, 2, 3, 1 };
        int[] test2 = new int[] { 1, 2, 3, 4 };
        int[] test3 = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(containsDuplicate(test1)); // true
        System.out.println(containsDuplicate(test2)); // false
        System.out.println(containsDuplicate(test3)); // true
    }
}