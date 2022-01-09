
package ImplementasiStack;

/**
 *
 * @author Ijul
 */
public class AppPembalik {
    public static void main(String[] args) {
        String input="kasur";
        String output;
        pembalik balik_kata=new pembalik(input);
        output=balik_kata.membalik();
        System.out.println(">>katanya...");
        System.out.println("\t"+input);
        System.out.println(">>dibalik jadi...");
        System.out.println("\t"+output);
    }
}
