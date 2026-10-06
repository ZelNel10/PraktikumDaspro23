import java.util.Scanner;

public class StudiKasus123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if(totalHarga >=100000) {
            diskon = totalHarga * 10/100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("total harga : Rp " + totalHarga);
        System.out.println("diskon : Rp " + diskon);
        System.out.println("total Bayar : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("uang tidak cukup, kurang : Rp " + kurang);
        }
        input.close();
    }
}
