package Lab7;
class Circle{
     double radius = 1.0;
     double area(){
        return Math.PI * (radius*radius);
     }
     double perimeter(){
        return  2*(Math.PI)*this.radius ;
     }
}

public class Q5 {

    public static void main(String[] args) {
        Circle c1=new Circle();c1.radius=5.2;
        System.out.println("Area  : "+c1.area()+"\n Perimeter  :" +c1.perimeter());
              

    }
    
}
