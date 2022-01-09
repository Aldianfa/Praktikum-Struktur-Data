package tugas;
/**
 *
 * @author Ijul
 */
public class HashTable {
    private Data[] hashArray;
    private int size;
    private int num;
    private int x;
    
    public HashTable(int size){
        this.size=size;
        hashArray=new Data[size];
    }
    public void displayTable(){
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                System.out.println(" | "+j+"\t | "+hashArray[j].getKey()+" | ");
            }else{
                System.out.println(" | "+j+"\t | -- |");
            }
        }
        System.out.println("");
    }
    
    public int hashFunc(int key){
        return key % size;//tempat untuk peletakan data atau hash indexnya
    }
    
    public void insert(int data){
        Data item=new Data(data);
        int key=item.getKey();
        x=hashFunc(key);
        int hashVal= x;
        num=0;
        while(hashArray[hashVal] != null){
            num++;
            hashVal=(x+num*num)%size;
        }
        hashArray[hashVal]=item;
    }
    public Data delete(int key){
        int hashVal=hashFunc(key);
        x=hashFunc(key);
        num=0;
        while(hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey() == key) {
                Data temp=hashArray[hashVal];
                hashArray[hashVal]=null;
                return temp;
            }
            num++;
            hashVal=(x+num*num)%size;
            
        }
        return null;
    }
    public Data find(int key){
        int hashVal=hashFunc(key);
        x=hashFunc(key);
        num=0;
        while(hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey() == key) {
                System.out.println("Found Hash Index "+hashVal);
                return hashArray[hashVal];
            }
            else{
                num++;
                hashVal=(x+num*num)%size;
            }
        }
        return null;
    }
    
}
