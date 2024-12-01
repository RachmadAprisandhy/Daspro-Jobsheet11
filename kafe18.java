import java.util.Scanner;

public class kafe18{

    public static void menu(String NamaPelanggan, boolean isMember) {
        System.out.println("Selamat datang pelanggan : " + NamaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, anda mendapat diskon 10% di setiap pembelian.");
        }

        System.out.println("========== MENU RESTORAN DaVinci ==========");
        System.out.println("1. Kopi Hitam - 15000");
        System.out.println("2. Capuccino - 20000");
        System.out.println("3. Latte - 22000");
        System.out.println("4. Teh Tarik - 12000");
        System.out.println("5. Roti Bakar - 10000");
        System.out.println("6. Mie Goreng - 18000");
        System.out.println("===========================================");
        System.out.println("= Silahkan masukkan menu yang anda inginkan =");
    }

    public static int hitungTotalHarga18(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] HargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = HargaItems[pilihanMenu - 1] * banyakItem;

        double diskon;
        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Mendapat diskon 50%");
                diskon = 0.5;
                break;
            case "DISKON30":
                System.out.println("Mendapat diskon 30%");
                diskon = 0.3;
                break;
            default:
                System.out.println("Kode promo invalid, tidak ada diskon.");
                diskon = 1;
                break;
        }
        hargaTotal = (int) (hargaTotal * diskon);
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc18.nextLine();
        System.out.print("Apakah anda member? (true/false): ");
        boolean isMember = sc18.nextBoolean();

        menu(namaPelanggan, isMember);

        String[] pesanan = new String[10];
        int[] hargaPesanan = new int[10];
        int totalHargaKeseluruhan = 0;
        int indexPesanan = 0;

        boolean tambahPesanan = true;

        while (tambahPesanan && indexPesanan < pesanan.length) {
            System.out.print("Masukkan no menu yang anda inginkan: ");
            int pilihanMenu = sc18.nextInt();
            System.out.print("Masukkan jumlah item yang anda pesan: ");
            int banyakItem = sc18.nextInt();
            System.out.print("Masukkan kode promo (jika ada): ");
            sc18.nextLine();
            String kodePromo = sc18.nextLine();

            int totalHarga = hitungTotalHarga18(pilihanMenu, banyakItem, kodePromo);
            totalHargaKeseluruhan += totalHarga;

            String namaMenu = switch (pilihanMenu) {
                case 1 -> "Kopi Hitam";
                case 2 -> "Capuccino";
                case 3 -> "Latte";
                case 4 -> "Teh Tarik";
                case 5 -> "Roti Bakar";
                case 6 -> "Mie Goreng";
                default -> "Menu Tidak Valid";
            };

            pesanan[indexPesanan] = namaMenu + " x" + banyakItem;
            hargaPesanan[indexPesanan] = totalHarga;
            indexPesanan++;

            System.out.print("Apakah anda ingin menambah pesanan lain? (true/false): ");
            tambahPesanan = sc18.nextBoolean();
        }
        if (isMember) {
            totalHargaKeseluruhan *= 0.9;
            System.out.println("Anda mendapat diskon tambahan 10% sebagai member.");
        }
        System.out.println("========== RINCIAN PESANAN ==========");
        for (int i = 0; i < indexPesanan; i++) {
            System.out.println(pesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("=====================================");
        System.out.println("Total harga keseluruhan: Rp " + totalHargaKeseluruhan);
        System.out.println("=====================================");
    
  
    }
}