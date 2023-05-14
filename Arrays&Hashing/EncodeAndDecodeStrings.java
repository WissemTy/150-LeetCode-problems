import java.util.List;
import java.util.ArrayList;

public class EncodeAndDecodeStrings {
    public static String encode(List<String> listStr) {
        /*
         * @param strings: a list of strings
         * 
         * @return: Encodes a list of strings to a single string
         */
        String encodedStr = "";
        for (String str : listStr) {
            encodedStr += str.length() + "#" + str;
        }
        return encodedStr;
    }

    public static List<String> decode(String strs) {
        /*
         * @param str: A string
         * 
         * @return: decodes a single string to a list of strings
         */
        List<String> listStrs = new ArrayList<>();
        int i = 0;

        while (i < strs.length()) {
            if (strs.charAt(i) == '#') {
                int lengthOfNextWord = Character.getNumericValue(strs.charAt(i - 1));
                listStrs.add(strs.substring(i + 1, i + lengthOfNextWord + 1));
                i += lengthOfNextWord;
            }
            i++;
        }
        return listStrs;
    }

    public static void main(String[] args) {
        List<String> test1 = new ArrayList<String>();
        test1.add("lint");
        test1.add("code");
        test1.add("3#love");
        test1.add("you");
        System.out.println(encode(test1));
        System.out.println(decode(encode(test1)));
        List<String> test2 = new ArrayList<String>();
        test2.add("le");
        test2.add("mot");
        test2.add("S3##cret");
        test2.add("est");
        test2.add("4#bien");
        System.out.println(encode(test2));
        System.out.println(decode(encode(test2)));
    }
}