import java.util.Scanner;

public class CetakTabelPerkalian {

    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);         
        int n;
        System.out.print("Input n: ");
        n = input.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            for(int j = 1; j <= n; j++){ 
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n\n");
        }
    }
}