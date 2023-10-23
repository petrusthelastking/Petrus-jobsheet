import java.util.Scanner;

public class StatistikArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input banyaknya elemen
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();

        // Deklarasi array
        int[] arr = new int[jumlahElemen];

        // Input nilai tiap elemen
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Menghitung nilai tertinggi, terendah, dan rata-rata
        int nilaiTertinggi = arr[0];
        int nilaiTerendah = arr[0];
        int total = arr[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (arr[i] > nilaiTertinggi) {
                nilaiTertinggi = arr[i];
            }
            if (arr[i] < nilaiTerendah) {
                nilaiTerendah = arr[i];
            }
            total += arr[i];
        }

        double rataRata = (double) total / jumlahElemen;

        // Menampilkan hasil
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-Rata: " + rataRata);
    }
}
