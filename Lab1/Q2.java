package Lab1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        char ar[][]=new char[3][4];
        char [] alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //  System.out.println(alpha.length);
        int con=25;
        System.out.println(" the Alphabets Staring from z upto lats 12 alphabets are :");
        for (int j = 0 ;j<3;++j){
            for(int k =0;k<4;k++){
                ar[j][k]= alpha[con];
                con--;
            }
    }

    // System.out.println("The elements are :");
     for (int j = 0 ;j<3;++j){
            for(int k =0;k<4;k++){
               System.out.print(ar[j][k]+" ");
            }
            System.out.println();
    }

}
    
}
