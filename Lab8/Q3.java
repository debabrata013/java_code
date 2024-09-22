package Lab8;

import java.util.*;

class Person{
    Scanner o=new Scanner(System.in);
    String fname,lname,title;
    void getFirstname(){
        System.out.println("Enter the first name:");
        fname=o.next();}
        void getLastname(){

        }

}
class Employee extends Person{
    int empId;
    void getEmployeeId(){
        System.out.println("Enter employe id");
    empId=o.nextInt();
    System.out.println("Employee detailes name :"+fname+" "+lname+"\njob title :"+title+"\nEmployee Id:"+empId);
    }
     void getLastname(){
        System.out.println("Enter the employe lastname");
        lname=o.next();
        System.out.println("Enter the job title :");
        title=o.next();
}

}

public class Q3 {
    public static void main(String[] args) {
        Employee a=new Employee();
        a.getFirstname();
        a.getLastname();
        a.getEmployeeId();
    }
    
}
