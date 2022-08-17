import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);         
        int x,n;
         
        System.out.print("Input x: ");
        x = input.nextInt();
        System.out.print("Input n: ");
        n = input.nextInt();
        
        double answer = Pow(x, n);

        System.out.println(answer);
    }       
    
    public static double Pow(double num, int exp) {
      double result =1;
      
      for (int i = 0; i < exp; i++) {      
        result *= num;      
      }
      
      return result;      
    }
}