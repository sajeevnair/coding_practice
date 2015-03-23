import java.lang.Boolean;
import java.lang.String;
import java.lang.System;

class RemoveDuplicates{
    public static void main(String[] args) {
        hasDuplicates("sasaas");
        hasDuplicates("abcde");

    }

    private static boolean hasDuplicates(String s1) {
        boolean[] charSet = new boolean[255];

        for (int i = 0 ; i < s1.length; i++){
            if( charSet[s1.charAt([i]])){
                System.out.println(s1+" has duplicates");
                return true;
            }
            else {
                charSet[s1.charAt(i)] = true;
            }

        }
        System.out.printf(s1 + " has all unique chars");
        return false;

    }
}