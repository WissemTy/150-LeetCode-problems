import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] tab) {
        List<List<String>> result = new ArrayList<>();
        if (tab.length == 0) {
            return result;
        }
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for (String word : tab) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);
            System.out.println(sortedStr);
        }
        return null;
    }

    public static void printlist(List<List<String>> list) {
        for (List<String> list2 : list) {
            for (String string : list2) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] test1 = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        String[] test2 = new String[] { "" };
        String[] test3 = new String[] { "a" };
        String[] test4 = new String[] { "cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc" };
        printlist(groupAnagrams(test1));
        printlist(groupAnagrams(test2));
        printlist(groupAnagrams(test3));
        printlist(groupAnagrams(test4));
    }
}