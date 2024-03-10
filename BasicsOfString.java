package String;

import java.util.*;

public class BasicsOfString {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
//        use of sc.nextLine()
        String fullname=sc.nextLine();
        System.out.println(fullname);
        
//        use of sc.next()
        String firstName=sc.next();
        String lastName=sc.next();
        System.out.println(firstName);
        System.out.println(lastName);
        
//        concatination of 2 strings
        String concatinatedName=firstName+" "+lastName;
        System.out.println(concatinatedName);
        
//        find string length
        System.out.println(concatinatedName.length());
        
//        print every letter of a string individualy
        for(int i=0;i<concatinatedName.length();i++){
            System.out.print(concatinatedName.charAt(i)+" ");
        }
        System.out.println();
        
//        compare 2 strings
//        if s1 > s2 ; return +ve value
//        if s1 = s2 ; return 0
//        if s1 < s2 ; return -ve value
        if(firstName.compareTo(lastName)==0){
            System.out.println("Both are string are equal");
        }
        else if(firstName.compareTo(lastName)>0){
            System.out.println("s1 is grater than s2");
        }
        else if(firstName.compareTo(lastName)<0){
            System.out.println("s1 is smaller than s2");
        }
        
//      find substring
//      if we did not givs 2nd parameter than it automaticly take string last value as second parameter
        System.out.println(concatinatedName.substring(0,5));
        
    }
    
}
