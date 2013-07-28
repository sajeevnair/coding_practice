import java.util.ArrayList;

/**
 * Implement a set of stacks, each stack is of fixed capacity. A new stack is create every time the previous
 * stack is full. The Set of Stacks will act as a single huge stack
 * User: Sajeev
 * Date: 7/28/13
 * Time: 1:27 PM
 *
 */
public class SetOfStacks {

    // holds the set of stacks
    ArrayList<LStack> Stacks = new ArrayList<LStack>();

    /**
     * emulates the push operation in a single stack
     * @param v element to be pushed
     */
    public void push(int v){
        LStack last = getLastStack();
        if(last!=null&&!last.isFull() ){
            last.push(v);
        }  else {
            LStack stack = new LStack(5);
            stack.push(v);
            Stacks.add(stack);
        }
    }

    /**
     * gets the last stack that was in use
     * @return stack
     */
    private LStack getLastStack() {

        if (Stacks.size()==0){
            return null;
        }else {
           return Stacks.get(Stacks.size()-1) ;
        }




    }

    /**
     * emulates the pop operation of a stack
     * @return  popped element
     */
    public int pop(){

        LStack last = getLastStack();
        int temp = last.pop();
        if (last.size()==0) {
            Stacks.remove(last);
        }

      return temp;
    }


    public static void main(String[] args){

        SetOfStacks SOS = new SetOfStacks();
        for (int i =1;i<15;i++){
            SOS.push(i*5);
        }
        System.out.println(SOS.pop());
        System.out.println(SOS.pop());
        System.out.println(SOS.pop());
        System.out.println(SOS.pop());
        System.out.println(SOS.pop());
        System.out.println(SOS.pop());

    }

}
