/**
 * Linked list node
 * User: Sajeev
 * Date: 7/26/13
 * Time: 4:55 PM
 *
 */
public class Link {

    private int element;

    private Link next;

    Link(int e){

        element=e;
        next=null;

    }
    Link(int e , Link n){
        element =e;
        next = n;
    }

    public Link next(){
        return next;
    }

    public int element(){
        return element;
    }
    public void setNext(Link n){
        next = n;

    }

    public void setElement(int e){
        element = e;
    }







}
