/**
 *
 *
 * Given three int values, a b c, return the largest.
 *
 *
 * intMax(1, 2, 3) → 3
 * intMax(1, 3, 2) → 3
 * intMax(3, 2, 1) → 3
 */

public class IntMaxTest {
    public static void main(String[] a) {
        IntMax intMax = new IntMax();
        System.out.println(intMax.intMax(1, 2, 3));
        System.out.println(intMax.intMax(1, 3, 2));
        System.out.println(intMax.intMax(3, 2, 1));
    }
}

class IntMax {
    public int intMax(int a, int b, int c) {
        int max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}