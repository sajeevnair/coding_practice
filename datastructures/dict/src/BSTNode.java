/**
 * Created with IntelliJ IDEA.
 * User: Sajeev
 * Date: 6/16/13
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class BSTNode<Key,Value>  {

    private Key key;
    private  Value value;

    private  BSTNode<Key,Value> left;
    private BSTNode<Key,Value> right;

    BSTNode(){
        left=right=null;

    }
    BSTNode(Key k, Value v){
        left=right=null;
        key = k;
        value =v;
    }

    BSTNode(BSTNode<Key,Value> l, BSTNode<Key,Value> r,Key k, Value v ){

        left=l;
        right=r;
        value=v;
        key=k;

    }
    public Value value(){

        return value;
    }

    public void setValue(Value v){
        value =v;

    }

    public Key key(){
        return key;

    }
    public void setKey(Key k){
        key =k;

    }

    public BSTNode<Key,Value> left(){
        return left;

    }

    public void setLeft(BSTNode<Key,Value> l){
        left = l;

    }

    public BSTNode<Key,Value> right(){
        return right;

    }

    public void setRight(BSTNode<Key,Value> r){
        right =r ;

    }

    public boolean isLeaf(BSTNode<Key,Value> rt){
        return (rt.left()==null)&&(rt.right()==null) ;

    }

}
