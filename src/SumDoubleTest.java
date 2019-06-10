/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 *
 * sumDouble(1, 2) → 3
 * sumDouble(3, 2) → 5
 * sumDouble(2, 2) → 8
 */

public class SumDoubleTest {
    public static void main(String[] a) {
        SumDouble sumDouble = new SumDouble();
        System.out.println(sumDouble.sumDouble(1,2));
        System.out.println(sumDouble.sumDouble(3,2));
        System.out.println(sumDouble.sumDouble(2,2));
    }
}

class SumDouble {
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        else return a + b;
    }
}
