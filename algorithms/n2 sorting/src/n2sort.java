/**
 * n2 Sorting Algorithms
 * User: Sajeev
 * Date: 6/17/13
 * Time: 3:55 PM
 * Insertion Bubble and Selection sort
 */
 import java.io.*;
 import java.util.Arrays;

public class n2sort {
    private static int swaps =0;
    public static <E extends Comparable<? super E>>
    void inssort(E[] A){
        int iter =0;
        swaps=0;
        for (int i=1;i<A.length;i++){

            for (int j=i;j>0 && A[j].compareTo(A[j-1])<0;j--){
                  swap(A,j,j-1);
            iter++;
            System.out.println(Arrays.toString(A));
            }iter++;
            System.out.println();
            System.out.println(Arrays.toString(A));
        }
        System.out.println(iter);
        System.out.println(swaps);
    }
    public static <E extends Comparable<? super E>>
    void bubblesort(E A[]){
        int iter =0;
        swaps=0;
        for (int i=0;i<A.length-1;i++){
            for(int j=A.length-1;j>i ;j--){
                if ( A[j].compareTo(A[j-1])<0){
                    swap(A,j,j-1);
                }  iter++;
                //System.out.println(Arrays.toString(A));
            }  iter++;
            System.out.println();
            System.out.println(Arrays.toString(A));

        }
        System.out.println(iter);
        System.out.println(swaps);
    }
    public static <E extends  Comparable<? super E>>
    void selsort(E[] A){
        int iter =0;
        swaps=0;
        for (int i=0;i<A.length-1;i++){
            // store index
            int smallindex = i;
            for (int j =A.length-1;j>i;j--){
                if (A[j].compareTo(A[smallindex])<0){
                    smallindex=j;
                    swap(A,i,smallindex);


                }   iter++;
                System.out.println(Arrays.toString(A));
            }   iter++;
            System.out.println();
            System.out.println(Arrays.toString(A));
        }
        System.out.println(iter);
        System.out.println(swaps);
    }

    private static <E> void swap(E A[],int x,int y){
        E temp = A[x];
        A[x]=A[y];
        A[y]=temp;
        swaps++;



    }

    public static void main(String[] args)    {
        System.out.println("42,20,17,1,28,14,23,15");
        System.out.println("********Insertion Sort**************");
           Integer[] A = {42,20,17,1,28,14,23,15};
           inssort(A);

           Integer[] B = {42,20,17,1,28,14,23,15};
        System.out.println("42,20,17,1,28,14,23,15");
        System.out.println("********Bubble Sort**************");
           bubblesort(B);
        Integer[] C = {42,20,17,1,28,14,23,15};
        System.out.println("42,20,17,1,28,14,23,15");
        System.out.println("********Selection Sort**************");
        selsort(C);


    }

}
