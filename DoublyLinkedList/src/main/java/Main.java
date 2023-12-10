/**
 * User: Sandeera Jayampathi (DS)
 * Date: 11/27/2023
 * Time: 9:07 PM
 */
public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(2);
        doublyLinkedList.append(10);
//        doublyLinkedList.printList();
//        doublyLinkedList.printListReverse();
//        doublyLinkedList.getHead();
//        doublyLinkedList.getTail();
//        doublyLinkedList.getLength();
//        Node removed = doublyLinkedList.removeLast();
//        System.out.println("Removed last node = "+ removed);
//        doublyLinkedList.getTail();
//        doublyLinkedList.getLength();
//        doublyLinkedList.printList();
//        doublyLinkedList.prepend(20);
//        doublyLinkedList.printList();
//        doublyLinkedList.getHead();
//        doublyLinkedList.getTail();
//        doublyLinkedList.getLength();
//        doublyLinkedList.removeFirst();

        doublyLinkedList.printList();
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();
//        doublyLinkedList.setByIndex(1,30);
//        Node indexValue = doublyLinkedList.getByIndex(1);
//        System.out.println("index value = "+ indexValue.value);
//        doublyLinkedList.insertByIndex(1,100);
//        doublyLinkedList.printList();
//        doublyLinkedList.getHead();
//        doublyLinkedList.getTail();
//        doublyLinkedList.getLength();

        doublyLinkedList.removeByIndex(1);
        doublyLinkedList.printList();
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();

    }


}
