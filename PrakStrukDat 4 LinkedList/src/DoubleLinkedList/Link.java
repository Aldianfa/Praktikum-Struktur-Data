
package DoubleLinkedList;

/**
 *
 * @author IJUL
 */
public class Link {
    public int Data;
    public Link next;
    public Link previous;
    
    public Link(int Data){
        this.Data = Data;
    }
    
    public void displayLink(){
        System.out.print(Data +" ");
    }
    
}

class DoubleLinkedList{
    private Link first;
    private Link last;
    
    public DoubleLinkedList(){
        first = null;
        last  = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insertFirst(int Data){
        Link newLink = new Link(Data);
        if(isEmpty()){
            last = newLink;
        }else{
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    
    public void insertLast(int Data){
        Link newLink = new Link(Data);
        if (isEmpty()){
            first = newLink;
        }else{
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }
    
    public Link deleteFirst(){
        Link temp = first;
        if (first.next == null){
            last = null;
        }else{
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }
    
    public Link deleteLast(){
        Link temp = last;
        if (first.next == null){
            last = null;
        }else{
            last.next.previous = null;
        }
        last = last.next;
        return temp;
    }
    
    public boolean insertAfter(int key,int Data){
        Link current = first;
        while (current.Data != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }
        Link newLink = new Link(Data);
        if (current == last){
            newLink.next = null;
            last = newLink;
        }else{
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }
    
    public Link deleteKey(int key){
        Link current = first;
        while (current.Data != key){
            current = current.next;
            if(current==null){
                return null;
            }
        }
        
        if (current == first){
            first = current.next;
        }else{
            current.previous.next = current.next;
        }
        
        if (current == last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }
        return current;
    }
    
    public void displayFoward(){
        System.out.println("List "+"(first --> last): ");
        Link current = first;
        
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
    public void displayBackward(){
        System.out.println("List "+"(last --> first): ");
        Link current = last;
        
        while (current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
    }
    
}
