public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }

        rightProduct[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i+1] * nums[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{ 1, 2, 3, 4 };
        int[] result = productExceptSelf(test1); // [24, 12, 8, 6]
        printList(result);
    }
}
