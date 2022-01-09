package tugas;

import java.io.*;
/**
 *
 * @author Ijul
 */
public class HashTableApp {
    public static void main(String[] args) throws IOException {
        int maxsize=15;
        HashTable theHash=new HashTable(maxsize);
        int value;

       while(true){
           System.out.print("Enter first letter of show, "
                    + "insert, find, delete :");
           int choice=getChar();
           switch(choice){
               
               case 's':
                   theHash.displayTable();
                   break;
               case 'i':
                   System.out.print("Enter value to insert :");
                   value=getInt();
                   theHash.insert(value);
                   break;
               case 'f':
                   System.out.print("Enter value to find: ");
                   value=getInt();
                   Data found=theHash.find(value);
                   if (found != null) {
//                       System.out.println("Found :");
                       found.displayFind();
                   }else{
                       System.out.println("Could not found "+value);
                   }
                   break;
               case 'd':
                   System.out.print("Enter value to delete: ");
                   value=getInt();
                   Data didDelete=theHash.delete(value);
                   if (didDelete !=null){
                       System.out.println("deleted : "+value);
                   }else{
                       System.out.println(value+" Could not deleted");
                   }
                   break;
           }
           
       }
    }
    public static String getString()
            throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }
    public static char getChar() throws IOException{
        String s=getString();
        return s.charAt(0);
    }
    
    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }
}
