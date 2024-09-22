package Lab9;
class Bank {
    
    public void intrestRate(int amount){}}
class SBI extends Bank{
    @Override
    public void intrestRate(int amount) {
        System.out.println("Total intrest in SBI :"+(amount*0.084)+"\nAfter 1year net amout :"+(amount+(amount*0.084)));
    }
}
class ICICI extends Bank{
    @Override
    public void intrestRate(int amount) {
        System.out.println("Total intrest in ICICI :"+(amount*0.073)+"\nAfter 1year net amout :"+(amount+(amount*0.073)));
        }

}
class AXIS extends Bank{
    @Override
    public void intrestRate(int amount) {
        System.out.println("Total intrest in AXIS :"+(amount*0.097)+"\nAfter 1year net amout :"+(amount+(amount*0.097)));
        }

}

public class Q1 {

    public static void main(String[] args) {
Bank a=new SBI();
a.intrestRate(500);
a=new ICICI();
a.intrestRate(2000);
a=new AXIS();
a.intrestRate(6000);
        
    }
    
}
