import java.util.Arrays;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] ListCharS = s.toCharArray();
        char[] ListCharT = t.toCharArray();
        Arrays.sort(ListCharS);
        Arrays.sort(ListCharT);

        return Arrays.equals(ListCharS, ListCharT);

    }

    public static void main(String[] args) {
        String test1 = "anagram";
        String test2 = "nagaram";
        String test3 = "rat";
        String test4 = "car";
        String test5 = "aacc";
        String test6 = "ccac";
        System.out.println(validAnagram(test1, test2)); // true
        System.out.println(validAnagram(test3, test4)); // false
        System.out.println(validAnagram(test5, test6)); // false
    }
}
