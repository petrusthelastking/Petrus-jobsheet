import java.util.Scanner;
public class Pemilihan2Percobaan122{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tahun:");
        int tahun = input.nextInt();
        input.close();
        if ((tahun % 4) == 0){
            if((tahun % 100) == 0){
                if((tahun % 400) == 0){
                    System.out.println("Tahun Kabisat");
                }else{
                    System.out.println("Bukan Tahun Kabisat");
                }
            }else{
                System.out.println("Tahun Kabisat");
            }
        }else{
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
