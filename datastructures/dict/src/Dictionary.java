/**
 * Created with IntelliJ IDEA.
 * User: Sajeev
 * Date: 6/12/13
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
/** The Dictionary abstract class */
public interface Dictionary<Key,Value> {
    /** Re initialize the dictionary */
    public void clear();

    /**Insert into dictionary
     * @param k is the key for the value
     * @param v is the value being inserted
     */
    public void insert(Key k, Value v);

    /** Remove a value from the dictionary
     * @param k The key of the value to be removed.
     * @return A matching record or null if not found
     *
     */
    public Value remove(Key k);

    /**
     * Find a value
     * @param k The key for the record to find
     * @return  The matching value
     */
    public Value find(Key k);

    /**
     *
     * @return  The Size of the dictionary
     */
    public int size();

    /**
     * Remove and return an arbitrary value from the dictionary
     * @return  The value being removed
     */
    public Value removeAny();



 }
