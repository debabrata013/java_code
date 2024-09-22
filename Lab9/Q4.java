package Lab9;

public class Q4 {
    static{
        System.out.println("Inside Static Block");
    }
    static int a=10;
    static void pf(){
        System.out.println("inside static method");
    }
    public static void main(String[] args) {
        System.out.println("a="+a);
        pf();
    }
    
}
