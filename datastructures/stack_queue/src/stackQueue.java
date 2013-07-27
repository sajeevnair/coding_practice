/**
 * Implementation of queue using two stacks
 * User: Sajeev
 * Date: 7/26/13
 * Time: 10:34 PM
 *
 */
public class stackQueue {
    // two stacks for queue
    private LStack S1 ;
    private LStack S2 ;
    // constructor
    stackQueue(){
        S1 =new LStack();
        S2 = new LStack();

    }

    /**
     *  add elements to the queue
     * @param e  element to be added
     */
    public void add(int e){

        S1.push(e);


    }

    /**
     *
     * @return  first in the queue
     */
    public int peek(){
        // return S2 top if S2 is not empty
        if (S2.length()!=0){
            return S2.top();

        }
        // S2 is empty so push elements from S1 in reverse
        while (S1.length()!=0){
            S2.push(S1.pop());

        }
        // return S2 top
        return S2.top();

    }


    /**
     * pull elements from queue FIFO
     * @return  element that was pulled
     */
public int pull(){

    if (S2.length()!=0){
        return S2.pop();

    }
    // S2 is empty so push elements from S1 in reverse
    while (S1.length()!=0){
        S2.push(S1.pop());

    }
    // return S2 pop
    return S2.pop();

}

    /**
     *
     * @return  actual size of queue
     */
    public int length(){
        return S1.length()+S2.length();
    }

    /**
     * useful for printing the queue
     * @return  queue elements as string
     */
public String qtoString(){

      if(S2.length()!=0)
      return S2.stack_toString();
    while (S1.length()!=0){
        S2.push(S1.pop());
    }
    return S2.stack_toString();

}
    public static void main(String[] args){

        stackQueue Q1 = new stackQueue();

        for (int i =1 ; i<10;i++) {
            Q1.add(i*10);

        }

       System.out.println(Q1.qtoString());

        Q1.pull();


        System.out.println(Q1.qtoString());

        Q1.pull();Q1.pull();

        System.out.println(Q1.qtoString());



    }
}
