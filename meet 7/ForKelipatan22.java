import java.util.Scanner;

public class Forkelipatan22 {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        int kelipatan = scan.nextInt();
        int total = 0;
        int counter = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }

        System.out.println("banyaknya bilangan " + kelipatan + " dari 1 hingga 50 adalah: " + counter);
        System.out.println("Total bilangan " + kelipatan + " dari 1 hingga 50 adalah: " + total);
        
        // Menutup objek Scanner
        scan.close();
    }
}
