/**
 * TarifListrik16
 */
import java.util.Scanner;
public class TarifListrik16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TarifListrik =1500, Listrik, totalTagihan;

        System.out.print("Masukkan jumlah penggunaan listrik per kWh : ");
        Listrik = input.nextInt();
        double doubleListrik = Listrik;
        
        System.out.println("Harga per kWh : Rp "+TarifListrik);

        totalTagihan = Listrik*TarifListrik;

        if (doubleListrik>500.0) {
            System.out.println("Penggunaan Listrik anda lebih dari 500 kWh");
        }

        System.out.println("Total Tagihan Listrik : Rp "+totalTagihan);

    }
}