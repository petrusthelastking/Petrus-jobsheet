import java.util.Scanner;
public class Forvar322{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil, n;
        Boolean berhenti = false;
        for (n = 0; !berhenti; n++) {
            System.out.print("Masukakan bilangan: " );
            bil = sc.nextInt();
            System.out.println("bilangan yang anda masukakn:" + bil);
            if (bil < n) {
                berhenti = true;
            }
        }
        System.out.println("Program berakir");
    }
}