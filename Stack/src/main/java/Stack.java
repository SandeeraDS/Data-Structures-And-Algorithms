/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/10/2023
 * Time: 2:38 PM
 */
public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = this.top;
        while (temp != null) {
            System.out.print(temp.value + "|");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void getTop() {
        System.out.println("Head : " + this.top.value);
    }

    public void getHeight() {
        System.out.println("Height : " + this.height);
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            this.top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        Node removeNode = null;
        if (height == 1) {
            this.top = null;
            this.height--;
        } else if (height > 1) {
            removeNode = top;
            top = top.next;
            this.height--;
        }
        return removeNode;
    }
}
