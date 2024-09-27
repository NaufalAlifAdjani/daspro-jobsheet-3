import java.util.Scanner;

public class Kafe16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi =12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        // int InthargaKopi=(int)hargaKopi, InthargaTeh=(int) hargaTeh, InthargaRoti=(int)hargaRoti;
        byte InthargaKopi=(byte)hargaKopi, InthargaTeh=(byte)hargaTeh, InthargaRoti=(byte)hargaRoti;
        float diskon = 10/100f;

        System.out.print("Masukkan keanggotaan (true/false) : ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi : ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh : ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti : ");
        jmlRoti = input.nextInt();

        totalHarga = ((jmlKopi*InthargaKopi)+(jmlTeh*InthargaTeh)+(jmlRoti*InthargaRoti));
        byte totalByte=(byte) totalHarga;
        nominalBayar = totalByte-(diskon*totalByte);
        int nominalInt=(int)nominalBayar;

        System.out.println("Keaanggotaan pelanggan : "+keanggotaan);
        System.out.println("Item pembelian "+jmlKopi+" kopi, "+jmlTeh+" teh, "+jmlRoti+" roti");
        System.out.println("Nominal bayar : Rp "+nominalInt);
    }
}
