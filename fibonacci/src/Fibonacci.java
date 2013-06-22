import java.math.BigInteger;

/**
 * The Fibonacci series
 * User: Sajeev
 * Date: 6/21/13
 * Time: 3:00 PM
 *
 */

public class Fibonacci {

    BigInteger fib(int n){

        BigInteger fib;
        BigInteger xn1;
        BigInteger xn2;
        BigInteger mult;
        fib=BigInteger.ZERO;
        mult=BigInteger.ONE;
        xn1=BigInteger.ZERO; //Xn-1 =0
        xn2=BigInteger.ONE; //Xn-2 =1
        if (n<0){

            n=n*-1;
            mult= BigInteger.valueOf((int)Math.pow(-1,(n+1)))  ;

        }  else if(n==-1){
            return  BigInteger.valueOf(-1);
        }  else if (n==0){
            return BigInteger.ZERO;
        }else if (n==1){
            return BigInteger.ONE;
        }
           try{
            for (int i=2;i<=n;i++){

                fib = xn2.add(xn1);
                xn1=xn2;
                xn2=fib;


        }
           }catch (Throwable e){
               System.out.println(fib+" Is the highest fibonacci number that can be calculated in this system");
           }


        return fib.multiply(mult);


    }

    BigInteger fib_golden(int n){
        BigInteger fib=BigInteger.ZERO;



           fib = BigInteger.valueOf(Math.round(((Math.pow(1+Math.sqrt(5),n))-(Math.pow(1-Math.sqrt(5),n)))/(Math.pow(2,n)*Math.sqrt(5))));





        return fib;

    }

    public static void main(String[] args){

        Fibonacci Obj1 = new Fibonacci();
        int n;
        if (args.length>0){
            n = Integer.parseInt(args[0]);
            System.out.println(Obj1.fib(n));
        }
         System.out.println(Obj1.fib_golden(50));
        System.out.println(Obj1.fib(50));



    }
}
