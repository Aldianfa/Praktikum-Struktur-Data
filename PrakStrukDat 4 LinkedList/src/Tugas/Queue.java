
package Tugas;
/**
 *
 * @author Ijul
 */
public class Queue {
    public int nim;
    public String nama;
    public  Queue next; //sebagai pointer

    public Queue(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.next = null;
    }
}
