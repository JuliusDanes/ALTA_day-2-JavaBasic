import java.util.Scanner;

public class FaktorBilangan {

    public static void main(String[] args) {
        Scanner a = new Scanner(System. in );
        System.out.println("Masukkan angka");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya:");
        int faktor = 0;
        for (int z = 0; z <= nilai; z++) {
            faktor++;
            if (nilai % faktor == 0) {
                System.out.println(faktor);
            }
        }
    }        
}