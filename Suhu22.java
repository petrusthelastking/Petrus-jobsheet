import java.util.Scanner;
public class suhu19 {
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        int suhu;
        char hujan;

        System.out.println("Masukkan suhu : ");
        suhu = sc19.nextInt();
        System.out.println("Apakah hujan (y atau t)?");
        hujan = sc19.next().charAt(0);
        
        if (suhu > 27) {
            System.out.println("Memakai dress");
            if (hujan == 'y' ) {
                System.out.println("Membawa payung");
            }else {
                System.out.println("Memakai sunscreen");
            }
        } else {
            System.out.println("Memakai celana panjang");
        } 
    }
}