/**
 *
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 *
 *
 * posNeg(1, -1, false) → true
 * posNeg(-1, 1, false) → true
 * posNeg(-4, -5, true) → true
 */

public class PosNegTest {
    public static void main(String[] a) {
        PosNeg posNeg = new PosNeg();
        System.out.println(posNeg.posNeg(1, -1, false));
        System.out.println(posNeg.posNeg(-1, 1, false));
        System.out.println(posNeg.posNeg(-4, -5, true));
    }
}

class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }
}