import java.util.*;
import java.lang.String;
 
public class CheckingSubstring2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String string1 = input.next();				//inputting string through console
        System.out.println("Please enter a second String: ");
        String substring = input.next();				//inputting substring through console
        if (isSubstring(string1, substring)) {		//calling the boolean method
            System.out.println("The second string is a substring of the first.");	//prints this if the return value is true
        } else {
            System.out.println("The second string is NOT a substring of the first.");	//prints this if the return value is false
        }
    }   
    public static boolean isSubstring(String string1, String substring) {
        char c[]=string1.toCharArray();
        char d[]=substring.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if(c[i] == d[0]){
                boolean match = false;
                for(int j = 0; j < d.length; j++){
                    if(c[i+j] != d[j]){			//checks for characters sequentially
                        match = false;
                        break;
                    } else{
                        match = true;
                    }
                }
                if(match){			//returns true if match is true
                	return true;
                }
            }   
        }
        return false;
    }
}
        

