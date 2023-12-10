/**
 * User: Sandeera Jayampathi (DS)
 * Date: 11/27/2023
 * Time: 8:54 PM
 */
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "|");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void getHead() {
        System.out.println("Head : " + head.value);
    }

    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node removedNode = null;
        if (length == 1) {
            removedNode = head;
            this.tail = null;
            this.head = null;
            length--;
        } else if (length > 1) {
            Node temp = head;
            Node previousNode = null;
            while (temp.next != null) {
                previousNode = temp;
                temp = temp.next;
            }
            if (previousNode != null) {
                removedNode = previousNode.next;
                tail = previousNode;
                tail.next = null;
                length--;
            }
        }
        return removedNode;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node removeNode = null;
        if (length == 1) {
            this.head = null;
            this.tail = null;
            this.length--;
        } else if (length > 1) {
            removeNode = head;
            head = head.next;
            this.length--;
        }
        return removeNode;
    }

    public Node getByIndex(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean setByIndex(int index, int value) {
        Node temp = getByIndex(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }


    public boolean insertByIndex(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
            Node prevIndexNode = getByIndex(index - 1);
            Node newNode = new Node(value);
            newNode.next = prevIndexNode.next;
            prevIndexNode.next = newNode;
            length++;
            return true;
        }
    }

    public Node removeByIndex(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        } else {
            Node prevIndexNode = getByIndex(index - 1);
            Node temp = prevIndexNode.next;
            prevIndexNode.next = temp.next;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public void reverse() {
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        Node after = null;
        Node before = null;

        for (int i = 0; i < this.length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }


}
