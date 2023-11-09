import java.util.Scanner;

public class NestedLoop2341760011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-"+(j+1) + ": ");
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        int Indeks = 1;
        for (double[] kotaTemps : temps) {
            System.out.print("Kota ke-" + Indeks++ + ": ");
            double totalSuhu = 0;
            for (double suhu : kotaTemps) {
                System.out.print(suhu + " ");
                totalSuhu += suhu;
            }
            double rataRata = totalSuhu / kotaTemps.length;
            System.out.println("\nRata-rata suhu: " + rataRata);
        }
    }
}
