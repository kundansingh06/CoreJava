package prac_string;
public class CharactersSame {
    public static void main(String[] args) {
        System.out.println(isAllCharactersSame(""));
        System.out.println(isAllCharactersSame("aab"));
        System.out.println(isAllCharactersSame("aaa"));
        System.out.println(isAllCharactersSame("11111"));
    }
    public static boolean isAllCharactersSame(String s) {
        for (int i = 1, length = s.length(); i < length; ++i) {
            if (s.charAt(i) != s.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
