package Lab6;

import java.util.Scanner;

class Student
{
    Scanner sc=new Scanner(System.in);
    String name,courseName[],sCourse[];
    int roll,n;
    Student(){
        System.out.print("Enetr student name :");
        name=sc.nextLine();
        System.out.print("Enetr rollno");
        roll=sc.nextInt();
        System.out.print("Enetr no of course :");
        int n=sc.nextInt();courseName= new String[n];sCourse=new String[n];
        System.out.print("Enetr course names :");
        for(int i=0;i<n;i++){
                       courseName[i]=sc.next();
        }

    }
    void cour(){
        for (String s:courseName) {
            System.out.print(s+" ");
    }}
    void scour(){
        System.out.print("Enetr no of course to be selected :");
        int n=sc.nextInt();
        System.out.print("enter seleted course :");
for(int i=0;i<n;i++){
    sCourse[i]=sc.next();
} }
void display(){
    System.out.println("Student Details:");
    System.out.print("name:"+this.name+"\troll:" + this.roll +"\t Selected course : " );
    scour();
       for (int i=0;i<n;i++){
        System.out.print("\t"+" "+sCourse[i]);
       }

}


}
public class Q2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        System.out.println("all the course which is tacken :");
               s1.cour();
        
    }
    
}
