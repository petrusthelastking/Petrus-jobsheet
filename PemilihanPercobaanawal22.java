import java.util.Scanner;
public class PemilihanPercobaan22 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input00.nextInt();
        String jenisBilangan = ( angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("angka" + angka + " angka anda bersifat" + jenisBilangan);
        if (angka % 2 == 0) 
            System.out.println("Angka "+angka+" bilangan genap");
        else
            System.out.println("Angka "+angka+" bilangan ganjil");
    }
}

