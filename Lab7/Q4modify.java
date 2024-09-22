package Lab7;

import java.util.Scanner;

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
public class Q4modify {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);int choice=1;

        Movie m1=new Movie("EndGame","J.S ohs", "Tony");
        // m1.addReview("nice one ");
        while(choice==1){
            System.out.println("Enetr 1 to add review , Enter 0 to exit");
            choice=s.nextInt();
            if(choice==0){
                break;
            } System.out.println("Enter review :");
            String a=s.next();
            m1.addReview(a);

        }

        m1.display();
        
    }
    
}


