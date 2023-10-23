import java.util.Scanner;

public class ArrayNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek Scanner
        int[] nilaiAkhir = new int[10]; // Deklarasi array nilaiAkhir dengan panjang 10

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println("Status Kelulusan Mahasiswa:");

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus");
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus");
            }
        }
    }
}
