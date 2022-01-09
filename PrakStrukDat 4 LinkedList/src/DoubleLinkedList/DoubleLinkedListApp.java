
package DoubleLinkedList;

/**
 *
 * @author IJUL
 */
public class DoubleLinkedListApp {
    public static void main(String[] args) {
        DoubleLinkedList theList = new DoubleLinkedList();
        
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.displayFoward();
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayFoward();
        theList.displayBackward();
        theList.deleteFirst();
        theList.displayFoward();
        theList.deleteLast();
        theList.displayFoward();
        theList.deleteKey(11);
        theList.displayFoward();
        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);
        theList.displayFoward();
    }
}
