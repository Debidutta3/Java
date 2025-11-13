package LeetCode;

import java.util.*;
public class anagram {
    
    public static void ana(String str1, String str2){

        if(str1.length() != str2.length()){
            System.out.println("Length of strings arent same. So not an anagram");
            return;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Is anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }

    public static void main(String[] args) {
        ana("listen", "silent");  // ✅ Anagram
        ana("hello", "world");    // ❌ Not Anagram
    }
}
