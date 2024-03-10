package String;

public class Palindrome {
    
    public static boolean palindrome(String word){
        char[]arr=word.toCharArray();
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String[]args){
        System.out.println(palindrome("madam"));
    }
    
}