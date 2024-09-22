package Lab7;
class Ractangle{
    float height,width;
    Ractangle(float height,float width){
        this.height=height;
        this.width = width;}
        float area(){
            return this.height * this.width ;}
            float perimeter(){
                return 2*(this.height+this.width);}
            }
        public class Q2 {
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle (5f ,6f);
        System.out.println("Area  : "+r1.area()+"\n Perimeter : " +r1.perimeter() );
        
    }
    
}
