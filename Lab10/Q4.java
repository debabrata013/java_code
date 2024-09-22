package Lab10;

public class Q4 {
    // Q4:-	Write a Java program to find the given string is palindrome 
	// or not using String class.
    public static void main(String[] args) {
        String str = "racecar";
        int n = str.length();
        for (int i=0; i<n/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                System.out.println("The given string is not a Palindrome");
                return;
                }
                }
                System.out.println("The given string is a Palindrome");}





    
}
