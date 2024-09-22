package Lab1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class demo {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader( isr);
      
    // demo a= new demo();
    int b=Integer.parseInt(br.read());
    System.out.println(b);
       
    }
}
