package ImplementasiStack;
import java.util.Scanner;
/**
 *
 * @author Ijul
 */
public class AppPembalik2 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String input=scanner.next();
        String output;
        
        pembalik balik_kata=new pembalik(input);
        output=balik_kata.membalik();
        System.out.println("Kebalikan : "+output);      
        }
}
}
