
import java.util.Random;
import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char menu ='y';
        do {
            int angka = random.nextInt(10) + 1;
            boolean sukses = false;
            do {
                System.out.print("Tebak Angka (1-10): ");
                int jawaban = input.nextInt();
                input.nextLine();
                if (jawaban < angka) {
                    System.out.println("Tebakan Anda terlalu kecil!");
                } else if (jawaban > angka) {
                    System.out.println("Tebakan Anda terlalu besar!");
                } else {
                    sukses = true;
                    System.out.println("Selamat, tebakan Anda benar!");
                }
            } while (!sukses);
            System.out.println("Apakah Anda Ingin Mengulangi Permainan ? (Y/y) = ");
            menu = input.nextLine().charAt(0);
        } while (menu=='y' || menu=='Y');
        System.out.println("Terima kasih telah bermain!");
        input.close();
    }
}
