import java.util.Scanner;
public class Gaji16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bonus,pajak,jamKerja,Upah = 50000, totalGaji, GajiAkhir;

        System.out.print("Masukkan Jam Kerja : ");
        jamKerja = input.nextInt();
        
        totalGaji = jamKerja*Upah;
        bonus = totalGaji*10/100;
        pajak = (totalGaji+bonus)*5/100;
        GajiAkhir = totalGaji+bonus-pajak;

        System.out.println("Total Gaji : Rp "+totalGaji);
        System.out.println("Bonus : Rp "+bonus);
        System.out.println("Pajak : Rp "+pajak);
        System.out.println("Gaji Akhir : Rp "+GajiAkhir);

    }
}
