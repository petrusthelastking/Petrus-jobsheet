public class BubbleSortExample22 {
    public static void main(String[] args) {
        int[] intData = { 34, 18, 87, 72, 32, 54, 43 };
        int temp = 0;

        for (int i = 0; i < intData.length; i++) {
            for (int j = 0; j < intData.length - 1 - i; j++) { // Perbaikan deklarasi variabel j dan batasan loop
                if (intData[j] > intData[j + 1]) {
                    // Swap elemen
                    temp = intData[j];
                    intData[j] = intData[j + 1];
                    intData[j + 1] = temp;
                }
            }
        }

        System.out.println("Hasil pengurutan:");
        for (int i = 0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }
    }
}
