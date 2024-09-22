package Lab7;
class Movie{
 String title,director,actor;
 Movie( String title,String director,String actor){
    this.title=title;this.director=director;this.actor=actor;
 }
 String review[]=new String[100];int n=-1;
 void addReview(String s){
    if (n<review.length-1) {
        ++n;
        review[n]=s;}
        }
        void display(){
            System.out.print("title :"+this.title+", director :"+this.director+", actor :"+this.actor+", Reviews :");
            for( int i = 0 ;i<=n;++i )
            System.out.print(review[i]+" ");
        }
}
public class Q4 {
    public static void main(String[] args) {
        Movie m1=new Movie("EndGame","J.S ohs", "Tony");
        m1.addReview("nice one ");
        m1.display();
        
    }
    
}
