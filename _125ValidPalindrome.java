public class _125ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        String alphaString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (alphaString.length() == 0) {
            return true;
        }
        return isPalindromeString(alphaString, 0, alphaString.length() - 1);
    }

    private boolean isPalindromeString(String string, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (string.charAt(start) != string.charAt(end)) {
            return false;
        }
        return isPalindromeString(string, start + 1, end - 1);
    }

    public static void main(String[] args) {
        _125ValidPalindrome solution = new _125ValidPalindrome();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
    }
}
