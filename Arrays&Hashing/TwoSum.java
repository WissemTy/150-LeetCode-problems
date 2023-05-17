import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int difference = target - value;

            if (hashMap.containsKey(difference)) {
                return new int[] {hashMap.get(difference), i};
            }

            hashMap.put(value, i); // value = key, i = value
        }
        return new int[]{};
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[] test1 = new int[]{ 2, 7, 11, 15 };
        int[] test2 = new int[]{ 3, 2, 4 };
        int[] test3 = new int[]{ 3, 3 };
        int[] result = twoSum(test1, 9); // [0, 1]
        int[] result2 = twoSum(test2, 6); // [1, 2]
        int[] result3 = twoSum(test3, 6); // [0, 1]
        printList(result);
        printList(result2);
        printList(result3);
    }
}
