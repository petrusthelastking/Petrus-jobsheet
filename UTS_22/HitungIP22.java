import java.util.Scanner;
import java.text.DecimalFormat;

public class HitungIp22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Format IP menjadi dua desimal

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        double totalNilaiSks = 0.0; // Total nilai x SKS
        int totalSKS = 0;
        int mataKuliahRemidi = 0;

        for (int i = 1; i <= jumlahMataKuliah; i++) {
            scanner.nextLine(); // Membersihkan buffer

            System.out.print("Masukkan nama mata kuliah ke-" + i + ": ");
            String namaMataKuliah = scanner.nextLine();

            System.out.print("Masukkan nilai mata kuliah (A/B+/B/C+/C/D/E): ");
            String nilai = scanner.nextLine();

            System.out.print("Masukkan jumlah SKS mata kuliah: ");
            int sks = scanner.nextInt();

            // Konversi nilai ke IP
            double ip = 0.0;
            switch (nilai) {
                case "A":
                    ip = 4.0;
                    break;
                case "B+":
                    ip = 3.5;
                    break;
                case "B":
                    ip = 3.0;
                    break;
                case "C+":
                    ip = 2.5;
                    break;
                case "C":
                    ip = 2.0;
                    break;
                case "D":
                    ip = 1.0;
                    mataKuliahRemidi++;
                    break;
                case "E":
                    ip = 0.0;
                    mataKuliahRemidi++;
                    break;
                default:
                    System.out.println("Nilai tidak valid, silakan masukkan nilai yang valid.");
                    i--; // Jika nilai tidak valid, ulangi input mata kuliah ini
                    continue;
            }

            // Hitung total nilai x SKS
            totalNilaiSks += ip * sks;
            totalSKS += sks;
        }

        double IP = totalNilaiSks / totalSKS;

        System.out.println("-------------------Perhitungan IP Mahasiswa Remidi atau Tidak-------------------------");
        System.out.println("\nNama Mahasiswa: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP): " + decimalFormat.format(IP));
        System.out.println("Total Mata Kuliah: " + jumlahMataKuliah);
        System.out.println("Total SKS: " + totalSKS);
        System.out.println("Mata Kuliah Perlu Remidi: " + mataKuliahRemidi);
        System.out.println("---------------------------Semangat Untuk Semuanyaaaa----------------------------------");
    }
}
