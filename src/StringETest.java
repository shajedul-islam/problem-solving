/**
 *
 * Return true if the given string contains between 1 and 3 'e' chars.
 *
 *
 * stringE("Hello") → true
 * stringE("Heelle") → true
 * stringE("Heelele") → false
 */

public class StringETest {
    public static void main(String[] a) {
        StringE stringE = new StringE();
        System.out.println(stringE.stringE("Hello"));
        System.out.println(stringE.stringE("Heelle"));
        System.out.println(stringE.stringE("Heelele"));
    }
}

class StringE {
    public boolean stringE(String str) {
        // solution 1
        /*char[] chars = str.toCharArray();

        int occurance = 0;
        for (char c : chars) {
            if (c == 'e') {
                occurance ++;
            }
        }

        if (occurance >= 1 && occurance <= 3) {
            return true;
        }
        return false;*/

        // solution 2
        int occurance = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                occurance ++;
            }
        }

        return occurance >= 1 && occurance >= 3;
    }
}