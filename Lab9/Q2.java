package Lab9;
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

// Class implements both interfaces
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 of Interface 1");
    }

    public void method2() {
        System.out.println("Method 2 of Interface 2");
    }
}

public class Q2  {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Call methods
        myClass.method1();
        myClass.method2();
    }
    
}
