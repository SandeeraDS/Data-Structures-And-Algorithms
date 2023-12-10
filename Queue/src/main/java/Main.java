/**
 * User: Sandeera Jayampathi (DS)
 * Date: 11/27/2023
 * Time: 9:07 PM
 */
public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue(4);
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.printQueue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        Node dequeue = myQueue.dequeue();
        System.out.println("Dequeue = "+dequeue.value);
        myQueue.printQueue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
    }
}
