import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_xo {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan text : ");
            String str = br.readLine();
            
            System.out.println();
            
            int x = 0, o = 0;
            for (int i=0; i<str.length(); i++) {
                if (getXO(str.charAt(i))==1) 
                    x++;
                else 
                    o++;
            }

            if (x == o) {
                System.out.println("True");
            }
            else {                
                System.out.println("False");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error IOException : " + ioe.getMessage());
        }
    }
        
    private static int getXO(char text) {
        int xo;
        if (text=='X' || text=='x')
            xo = 1;
        else
            xo = 0;
        
        return xo;
    }
}