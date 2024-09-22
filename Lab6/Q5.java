package Lab6;

class Library{
 private String book[]=new String[100];private int n=-1;
 public void addBook(String name){
      n++;
    book[n]=name;
    System.out.println(name+" is added to library");
  }
    public void removeBook(){
        if(n<0){
            System.out.println("no book present");
        }else{
            System.out.println(book[n]+" is removed ! ");
            n--;
            
        }
    }

}
public class Q5 {
    public static void main(String[] args) {
        Library l = new Library();l.addBook("Java");
        l.removeBook();
    }
        
    }
    

