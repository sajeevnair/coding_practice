class BTreeNode<E>{
    private BTreeNode<E> left;
    private BTreeNode<E> right;

    private E element;

    BTreeNode(E elementVal){
        element = elementVal;
        right = null;
        left = null;
    }

    BTreeNode(E elementVal, BTreeNode<E> leftVal, BTreeNode<E> rightVal ){
        element= elementVal;
        left = leftVal;
        right = rightVal;
    }

    public BTreeNode<E>  left(){
        return left;
    }

    public BTreeNode<E> right(){
        return right;
    }

    public void setLeft(BTreeNode<E> leftVal){
        left = leftVal;
    }

    public void setRight(BTreeNode<E> rightVal){
        right = rightVal;
    }


    public E element(){
        return element;
    }

    public void setElement(E elementVal){
        element = elementVal;
    }

    public boolean isLeaf(){
        return (left == null && right == null);
    }



}