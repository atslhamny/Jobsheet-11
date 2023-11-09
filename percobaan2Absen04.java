import java.util.Scanner;

public class percobaan2Absen04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        if (N>=5) {
            for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
}
