
package ImplementasiStack;

/**
 *
 * @author Ijul
 */
public class pembalik {
    private String input;
    private String output;
    
    public pembalik(String in){
        input=in;
    }
    
    public String membalik(){
        int stackSize=input.length();
        stack theStack = new stack(stackSize);//pemanggilan objek baru
        
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            theStack.push(ch);
        }
        output="";
        
        while(!theStack.isEmpty()){//negasi
            char ch = theStack.pop();//pop 1 item ,LIFO
            output += ch;
        }
        return output;
    }
}
