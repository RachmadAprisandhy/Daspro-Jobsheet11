import java.util.Scanner;

public class kubus_18 {
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        int s = input.nextInt();

        int L = hitungLuas(s);
        System.out.println("Luas Permukaan kubus adalah: " + L);

        int vol = hitungVolume(s);
        System.out.println("Volume Kubus adalah: " + vol);
    }
    static int hitungLuas(int a) {
        int Luas = 6 * (a * a);
        return Luas;
    }

    static int hitungVolume(int a) {
        int volume = a * a * a;
        return volume;
    }
}