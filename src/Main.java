//Herdi Andra Fata Rizqi / 123210005

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nama;
        int kecepatan;

        Ikan Ikan1 = new Ikan();
        Ayam Ayam1 = new Ayam();
        Singa Singa1 = new Singa();

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nama ikan: ");
        nama = scan.nextLine();
        Ikan1.setNama(nama);
        System.out.println("Masukkan nama ayam: ");
        nama = scan.nextLine();
        Ayam1.setNama(nama);
        System.out.println("Masukkan nama singa: ");
        nama = scan.nextLine();
        Singa1.setNama(nama);
        try {
            System.out.println("Kecepatan lari singa: ");
            kecepatan = scan.nextInt();
        } catch (Exception err) {
            scan.next();
            System.out.println("Masukkkan integer: ");
            kecepatan = scan.nextInt();
//            kecepatan = 0;
        }

        System.out.println("Ikan ini bernama " + Ikan1.nama);
        Ikan1.habitat();
        Ikan1.makan();
        System.out.println(Ikan1.nama + " mempunyai " + Ikan1.jumlahKaki() + " kaki");

        System.out.println("Ayam ini bernama " + Ayam1.nama);
        Ayam1.habitat();
        Ayam1.makan();
        System.out.println(Ayam1.nama + " mempunyai " + Ayam1.jumlahKaki() + " kaki");

        System.out.println("Singa ini bernama " + Singa1.nama);
        Singa1.habitat();
        Singa1.makan();
        System.out.println(Singa1.nama + " mempunyai " + Singa1.jumlahKaki() + " kaki");
        Singa1.berburu();
        Singa1.berlari(kecepatan);
        Singa1.terbang();
        
    }
}
