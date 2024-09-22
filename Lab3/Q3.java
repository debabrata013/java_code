package Lab3;
import java.util.*;
public class Q3 {
    public static void main(String[] args){
      Scanner i= new Scanner(System.in);

      System.out.println("Enter the year : ");
      int y= i.nextInt();
      System.out.println("Enter the month no : ");
      int  m=i.nextInt();
       if(m!=2){
        if(m==4|| m==6||m==9||m==11){
            System.out.println("The number of Days : 30 ");
        }else{
            System.out.println("The nun=mbers of  Days : 31");
        }
       }else{
     // calculate leaf year
     
        if((y%400 == 0)||((y%4==0)&&(y%100!=0))){
            System.out.println("The numbers of Days : 29");
         
        } 
        else{
            System.out.println("The numbers of Days is 28");
        }
        
     }
        

       }

    }
    

