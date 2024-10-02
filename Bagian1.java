import java.util.*;

public class Bagian1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int input;

        do {
            System.out.println("Pilih Rumus yang ingin dihitung\n1. Balok\n2. Bola \n0. Keluar");
            System.out.print("Masukkan pilihan: ");
            input = s.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Masukkan panjang balok: ");
                    double panjang = s.nextDouble();
                    System.out.println("Masukkan lebar balok: ");
                    double lebar = s.nextDouble();
                    System.out.println("Masukkan tinggi balok: ");
                    double tinggi = s.nextDouble();
                    double volumeBalok = panjang * lebar * tinggi;
                    System.out.println("Volume balok adalah: " + volumeBalok);
                    break;
                case 2:
                    System.out.println("Masukkan jari-jari bola: ");
                    double jariJari = s.nextDouble();
                    double volumeBola = 4.0 / 3.0 * Math.PI * Math.pow(jariJari, 3);
                    System.out.printf("Volume bola adalah: %.2f", volumeBola);
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (input != 0);

    }
}