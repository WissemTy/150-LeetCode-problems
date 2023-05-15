import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) {
            return result;
        }
        Map<String, List<String>> groupeOfAnagrams = new HashMap<>();
        for (String word : strs) {
            String sortedStr = sortString(word);
            if (!groupeOfAnagrams.containsKey(sortedStr)) {
                groupeOfAnagrams.put(sortedStr, new ArrayList<>());
                groupeOfAnagrams.get(sortedStr).add(word);
            } else {
                groupeOfAnagrams.get(sortedStr).add(word);
            }
        }
        for (List<String> anagramList : groupeOfAnagrams.values()) {
            result.add(anagramList);
        }
        return result;
    }

    public static String sortString(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void printList(List<List<String>> list) {
        for (List<String> anagramList : list) {
            System.out.print("[");
            for (int i = 0; i < anagramList.size(); i++) {
                System.out.print(anagramList.get(i));
                if (i < anagramList.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] test1 = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        String[] test2 = new String[] { "" };
        String[] test3 = new String[] { "a" };
        printList(groupAnagrams(test1));
        printList(groupAnagrams(test2));
        printList(groupAnagrams(test3));

    }
}