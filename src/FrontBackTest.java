/**
 *
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */

public class FrontBackTest {
    public static void main(String[] a) {
        FrontBack frontBack = new FrontBack();
        System.out.println(frontBack.frontBack("code"));
        System.out.println(frontBack.frontBack("a"));
        System.out.println(frontBack.frontBack("ab"));
        System.out.println(frontBack.frontBack(null));
    }
}

class FrontBack {
    public String frontBack(String str) {
        return str != null && str.length() > 1 ?
                str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0) : str;
    }
}