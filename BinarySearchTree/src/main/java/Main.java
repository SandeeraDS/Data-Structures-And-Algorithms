/**
 * User: Sandeera Jayampathi (DS)
 * Date: 11/27/2023
 * Time: 9:07 PM
 */
public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(47);
//        bst.insert(21);
//        bst.insert(76);
//        bst.insert(18);
//        bst.insert(52);
//        bst.insert(82);
//
//        bst.insert(27);
//
//        System.out.println(bst.root.left.right.value);
//
//        System.out.println(bst.contains(76));
//        System.out.println(bst.rContains(76));
//
//        System.out.println(bst.contains(100));
//        System.out.println(bst.rContains(100));
//
//        System.out.println(bst.contains(82));
//        System.out.println(bst.rContains(82));

//        bst.rInsert(2);
//        bst.rInsert(1);
//        bst.rInsert(3);
//
//        System.out.println("Root = "+ bst.root.value);
//        System.out.println("Root left = "+ bst.root.left.value);
//        System.out.println("Root right = "+ bst.root.right.value);

//        bst.insert(47);
//        bst.insert(21);
//        bst.insert(76);
//        bst.insert(18);
//        bst.insert(27);
//        bst.insert(52);
//        bst.insert(82);
//
//        System.out.println(bst.minValue(bst.root));
//        System.out.println(bst.minValue(bst.root.right));

        bst.insert(47);
        bst.insert(24);
        bst.insert(20);
        bst.insert(25);
        bst.insert(24);
        bst.insert(26);
        bst.insert(82);

        bst.deleteNode(24);
        System.out.println(bst.contains(24));
//        System.out.println(bst.minValue(bst.root.right));


    }
}
