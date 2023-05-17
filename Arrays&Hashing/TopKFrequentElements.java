import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] tab, int k) {
        Map<Integer, Integer> mapFrequency = new HashMap<>();
        for (int number : tab) {
            if (mapFrequency.containsKey(number)) {
                int frequency = mapFrequency.get(number);
                mapFrequency.put(number, frequency + 1);
            } else {
                mapFrequency.put(number, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mapFrequency.entrySet());
        System.out.println("Before sorting:");
        printList1(list);
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder())); // sort list by value
        System.out.println("After sorting:");
        printList1(list);

        int[] result = new int[k];
        for (int i = 0; i < k && i < list.size(); i++) {
            Map.Entry<Integer, Integer> entry = list.get(i); // get the first k elements
            result[i] = entry.getKey(); // get the key of the element
        }
        return result;
    }

    public static void printList1(List<Map.Entry<Integer, Integer>> list) {
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    public static void printList(int[] tab) {
        for (int number : tab) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] test1 = new int[] { 2, 2, 2, 1, 2, 2, 3, 1, 1, 1};
        // int[] test2 = new int[] { 1 };
        // int[] test3 = new int[] { 1, 2 };
        // int[] test4 = new int[] { 1, 2, 2, 3, 3, 3 };
        printList(topKFrequent(test1, 2)); // [1, 2]
        // printList(topKFrequent(test2, 1)); // [1]
        // printList(topKFrequent(test3, 2)); // [1, 2]
        // printList(topKFrequent(test4, 1)); // [3]
    }
}
