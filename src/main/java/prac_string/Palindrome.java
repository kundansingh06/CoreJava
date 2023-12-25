package prac_string;
class Palindrome {
    public static void main(String[] args) {
        String[] palindromes = {null, "", "aba", "123321"};
        for (String s : palindromes) {
        	System.out.println(isPalindrome(s) && isPalindromeRecursion(s) && isPalindrome1(s));
        }
        String[] notPalindromes = {"abb", "abc", "abc123"};
        for (String s : notPalindromes) {
            assert !isPalindrome(s) && !isPalindromeRecursion(s) && !isPalindrome1(s);
        }
    }
    public static boolean isPalindrome(String s) {
        return (s == null || s.length() <= 1) || s.equals(new StringBuilder(s).reverse().toString());
    }
    public static boolean isPalindromeRecursion(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    public static boolean isPalindrome1(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
