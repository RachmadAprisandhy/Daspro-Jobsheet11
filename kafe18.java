public class kafe18 {

    public static void menu(String NamaPelanggan, boolean isMember){
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
        
    }

    public static void main(String[] args) {
        menu("Andi",true);
    }
}