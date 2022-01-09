package ImplementasiQueue;

/**
 *
 * @author Ijul
 */
public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue=new Queue(4);
        
        System.out.println(">>beberapa mulai mengantri");
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satria");
        theQueue.insert("Afrizal");
        theQueue.insert("Sukran");
        theQueue.insert("Mahmud");
        
        System.out.println("");
        System.out.println(">>isi Antrian");
        theQueue.display();
        
        
        System.out.println("\n>>satu persatu keluar antrian");
        System.out.println(theQueue.remove()+" Keluar antrian");
        
        theQueue.display();
        
        System.out.println("\n");
        System.out.println(theQueue.remove()+" Keluar antrian");
        theQueue.display();
        
        System.out.println("\n");
        System.out.println(theQueue.remove()+" Keluar antrian");
        theQueue.display();
        
        System.out.println("\n");
        System.out.println(theQueue.remove()+" Keluar antrian");
        theQueue.display();
        
        System.out.println("\n");
        System.out.println("Antrian kosong");
        System.out.println(theQueue.size()+" person");
        theQueue.display();
        
    }
}
