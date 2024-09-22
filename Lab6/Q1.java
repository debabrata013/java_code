package Lab6;

import java.util.*;
class Employee {
    Scanner sc=new Scanner(System.in);
    int salary,nSalary;
    int ds;

    String name,job;
    Employee(){
        System.out.print("Enter Employee name:");
        name =sc.nextLine();
        System.out.print("Enter Employee job:");
        job =sc.next();
        System.out.print("Enter Employee slary:");
        salary=sc.nextInt();ds=salary/30;
    
    }
    public void update(){ 
        salary=nSalary;
        System.out.println("Salaey updated !");
    }
    public void calculate(){
        System.out.print("Entar no. of working days :");
        int days=sc.nextInt();
     nSalary=days*ds;
        System.out.println("Salary calculated :"+nSalary);
    }

}

public class Q1  {
    public static void main(String[] args) {
        Employee e1=new Employee();

        e1.calculate();
        e1.update();

    }
    
}
