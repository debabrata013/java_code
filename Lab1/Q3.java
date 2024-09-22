package Lab1;


public class Q3 {
public static void main(String[] args) {
    String name="Debabrata Pattnayak",spa=" ";

    int sp=0,j=0;
    for(int i=0;i<name.length();i++){
        
            if(i== name.length()-1){
                System.out.printf("%s",name.substring(sp,name.length()));
                break;
            }else if(i==0){
                 System.out.printf("%c",name.charAt(i));
            }else if(name.charAt(i)==spa.charAt(0)){
System.out.printf(".%c",name.charAt(i+1));
  sp=i+2;
            }

        
    }
    
}
    
}
