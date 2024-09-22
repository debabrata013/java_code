package Lab10;

public class Q1 {
  
// Q1:- 	Write a Java program to compare two strings lexicographically.
// 	Two strings are lexicographically equal if they are the same length 
// 	and contain the same characters in the same positions.
// 	For example, "abc" and "cba" are not lexicographically equal because although they have the same number of letters
// 	For example, "abcd" and "dcba" are not lexicographically equal because of different character orderings.
// 	However, "abcde" is lexicographically greater than or equal to "abc".
public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hey";
    int result = str1.compareTo(str2);
    System.out.println("The comparison between \""+str1+"\" and \""+str2+"\":");
    // System.out.println(result);
    if(result>0){
        System.out.println(str1+" is  greater than "+str2);
    }else if(result==0){
        System.out.println(str1+" equal "+str2);
    }else{
        System.out.println(str1+" is  lessthan "+str2);
    }
    
    }
    
}
