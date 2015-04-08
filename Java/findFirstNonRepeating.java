import java.lang.Character;
import java.lang.Integer;
import java.lang.String;

class findFirestNonRepeating{

    public static void main(String[] args) {
        String str = args[0];
        System.out.println(findFirstNonRepeatingChar(str));

    }

    private static Character findFirstNonRepeatingChar(String str) {
        Integer[] map = new Integer[128];
        for(int i =0; i<str.length(); i++){
            if (map[str.charAt(i)] == null){
                map[str.charAt(i)] = 1;
            }
            else {
                map[str.charAt(i)]++;
            }

        }

        for (int i =0; i<str.length(); i++){
           if (map[str.charAt(i)] == 1){
               return str.charAt(i);
           }
        }
        return null;
    }
}