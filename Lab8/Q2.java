package Lab8;

import java.util.*;

class BankAccount{
    Scanner i=new Scanner(System.in);
    int acno,ibal;
    String name;
    BankAccount(){
          System.out.println("Enter acount number");
        acno=i.nextInt();
        System.out.println("Enter acount name ");
        name=i.next();
        System.out.println("Enter the inital");
        ibal=i.nextInt();
}
    void deposite(){
    
 }
  void withdraw(){ }
    
}
class SavingAccount extends BankAccount{
    SavingAccount(){
      super();
    }
    void deposite(){
        System.out.println("Enter ammount to deposit ");
        ibal+=i.nextInt();
        System.out.println("The amount after deposit "+ibal);

    }
    void withdraw(){
        if(ibal>100){
System.out.println("Enter the amount to withdraw :");
        int wb=i.nextInt();
        if(ibal-wb>100){
        ibal-=wb;
        System.out.println("Balance after withdraw "+ibal);}
        else{
            System.out.println("low balance");
        }  }
        else{
            System.out.println("low balance");
        } 
        
    }

}
public class Q2 {
    public static void main(String[] args) {
         Scanner c=new Scanner(System.in);
         BankAccount b1=new SavingAccount();
         int cg=1;
         while(cg<3){
            System.out.println("Enter \n 1 for Deposite \n 2 for withdraw\n 3 for exit");
            cg=c.nextInt();
            switch(cg){
                case 1: b1.deposite();
                break;
                case 2: b1.withdraw();
                break;
                case 3:
                System.out.println("exiting ");
                break;
                default :
                System.out.println("Wrong input  enter a valid one ");
                cg=c.nextInt();
            }


         }




    }
    
}
