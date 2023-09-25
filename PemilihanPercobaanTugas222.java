import java.util.Scanner;
public class PemilihanPercobaan222{
    public static void main(String[] args){
        Scanner input00 = new Scanner(System.in);
        System.out.print("Nilai uas     : ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis     : ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas     : ");
        float tugas = input00.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akir = " + total + " sehingga " + message);
        String nilaiHuruf;
        if (total >= 80) {
            nilaiHuruf = "A";
        } else if (total >= 73) {
            nilaiHuruf = "B";
        } else if (total >= 65) {
            nilaiHuruf = "C";
        } else {
            nilaiHuruf = "D";
        }

        System.out.println("Nilai akhir = " + total + ", nilai huruf: " + nilaiHuruf);
    }
}