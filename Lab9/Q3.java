package Lab9;
class Test {
    int x;

    // Constructor with a parameter
    Test(int x) {
        this.x = x; 
    }

    // Instance method
    void method() {
        System.out.println("Value of x is " + this.x);  
    }

   void geto(int a){
        System.out.println("The value of a is "+a);

    }
    void getoDisplay(){
 
        this.geto(5);
    }
   
}
public class Q3 {
  
    public static void main(String[] args) {
        Test t = new Test(10);
        
        t.method();
      
        t.getoDisplay();
       }
    
}
