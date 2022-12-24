import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {

        java.io.File file = new java.io.File("pbo.txt");
        try (Formatter rile = new Formatter("C:\\Users\\ikhsa\\IdeaProjects\\pbogess\\src\\pbo.txt")){
            String nama ="Ikhsan Maulana";
            rile.format(nama);
            String spasi = "\n";
            rile.format(spasi);
            String matkul ="Pemrogaman Berbasis Objek";
            rile.format(matkul);
            String spasi2 = "\n";
            rile.format(spasi2);
            String univ ="Universitas Ahmad Dahlan";
            rile.format(univ);
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        Resepsionis resepsionis = new Resepsionis();
        Tamu tamu = new Tamu();
        Makanan makanan = new Makanan();
        Housekeeping housekeeping = new Housekeeping();
        Bayar bayar = new Bayar();
        Kamar villa = new Kamar();
        Scanner input = new Scanner(System.in);
        Chef chef = new Chef() {
            @Override
            public void Nmchef() {
                System.out.println("Nama Chef : "+""+namachef);
                System.out.println("Alamat    : "+""+alamat);
            }
        };


        System.out.println("=====MENU RESEPSIONIS====");
        System.out.println("Masukkan kamar yang tersedia : ");
        String kamar = input.nextLine();
        resepsionis.setKamar(kamar);
        resepsionis.cekKamar();
        System.out.println("Cek Data : 1. Yes/9. Lanjut");
        int pil2 = input.nextInt();
        if (pil2 == 1) {
            System.out.println("FITUR RESEPSIONIS");
            System.out.println("Lihat data 1.HouseKeeping/2.Data Makanan/3.Data Kamar/4. Chef");
            int pil3 = input.nextInt();
            if (pil3 == 1) {
                housekeeping.datahousekeeping();
            } else if (pil3 == 2) {
                makanan.DataMakanan();
            } else if (pil3 == 3) {
                villa.DataKamar();
            } else if (pil3 == 4) {
                chef.Nmchef();
            }else{
                System.out.println("Data tidak ditemukan");
            }

        }
        System.out.println("===============================================");
        System.out.println("Halo Selamat Datang Di Villa Nusa Indah");
        System.out.println("===============================================");
        String trik = input.nextLine();
        tamu.setNama(trik);
        System.out.print("Masukkan Nama anda : ");
        String namat = input.nextLine();
        tamu.setNama(namat);
        System.out.print("Masukkan Alamat anda : ");
        String alamtt = input.nextLine();
        tamu.setAlamat(alamtt);
        System.out.print("Masukkan No.Telp anda : ");
        int no_telpp = input.nextInt();
        tamu.setNo_hp(no_telpp);
        System.out.println("==============================");
        System.out.println("Halo Mr/Mrs. " + namat);
        System.out.println("MENU TAMU ");
        System.out.println("==============================");
        int jawab;
        do {
            System.out.println("1. Booking Kamar ");
            System.out.println("2. Pesen makan");
            System.out.println("Masukkan Pilihan yang anda inginkan");
            int pili = input.nextInt();
            if (pili == 1) {
                resepsionis.bookingkamar();
                resepsionis.prosesBayar();
                bayar.pembayaran();
            } else if (pili == 2) {
                makanan.DataMakanan();
                tamu.ordermakan();
            }
            System.out.println("Apakah ada ingin yang ditambahkan lagi ? 1.yes/2.No");
            jawab = input.nextInt();
        } while (jawab == 1);

        System.out.println("=========================================");
        tamu.masuk();
    }
}