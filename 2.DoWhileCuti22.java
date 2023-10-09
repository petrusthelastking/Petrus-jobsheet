import java.util.Scanner;

public class DoWhileCuti22 {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next(); // Mengambil input dalam bentuk String

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                }
            }
        } while (jatahCuti >= 0);

        // Menutup objek Scanner
        sc.close();
    }
}
