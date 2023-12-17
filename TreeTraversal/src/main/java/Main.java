/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/17/2023
 * Time: 1:34 PM
 */
public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        System.out.println("BFS -> "+bst.BFS());
        System.out.println("DFS Pre Order- > "+bst.DFSPreOrder());
        System.out.println("DFS Post Order- > "+bst.DFSPostOrder());
        System.out.println("DFS In Order- > "+bst.DFSInOrder());

    }
}
