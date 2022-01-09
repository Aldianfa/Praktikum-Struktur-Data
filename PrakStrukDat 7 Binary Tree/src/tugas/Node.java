
package tugas;

/**
 *
 * @author Ijul
 */
class Node {

    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;

    public Node(int data) {
        id = data;
        leftChild = null;
        rightChild = null;
    }
    
    public void displayNode() {
        System.out.print(id + " ");
    }
}
