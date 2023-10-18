import java.util.Scanner;

public class Toko22 {

    public static void main(String[] args) {
        // Masukan
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("Apakah pelanggan member (y/n)? ");
        String isMember = scanner.nextLine();

        // Inisialisasi variabel
        int totalItem = 0;
        float totalHarga = 0;
        float totalDiskonMember = 0;
        float totalDiskonProduk = 0;

        // Perulangan untuk input produk
        boolean lanjut = true;
        while (lanjut) {
            System.out.print("Masukkan nama produk: ");
            String produk = scanner.nextLine();

            System.out.print("Masukkan kuantitas: ");
            int kuantitas = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan harga satuan: ");
            float hargaSatuan = Float.parseFloat(scanner.nextLine());

            System.out.print("Masukkan diskon (dalam persen, jika ada): ");
            float diskon = Float.parseFloat(scanner.nextLine());

            // Hitung total harga produk
            float totalHargaProduk = hargaSatuan * kuantitas;

            // Hitung diskon produk
            if (diskon > 0) {
                totalDiskonProduk += totalHargaProduk * (diskon / 100);
            }

            // Hitung total item
            totalItem += kuantitas;

            // Hitung total harga
            totalHarga += totalHargaProduk;

            // Tanyakan apakah ingin menambahkan produk lagi
            System.out.print("Ingin menambahkan produk lagi (y/n)? ");
            lanjut = scanner.nextLine().equals("y");
        }

        // Hitung diskon member
        if (isMember.equals("y")) {
            if (totalHarga >= 200000) {
                totalDiskonMember = 0.1f * totalHarga;
            } else {
                totalDiskonMember = 0.05f * totalHarga;
            }
        }

        // Hitung total diskon
        float totalDiskon = totalDiskonProduk + totalDiskonMember;

        // Hitung total akhir yang harus dibayar
        float totalAkhir = totalHarga - totalDiskon;

        // Output
        System.out.println("Nama pelanggan: " + nama);
        System.out.println("Tipe: " + (isMember.equals("y") ? "Member" : "Non-member"));
        System.out.println("Total item: " + totalItem);
        System.out.println("Total harga sebelum diskon: " + totalHarga);
        System.out.println("Total diskon: " + totalDiskon);
        System.out.println("Total akhir: " + totalAkhir);
    }
}
