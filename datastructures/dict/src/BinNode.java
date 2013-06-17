/**
 * Created with IntelliJ IDEA.
 * User: Sajeev
 * Date: 6/16/13
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BinNode<Value> {
    public Value element();

    public void setElement(Value v);

    public Value left();

    public Value right();

    public boolean isLeaf();


}
