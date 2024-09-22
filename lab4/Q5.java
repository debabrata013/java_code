
package lab4;
class Q5{
public static void main(String[] args) {
    // write a java code that create and display unique 3 digt numbers using 1 2 3 4 also count how many 3 diget numbers are there
  
  int c=0,d=0;
  for(int i=1;i<=4;i++){
for(int j=1;j<=4;j++){
for(int k=1;k<=4;k++){
   if(i!=j&&k!=j&&i!=k){
    c++;
    d=100*i+j*10+k;
    System.out.print(d+" ");
   }
    
  }
    
  }

  }
System.out.println("\nno of element :"+c);

}
}
