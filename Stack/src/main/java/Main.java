/**
 * User: Sandeera Jayampathi (DS)
 * Date: 11/27/2023
 * Time: 9:07 PM
 */
public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();

        myStack.push(2);
        myStack.push(5);
        myStack.printStack();
        
        Node pop1 = myStack.pop();
        System.out.println("pop value = "+pop1.value);

        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();
    }


}
