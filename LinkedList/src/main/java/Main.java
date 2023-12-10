/**
 * User: Sandeera Jayampathi (DS)
 * Date: 11/27/2023
 * Time: 9:07 PM
 */
public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(2);
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(25);
        linkedList.printList();
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();
//        linkedList.printList();
//        Node removedNode = linkedList.removeLast();
//        System.out.println("Removed Node = " + removedNode.value);
//        removedNode = linkedList.removeLast();
//        System.out.println("Removed Node = " + removedNode.value);
//        linkedList.printList();
//        linkedList.getTail();
//        linkedList.getLength();
//        linkedList.prepend(50);
//        linkedList.printList();
//        linkedList.getLength();
//        linkedList.prepend(60);
//        linkedList.printList();
//        linkedList.getLength();
//        linkedList.removeFirst();
//        linkedList.printList();
//        linkedList.getLength();
//        linkedList.removeFirst();
//        linkedList.printList();
//        linkedList.getLength();
//        Node node = linkedList.getByIndex(4);
//        System.out.println("Node value of index = " + node.value);
//        boolean setted = linkedList.setByIndex(0,100);
//        linkedList.getLength();
//        linkedList.insertByIndex(1, 123);
//        linkedList.printList();
//        linkedList.getLength();

//        linkedList.getLength();
//        linkedList.removeByIndex(2);
        linkedList.printList();
        linkedList.getLength();
        linkedList.reverse();
        linkedList.printList();
        linkedList.getLength();
    }
}
