import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);         
        String str = "";
         
        System.out.print("Masukkan text: ");
        str = input.nextLine();
        
        str = str.toLowerCase();
        System.out.println(isPalindrome(str));
    }     
    
    public static String isPalindrome(String str)
    {
        String rev = ""; 
        String ans = "";
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        if (str.equals(rev)) {
          ans = "Palindrome";
        }
        else {
          ans = "Bukan Palindrome";
        }
        return ans;
    }
}