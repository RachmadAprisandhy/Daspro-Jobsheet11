import java.util.Scanner;
public class kafe18 {

    public static void menu(String NamaPelanggan, boolean isMember,String KodePromo){
        Scanner sc18 = new Scanner(System.in);
        System.out.println("selamat datang pelanggan : " + NamaPelanggan + "!");
        if (isMember){
            System.out.println("Anda adalah member,anda mendapat diskon 10% di setiap pembelian");
        }
        
        System.out.println("========== MENU RESTORAN DaVinci ==========");
        System.out.println("1. Kopi Hitam - 15000");
        System.out.println("2. Capuccino - 20000");
        System.out.println("3. latte - 22000");
        System.out.println("4. Teh tarik - 12000");
        System.out.println("5. Roti Bakar - 10000");
        System.out.println("6. Mie goreng - 18000");
        System.out.println("===========================================");
        System.out.println(" =Silahkan masukan menu yang anda inginkan=");

        System.out.println("masukkan kode promo : ");
        KodePromo = sc18.nextLine();

        switch (KodePromo) {
            case "DISKON50":
                System.out.println("mendapat diskon 50%");
                break;
            case "DISKON30":
                System.out.println("mendapat diskon30%");
                break;
            default:
                System.out.println("kode invalid");
                break;
        }
        
    }

    public static void main(String[] args) {
        menu("Andi",true,"");
    }
}