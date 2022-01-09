package tugas;
/**
 *
 * @author Ijul
 */
public class stack{
    
    private int maxSize;
    private Node[] stackArray;
    private int top;
  
    public stack(){
        maxSize = 100;
        stackArray = new Node[maxSize];
        top = -1;
    }
  
    public Node pop(){
        return stackArray[top--];
    } 
  
    public void push(Node item){
        stackArray[++top] = item;
    }
    
    public boolean isEmpty(){ 
        return (top == -1);
    }
    
    public Node peek(){
        return stackArray[top];
    }
    
    public boolean isFull(){
        return (top == maxSize-1);
    }
}
