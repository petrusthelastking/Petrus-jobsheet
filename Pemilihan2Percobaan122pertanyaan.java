import java.util.Scanner;

public class Pemilihan2Percobaan122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tahun:");
        int tahun = input.nextInt();
        input.close();

        // Tahun 2100 adalah tahun bukan kabisat, jadi kita periksa ini terlebih dahulu.
        if (tahun == 2100) {
            System.out.println("Bukan Tahun Kabisat (2100)");
        } else if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
