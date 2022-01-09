package ImplementasiStack;

/**
 *
 * @author Ijul
 */
public class stack {
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    public stack(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top=-1;
    }
    
    public void push(char item){// insert item
        stackArray[++top]=item;
    }
    
    public char pop (){// delete item
        return stackArray[top--];
    }
    
    public char peek(){//check item
        return stackArray[top];
    }
    
    public boolean isEmpty(){//true if stack is empty
        return(top==-1);
    }
    
    public boolean isFull(){//true if stack is full
        return(top==maxSize-1);
    }
    
}
