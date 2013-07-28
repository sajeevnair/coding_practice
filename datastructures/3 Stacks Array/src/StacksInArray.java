/**
 * implement 3 stacks using single array.
 * User: Sajeev
 * Date: 7/27/13
 * Time: 6:20 PM
 *
 */
public class StacksInArray {
    // size of one stack
    int size=10;

    // the array that will hold 3 stacks

    int[] array = new int[size*3];

    // pointers to stacks

    int[] stackPointers = {0,0,0};

    /**
     *  add to top of stack
     * @param stackNum  select which stack to add to
     * @param value  value to be added
     */
    public void push(int stackNum, int value){
        // calculate index
        int index =  size*stackNum + stackPointers[stackNum];
        stackPointers[stackNum]++;
        array[index]=value;
    }

    /**
     * pop the top of selected stack
     * @param stackNum  select which stack to pop
     * @return popped element
     */
    public int pop(int stackNum){

        int index = size*stackNum+stackPointers[stackNum]-1;
        int temp = array[index];
        array[index]=0;
        stackPointers[stackNum]--;

        return temp;


    }

    /**
     * return the top of selected stack
     * @param stackNum  select the stack number
     * @return  value at the top
     */
    public int top(int stackNum){
        int index = size*stackNum+stackPointers[stackNum]-1;
        return array[index];

    }

    public static void main(String[] args){
        StacksInArray stack1 = new StacksInArray();
        for (int i=1; i<5;i++){
            stack1.push(0,i);
            stack1.push(1,i*2);
            stack1.push(2,i*5);
        }

        System.out.println(stack1.pop(0));
        System.out.println(stack1.pop(0));
        System.out.println();
        System.out.println(stack1.pop(1));
        System.out.println(stack1.pop(1));
        System.out.println();
        System.out.println(stack1.pop(2));
        System.out.println(stack1.pop(2));
        System.out.println();
        System.out.println(stack1.top(0));
        System.out.println();
        System.out.println(stack1.top(1));
        System.out.println();
        System.out.println(stack1.top(2));


    }

}
