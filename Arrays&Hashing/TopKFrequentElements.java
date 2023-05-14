import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] tab, int k) {
        Map<Integer, Integer> mapfrequence = new HashMap<Integer, Integer>();
        for (int number : tab) {
            if (mapfrequence.containsKey(number)) {
                int frequence = mapfrequence.get(number);
                mapfrequence.put(number, frequence + 1);
            } else {
                mapfrequence.put(number, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mapfrequence.entrySet()); // convert map to list
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder())); // sort list by value

        int[] result = new int[k];
        for (int i = 0; i < k && i < list.size(); i++) {
            Map.Entry<Integer, Integer> entry = list.get(i); // get the first k elements
            result[i] = entry.getKey(); // get the key of the element
        }
        return result;
    }

    public static void printlist(int[] tab) {
        for (int number : tab) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] test1 = new int[] { 1, 1, 1, 2, 2, 3 };
        int[] test2 = new int[] { 1 };
        int[] test3 = new int[] { 1, 2 };
        int[] test4 = new int[] { 1, 2, 2, 3, 3, 3 };
        printlist(topKFrequent(test1, 2)); // [1, 2]
        printlist(topKFrequent(test2, 1)); // [1]
        printlist(topKFrequent(test3, 2)); // [1, 2]
        printlist(topKFrequent(test4, 1)); // [3]
    }
}
