package Lab10;


// Q5:-	Write a Java program to find the second most frequent character using array and loops 
// 	in a given string. 


public class Q5 {
    public static char fSMFC(String str) {
       
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty!");
            return '\0';
        }

        int[] cF = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            cF[ch]++;
        }

        char fMC = '\0';
        char sMC = '\0';

        for (int i = 0; i < cF.length; i++) {
            if (cF[i] > 0) {
                if (fMC == '\0' || cF[i] > cF[fMC]) {
                    sMC = fMC;
                    fMC = (char) i;
                } else if (sMC == '\0' || cF[i] > cF[sMC]) {
                    sMC = (char) i;
                }
            }
        }

        if (sMC == '\0') {
            System.out.println("There is no second most frequent character.");
        }

        return sMC;
    }

    public static void main(String[] args) {
        String a = "programming";
        char r = fSMFC(a);

        if (r != '\0') {
            System.out.println("The second most frequent character is: " + r);
        }
    }

        


    
    }


    

