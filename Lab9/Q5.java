package Lab9;
class Parent {
    void showParent() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is the child class");
    }
}

// Interface
interface MyInterface {
    void showInterface();
}

public class Q5 extends Child implements MyInterface {
    public void showInterface() {
        System.out.println("This is the interface method");

    }

    public static void main(String[] args) {
        Q5 a = new Q5();

       
        a.showParent();
        a.showChild();
        a.showInterface();
    }
    
}
