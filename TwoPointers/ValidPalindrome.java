public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {

            int leftChar = Character.toLowerCase(s.charAt(left));
            int rightChar = Character.toLowerCase(s.charAt(right));
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(test1));
    }
}
