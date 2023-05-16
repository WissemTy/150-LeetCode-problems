public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        while (leftPointer < rightPointer) {
            int currentCapacity = (rightPointer - leftPointer) * Math.min(height[leftPointer], height[rightPointer]);
            maxWater = Math.max(maxWater, currentCapacity);
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] test1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(test1));
    }
}