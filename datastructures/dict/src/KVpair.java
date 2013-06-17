/**
 * Created with IntelliJ IDEA.
 * User: Sajeev
 * Date: 6/13/13
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class KVpair<Key,Value> {
    private Key key;
    private Value value;

    /** Constructors */
    KVpair(){
        key = null;
        value=null;

    }
    KVpair(Key k, Value v) {
        key=k;
        value=v;
    }

    /**
     *
     * @return key
     */
    public Key key(){return key;}

    /**
     *
     * @return Value
     */
    public Value value(){return value;}
}
