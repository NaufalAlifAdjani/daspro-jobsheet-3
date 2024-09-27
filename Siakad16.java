import java.util.Scanner;

public class Siakad16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiAkhir, nilaiUAS;

        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();

        System.out.println("");
        
        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        nilaiUAS = sc.nextDouble();

        System.out.println("");
        nilaiAkhir = ((nilaiKuis*20/100)+(nilaiTugas*15/100)+(nilaiUTS*30/100)+(nilaiUAS*35/100));

        System.out.print("Mahasiswa dengan nama "+nama+" (NIM "+nim+") ");
        System.out.println("kelas : "+kelas+" nomor absen: "+absen);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        
    }
}