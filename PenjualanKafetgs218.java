import java.util.Scanner;

public class PenjualanKafetgs218 {
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    
    public static void main(String[] args) {
        int[][] data = new int[menu.length][7];
        inputDataPenjualan(data, menu);
        tabelDataPenjualan(data, menu);
        menuPenjualanTertinggi(data, menu);
        rata2SetiapMenu(data, menu);
    }
    
    static void inputDataPenjualan(int[][] a, String[] b) { // Fungsi untuk input data penjualan
        Scanner input = new Scanner(System.in);
        System.out.println("========INPUT DATA PENJUALAN========");
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i] + ":");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                a[i][j] = input.nextInt();
            }
            System.out.println("--------------------");
        }
    }
    
    static void tabelDataPenjualan(int[][] a, String[] b) { // Fungsi untuk menampilkan tabel data penjualan
        System.out.println("========Tabel Data Penjualan========");
        System.out.print("\t");
        for (int i = 0; i < 7; i++) {
            System.out.print("Hari ke-" + (i + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + "\t");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
    
    static int[] totalMenu(int[][] a) { // Fungsi untuk menghitung total setiap menu
        int[] totalPerMenu = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                totalPerMenu[i] += a[i][j];
            }
        }
        return totalPerMenu;
    }
    
    static void menuPenjualanTertinggi(int[][] a, String[] b) { // Fungsi untuk mencari menu dengan penjualan tertinggi
        System.out.println("-- Menu Dengan Penjualan Tertinggi --");
        int[] totalPerMenu = totalMenu(a);
        int idx = 0;
        int tertinggi = 0;
        for (int i = 0; i < totalPerMenu.length; i++) {
            if (totalPerMenu[i] > tertinggi) {
                tertinggi = totalPerMenu[i];
                idx = i;
            }
        }
        System.out.println("Menu dengan total penjualan tertinggi adalah: " + b[idx]);
    }
    
    static void rata2SetiapMenu(int[][] a, String[] b) { // Fungsi menghitung rata-rata penjualan setiap menu
        System.out.println("-- Rata-rata Setiap Menu --");
        int[] totalPerMenu = totalMenu(a);
        for (int i = 0; i < totalPerMenu.length; i++) {
            double rata2 = (double) totalPerMenu[i] / 7;
            System.out.println("Rata-rata penjualan " + b[i] + ": " + String.format("%.1f", rata2));
        }
    }
}