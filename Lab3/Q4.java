package Lab3;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the 3 numbers :");
        int a=i.nextInt();
        int b=i.nextInt();
        int c=i.nextInt();
        System.out.println("The grater number is : ");
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }


  
    
}
