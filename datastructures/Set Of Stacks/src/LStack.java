/**
 * Stack implemented using Linked list
 * User: Sajeev
 * Date: 7/26/13
 * Time: 9:51 PM
 *
 */
public class LStack {

    private Link top;
    private int size;
    private int capacity;

    LStack(){
       top =null; size=0; capacity=10;

    }
    LStack(int c){
        top=null; size=0; capacity=c;
    }
    public void clear(){
        top=null;size=0;
    }

    public void push(int e){
        top = new Link(e,top);
        size++;

    }

    public int pop(){
        int temp = top.element();
        top = top.next();
        size--;
        return temp;
    }

    public int top(){

        return top.element();
    }

    public int size(){
        return size;
    }
    public boolean isFull(){
        return size==capacity;
    }
    public String stack_toString(){
        StringBuffer out = new StringBuffer((size()+1)*4);
        out.append("< ");
        Link temp = top;

        while (temp.next()!=null) {

            out.append(temp.element()) ;
            out.append(" ");
            temp= temp.next();


        }

        out.append(" >");

        return out.toString();


    }






}
