package Lab7;
class Employee{
     String name;int salary,hired;
     final int year=2023;
     Employee(  String name,int salary,int hired){
        this.name=name;
        this.salary = salary ;
        this.hired = hired;
}
int calculate(){
return year-hired;
}

}
public class Q3 {
    public static void main(String[] args) {
        Employee e1=new Employee("Rahul",56489,2005);
        System.out.println("\nName : "+e1.name+"\nsalary : " +
        e1.salary+"\nYear of experiance :"+e1.calculate());
    }
    
}
