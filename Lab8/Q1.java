package Lab8;

class Vahicle{
    void drive(){

    }
}
class Car extends Vahicle{
    public void drive(){
        System.out.println("Reparing a car");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Vahicle a=new Car();
        a.drive();
    }
    
}
