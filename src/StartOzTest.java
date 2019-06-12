/**
 *
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 *
 *
 * startOz("adelbc") → "abc"
 * startOz("adelHello") → "aHello"
 * startOz("adedbc") → "adedbc"
 */

public class StartOzTest {
    public static void main(String[] a) {
        StartOz startOz = new StartOz();
        System.out.println(startOz.startOz("ozymandias"));
        System.out.println(startOz.startOz("bzoo"));
        System.out.println(startOz.startOz("oxx"));
    }
}

class StartOz {
    public String startOz(String str) {
        if (str.length() >= 2) {
            if (str.startsWith("oz")) {
                return "oz";
            } else {
                if (str.charAt(0) == 'o') {
                    return "o";
                } else if (str.charAt(1) == 'z') {
                        return "z";
                } else {
                    return "";
                }
            }
        }
        return str;
    }
}