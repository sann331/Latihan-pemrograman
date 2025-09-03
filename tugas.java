import java.util.Scanner;
public class tugas {

    public static void main(String[] args) {
        int hargaBeras, kg, hargaAwal;
        double diskon, hargaTotal, uang, kembalian;
        Scanner input = new Scanner(System.in);

        System.out.println("Kasir Toko Beras");
        hargaBeras = 12000;
        System.out.print("Beli berapa? (kg) = ");
        kg = input.nextInt();
        hargaAwal = hargaBeras * kg;
        System.out.println("Harga sebelum diskon = "+hargaAwal);
        System.out.print("Masukkan Diskon (%) = ");
        diskon = input.nextDouble();
        hargaTotal =hargaAwal - (hargaAwal * diskon/100);
        System.out.println("Harga Setelah Diskon = "+hargaTotal);
        System.out.print("Uang diterima = ");
        uang = input.nextInt();
        kembalian = uang - hargaTotal;
        System.out.println("Uang kembalian = "+kembalian);

        input.close();
    }
}