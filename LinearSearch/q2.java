package LinearSearch;
import java.util.*;
public class q2 {
    
    //function
    public static void stri(String str, char target){
        if(str.length() == 0){
            return; // Base case: empty string
        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                System.out.println("Character '" + target + "' found at index: " + i);
                return; // Exit after finding the character
            }
        }
        System.out.println("Character '" + target + "' not found in the string.");
    }

    public static void main(String[] args) {
        String str = "Kunal";
        char target = 'a';

        stri(str, target);
    }
}
