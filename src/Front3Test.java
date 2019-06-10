/**
 *
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
 *
 *
 * front3("Java") → "JavJavJav"
 * front3("Chocolate") → "ChoChoCho"
 * front3("abc") → "abcabcabc"
 */

public class Front3Test {
    public static void main(String[] a) {
        Front3 front3 = new Front3();
        System.out.println(front3.front3("Java"));
        System.out.println(front3.front3("Chocolate"));
        System.out.println(front3.front3("abc"));
        System.out.println(front3.front3("a"));
        System.out.println(front3.front3(null));
        System.out.println(front3.front3("ab"));
    }
}

class Front3 {
    public String front3(String str) {
        String front = null;
        if (str != null) {
            if (str.length() < 3) {
                front = str;
            } else {
                front = str.substring(0, 3);
            }
            return front + front + front;
        }
        return null;
    }
}