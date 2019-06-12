/**
 *
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 *
 *
 * deleteDel("adelbc") → "abc"
 * deleteDel("adelHello") → "aHello"
 * deleteDel("adedbc") → "adedbc"
 */

public class DeleteDelTest {
    public static void main(String[] a) {
        DeleteDel deleteDel = new DeleteDel();
        System.out.println(deleteDel.deleteDel("adelbc"));
        System.out.println(deleteDel.deleteDel("adelHello"));
        System.out.println(deleteDel.deleteDel("adedbc"));
    }
}

class DeleteDel {
    public String deleteDel(String str) {
        return (str.length() >= 4 && str.substring(1, 4).equals("del")) ? str.replace("del", "") : str;
    }
}