import java.util.Scanner;

public class percobaan6_18{

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.println("Masukkan Panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan Tinggi");
        t = input.nextInt();

        L= hitungLuas(p,l);
        System.out.println(" Luas persegi panjang adalah : " + L);
        vol = hitungVolume(t,p,l);
        System.out.println(" volume persegi panjang adalah : " + vol);
    }

    static int hitungLuas (int pjg,int lb){
        int Luas = pjg *lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a,int b){
        int volume = hitungLuas(a, b) *tinggi;
        return volume;
    }
}