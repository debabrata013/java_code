package lab4;

public class Q2 {
    static int fact (int i){
    int f=1;
    if(i==0){
        return 1;
    }
    
        for(int j=i;j>1;j--){
           f*=j; 

        }
        return f;
    }
    public static void main(String[] args) {
      double e=1.0;
      double demo=0.0;
     
      for(int i=2;i<=5;i++){
        int fac=fact(i);
       
        demo=1.0/fac;
      
        e+=demo;
      }
        
      System.out.println("e = "+e);
    }
    
}
