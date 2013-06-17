import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sajeev
 * Date: 6/13/13
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class UALdictionary<Key,Value> implements Dictionary<Key,Value>{
    private ArrayList<KVpair<Key,Value>> list;



    public void clear(){

    }
    public void insert(Key k,Value v){
        KVpair<Key,Value> temp = new KVpair<Key, Value>(k,v);
        list.add(temp);
    }

    public Value remove(Key k){
        list.remove(k);
        return temp;
    }

    public Value removeAny(){

        return temp;
    }

    public Value find(Key K){

        return temp;
    }

    public int size(){
        return temp;
    }
}
