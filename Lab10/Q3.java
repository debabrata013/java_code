
package Lab10;
import java.util.Arrays;

public class Q3 {
    
    // Q3:-    Write a Java program to get the index of all the characters 
    // in ascending order of characters of the alphabet in a given string.

    public static void main(String[] args) {
        String str = "Hello";
        // printCharacterIndices(str);
        str = str.toLowerCase();

        char a[] = new char[str.length()+1];
        int count = 0;

      
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                a[count++] = c;
            }
        }

        Arrays.sort(a, 0, count);


        for (int i = 0; i < count; i++) {
            char currentChar = a[i];
             int r=getIndex(str, currentChar,0);
            System.out.println(currentChar + " " + r);
            if(currentChar==a[i+1]){
               
                i+=1;
                System.out.println(currentChar + " " + getIndex(str, currentChar,r+1));

            }
        }
    }
    

 
    private static int getIndex(String str, char target,int a) {
        for (int j = a; j < str.length(); j++) {
            if (str.charAt(j) == target) {
                return j;
            }
        }
        return -1; 
    }
}
