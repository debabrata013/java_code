package Lab6;

public class Q4 {    
      double rate=0.05;
      public double calculateSimpleInterest(double principal,double time) {
        return principal * time * this.rate;
    }
      public double calculateSimpleInterest(double principal, double time, double rate) {
        
    
        return principal * time*rate;
    }

public static void main(String[] args) {
    Q4 obj = new Q4();
    System.out.println("The simple interest is "+obj.calculateSimpleInterest(123987 , 1));
    System.out.println("The simple interest is "+obj.calculateSimpleInterest(123987 , 1,0.56));

    
}

    
}
