package Lab8;



class Shape{
 void getPerameter(){

 }void getArea(){

 }
}
class Circle extends Shape{
    double r,area ;
Circle(double r){
    this.r=r;

}
 void getPerameter(){
  
    System.out.println("The perimeter is :"+2*3.14*r );
 }
 void getArea(){
    area = 3.14 * (r*r);
    System.out.println("The Area of the circle : "+area);
 }
    

}
public class Q4 {
    public static void main(String[] args) {
        Shape a=new Circle(5.2);
        a.getPerameter();
        a.getArea();
        
    }
    
}
