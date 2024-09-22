package Lab7;
class person{
     String name; int age;
     person(String name,int age){
        this.name=name; this.age = age;}
        void print(){
            System.out.println("name :"+this.name+" , age :"+this.age);
        }
}
public class Q1 {
    public static void main(String[] args) {
        person p1 = new  person ("SHIVAYA",23 );
        person p2 = new  person ("KRISHNA",23 );
           p1.print(); p2.print();
    }
    
}
