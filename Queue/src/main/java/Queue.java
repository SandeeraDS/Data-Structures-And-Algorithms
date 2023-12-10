/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/10/2023
 * Time: 2:48 PM
 */
public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = this.first;
        while (temp != null) {
            System.out.print(temp.value + "|");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void getFirst() {
        System.out.println("First : " + first.value);
    }

    public void getLast() {
        System.out.println("Last : " + last.value);
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        Node removeNode = null;
        if (length == 1) {
            this.first = null;
            this.last = null;
            this.length--;
        } else if (length > 1) {
            removeNode = first;
            first = first.next;
            this.length--;
        }
        return removeNode;
    }
}
