/**
 *
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
 *
 *
 * backAround("cat") → "tcatt"
 * backAround("Hello") → "oHelloo"
 * backAround("a") → "aaa"
 */

public class BackAroundTest {
    public static void main(String[] a) {
        BackAround backAround = new BackAround();
        System.out.println(backAround.backAround("cat"));
        System.out.println(backAround.backAround("Hello"));
        System.out.println(backAround.backAround("a"));
        System.out.println(backAround.backAround(null));
    }
}

class BackAround {
    public String backAround(String str) {
        return str == null ? str : str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

}