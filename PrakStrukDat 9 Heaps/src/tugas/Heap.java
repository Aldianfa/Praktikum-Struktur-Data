package tugas;

/**
 *
 * @author Ijul
 */
public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;
    private int last;
    
    public Heap(int size){
        maxSize = size;
        currentSize = 0;
        heapArray = new Node [size];
        last = 0;
    }
    
    public boolean insertAt (int index, int value){
        Node newNode = new Node (value);
        heapArray[index] = newNode;
        trickleUp(currentSize++);
        last++;
        return true;
    }
    
    public void trickleUp(int index){ //jika data yg masuk lebih besar dari data yang ada, maka method ini bekerja untuk disesuaikan dengan index yang ada 
        int parent = (index-1/2);
        Node bottom = heapArray[index];
        
        while(index>0 && heapArray[parent].getKey() < bottom.getKey()){
            heapArray[index] = heapArray[parent];//value
            index = parent;//index
            parent = (parent - 1)/2;
        }
        heapArray[index] = bottom;
    }
    
    public Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }
    
    public void trickleDown(int index){
        int largerChild;
        Node top = heapArray[index];
        while(index<currentSize/2){
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            
            if (rightChild < currentSize && 
                    heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
                largerChild = rightChild;
            }else{
                largerChild = leftChild;
            }
            
            if (top.getKey() >= heapArray[largerChild].getKey()) {
                break;
            }
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        } 
        heapArray[index] = top;
    }
    
    public void HeapSort(){//mengurutkan data dari index ke-0 sampai index tertentu
        System.out.println("............................................");
        for (int i = last-1 ; i >= 0; i--) {//menghapus data heap, dan menaruh di array terakhir
            for (int j = last/2-1; j >= 0; j--) {//me random
                trickleDown(j);//menempatkan value sesuai 
            }
            Node remove = this.remove();
            heapArray[i] = remove;
        }
    }
    
    public void displayHeap(){
        System.out.println("Heap Array: ");
        for (int i = 0; i < currentSize; i++) {
            if (heapArray[i] != null) {
                System.out.print(heapArray[i].getKey() + " ");
            }else{
                System.out.println("--");
            }
        }
        System.out.println("");
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = "..............................";
        System.out.println(dots+dots);
        while(currentSize > 0){
            if (column == 0) {
                for (int k = 0; k < nBlanks; k++) {
                    System.out.print(' ');
                }
            }
            System.out.print(heapArray[j].getKey());
            if (++j == currentSize) {
                break;
            }
            if (++column == itemsPerRow) {
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            }else{
                for (int k = 0; k < nBlanks * 2 - 2; k++) {
                    System.out.print(' ');
                }
            }
        }
        System.out.println("\n"+ dots + dots);
    }
    
    public void displayArray(){
        for (int j = 0; j < last; j++) {
            System.out.print(heapArray[j].getKey() + " ");
        }
        System.out.println("");
    }
}
