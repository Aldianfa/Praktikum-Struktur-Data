package Tugas;
/**
 *
 * @author Ijul
 */
public class QueueLink {
    private Queue front;//bagian depan
    private Queue rear;//bagian blkg

    public QueueLink() {
        this.front = this.rear = null;
    }

    public void insert(int nim, String nama) {
        // create a new data on linkedlist
        Queue newLink = new Queue(nim, nama);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = newLink;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = newLink;
        this.rear = newLink;
    }

    public Queue remove() {
        // If queue is empty, return NULL.
        if (this.front == null) {
            return null;
        }

        // Store previous front and move front one node ahead
        Queue temp = this.front;
        this.front = this.front.next; //pointer selanjutnya

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;

        return temp;
    }

    public void displayQueue() {
        System.out.println("Queue (front-->rear) :");

        Queue current = front;
        while(current != null) {
            System.out.println("\t"+current.nim + " " + current.nama);
            current = current.next;
        }
        System.out.println("");
    }
}
