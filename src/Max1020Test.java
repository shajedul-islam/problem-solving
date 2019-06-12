/**
 *
 *
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
 *
 *
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */

public class Max1020Test {
    public static void main(String[] a) {
        Max1020 max1020 = new Max1020();
            System.out.println(max1020.max1020(11, 19));
            System.out.println(max1020.max1020(19, 11));
            System.out.println(max1020.max1020(11, 9));
            System.out.println(max1020.max1020(11, 11));
        System.out.println(max1020.max1020(10, 21));
    }
}

class Max1020 {
    public int max1020(int a, int b) {

        // solution 1
        /*boolean is1020A = a >= 10 && a <= 20;
        boolean is1020B = b >= 10 && b <= 20;

        if (is1020A && is1020B) {
            return a > b ? a : b;
        } else if (is1020A) {
            return a;
        } else if (is1020B) {
            return b;
        } else {
            return 0;
        }*/

        // solution 2
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        } else {
            return 0;
        }

    }
}