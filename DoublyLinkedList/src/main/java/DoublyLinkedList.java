/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/9/2023
 * Time: 2:09 PM
 */
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "|");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void printListReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + "|");
            temp = temp.prev;
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
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 1) {
            this.tail = null;
            this.head = null;
            length--;
            return null;
        } else if (length > 1) {
            Node temp = this.tail;
            this.tail = this.tail.prev;
            this.tail.next = null;
            temp.prev = null;
            length--;
            return tail;
        }
        return null;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
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
            head.prev = null;
            removeNode.next = null;
            this.length--;
        }
        return removeNode;
    }

    public Node getByIndex(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        Node temp;
        if (index < length / 2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
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
            Node before = getByIndex(index - 1);
            Node after = before.next;
            Node newNode = new Node(value);
            newNode.prev = before;
            before.next = newNode;
            newNode.next = after;
            after.prev = newNode;
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
            Node temp = getByIndex(index);
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
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
