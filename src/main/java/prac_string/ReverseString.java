package prac_string;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("abc123").equals("321cba"));
        assert reverse2("abc123").equals("321cba");
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String reverse2(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] value = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char temp = value[i];
            value[i] = value[j];
            value[j] = temp;
        }
        return new String(value);
    }
}