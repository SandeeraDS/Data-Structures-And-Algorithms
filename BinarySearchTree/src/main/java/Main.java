/**
 * User: Sandeera Jayampathi (DS)
 * Date: 11/27/2023
 * Time: 9:07 PM
 */
public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);

        bst.insert(27);

        System.out.println(bst.root.left.right.value);

        System.out.println(bst.contains(76));
        System.out.println(bst.contains(100));
        System.out.println(bst.contains(82));


    }
}
