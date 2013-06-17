/**
 * Created with IntelliJ IDEA.
 * User: Sajeev
 * Date: 6/16/13
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
 import java.lang.Comparable;
public class BST<Key extends Comparable<? super Key>,Value> implements Dictionary<Key,Value> {

    private BSTNode<Key,Value> root; //Root of the tree
    private  int nodecount;      //node counter
    BST(){
        root=null;
        nodecount=0;
    }


    @Override
    public void clear() {
        root=null;
        nodecount=0;

    }

    @Override
    /**
     *
     */
    public void insert(Key k, Value v) {
        root= inserthelp(k,v,root);
        nodecount++;
    }

    /**
     * Returns a new sub-tree with the new node inserted
     * @param k key of value to be inserted
     * @param v value to be inserted
     * @param rt root of sub tree
     * @return new sub tree root
     */
    private BSTNode<Key,Value> inserthelp(Key k, Value v, BSTNode<Key, Value> rt){
       if(rt == null){
           return new BSTNode<Key, Value>(k,v);
       }
       if(rt.key().compareTo(k)>0){
           // if root's key is greater than key of value to be inserted
           rt.setLeft(inserthelp(k, v, rt.left()));
       }
        if(rt.key().compareTo(k)<0){
            // if roots key is lesser than the key of value to be inserted
            rt.setRight(inserthelp(k, v, rt.right()));
        }
        return rt;

    }

    @Override
    public Value remove(Key k) {
        // find the key
        Value temp = findhelp(root,k);
        //remove if it exists
        if (temp!=null){
            root = removehelp(root,k);
            nodecount--;
        }
        return temp;
    }

    private BSTNode<Key, Value> removehelp(BSTNode<Key, Value> rt, Key k) {
        if (rt.key().compareTo(k)>0){
            //rt key > k
            rt.setLeft(removehelp(rt.left(),k));

        }
        else if (rt.key().compareTo(k)<0){
            //rt key < k
            rt.setRight(removehelp(rt.right(),k));
        }
        else {
            // rt key = k we found the node to remove
            // condition 1 node has l child
            if (rt.left()==null){
                return rt.right();
            }
            else if(rt.right()==null){
                return rt.left();
            }
            //node has 2 children and they may have more
            else {
                BSTNode<Key,Value> temp = getmin(rt.right());
                rt.setKey(temp.key());
                rt.setValue(temp.value());
                rt.setRight(deltemin(rt.right()));
            }
        }
        return rt;
    }

    private BSTNode<Key, Value> deltemin(BSTNode<Key, Value> rt) {
        if (rt.left()==null) return rt.right();
        rt.setLeft(deltemin(rt.left()));
        return rt;

    }

    private BSTNode<Key, Value> getmin(BSTNode<Key, Value> rt) {
       if(rt.left()==null)return rt;
        return getmin(rt.left());
    }

    @Override
    public Value find(Key k) {

        return findhelp(root,k);
    }

    private Value findhelp(BSTNode<Key,Value> rt,Key k) {
        if (rt==null) return null;
        if(rt.key().compareTo(k)>0){
            //rt's key > k
            return findhelp(rt.left(),k);

        }
        else if (rt.key().compareTo(k)==0){
            return rt.value();
        }
        else {
            return findhelp(rt.right(),k);
        }

    }

    @Override
    public int size() {
        return nodecount;
    }

    @Override
    public Value removeAny() {

        if(root==null)return null;
        Value temp = root.value();
        root = removehelp(root,root.key())  ;
        nodecount--;
        return temp;
    }

    private void printhelp(BSTNode<Key,Value> rt){
        if (rt==null) return  ;
        printhelp(rt.left());
        printvisit(rt.value());
        printhelp(rt.right());


    }
    private StringBuffer out;
    private void printvisit(Value value) {
        out.append(value+" ")  ;
    }
    public String toString(){
        out = new StringBuffer(100);
        printhelp(root);
        return out.toString();
    }
}
