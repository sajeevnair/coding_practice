import java.lang.Comparable;
import java.lang.Integer;

class BinaryTree<E extends Comparable<E>> {
    BTreeNode<E> root;
    int count;

    BinaryTree(){
        root = null;
        count = 0;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insert(5);
        bt.insert(2);
        bt.insert(9);
        bt.insert(1);
        bt.insert(3);
        bt.insert(10);
        bt.insert(7);

        System.out.println("Pre Order");
        bt.printTreePreOrder(bt.root);
        System.out.println("In Order");
        bt.printTreeInOrder(bt.root);
        System.out.println("Post Order");
        bt.printTreePostOrder(bt.root);

      BTreeNode<Integer> firstCommonNode =  bt.findFirstCommonNode(bt.root, new BTreeNode<Integer>(1), new BTreeNode<Integer>(3) );

        System.out.println("Common node is " + firstCommonNode.element());

    }

    public void insert(E elementToInsert){

        root = insertHelp(root, elementToInsert);
        count++;

    }

    public BTreeNode<E> insertHelp(BTreeNode<E> root, E elementToInsert){
        if (root == null){
            return new BTreeNode<E>(elementToInsert);
        }

        if (root.element().compareTo(elementToInsert) > 0){
            root.setLeft(insertHelp(root.left(), elementToInsert));
        }
        else {
            root.setRight(insertHelp(root.right(), elementToInsert));
        }


        return  root;
    }

    public void printTreePreOrder(BTreeNode<E> root){
        if (root == null){
            return ;
        }
        System.out.println(root.element());
        printTreePreOrder(root.left());
        printTreePreOrder(root.right());
    }

    public void printTreeInOrder(BTreeNode<E> root){
        if (root == null){
            return ;
        }
        printTreeInOrder(root.left());
        System.out.println(root.element());
        printTreeInOrder(root.right());
    }

    public void printTreePostOrder(BTreeNode<E> root){
        if (root == null){
            return ;
        }
        printTreePostOrder(root.left());
        printTreePostOrder(root.right());
        System.out.println(root.element());
    }

    public BTreeNode<E> findFirstCommonNode(BTreeNode<E> root, BTreeNode<E> node1, BTreeNode<E> node2 ){

        if (root.element().compareTo(node1.element()) > 0 && root.element().compareTo(node2.element()) > 0){
            return findFirstCommonNode(root.left(), node1, node2);
        }
        else  if (root.element().compareTo(node1.element()) < 0 && root.element().compareTo(node2.element()) < 0){
           return findFirstCommonNode(root.right(), node1, node2 );
        }
        else {
            return root;
        }



    }








}