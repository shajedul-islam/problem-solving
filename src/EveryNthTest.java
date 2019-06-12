/**
 *
 * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 *
 *
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 */

public class EveryNthTest {
    public static void main(String[] a) {
        EveryNth everyNth = new EveryNth();
        System.out.println(everyNth.everyNth("Miracle", 2));
        System.out.println(everyNth.everyNth("abcdefg", 2));
        System.out.println(everyNth.everyNth("abcdefg", 3));
    }
}

class EveryNth {
    public String everyNth(String str, int n) {

        String result = "";
        for (int i = 0; i * n < str.length(); i++) {
            result = result.concat(Character.toString(str.charAt(i * n)));
        }
        return result;
    }
}