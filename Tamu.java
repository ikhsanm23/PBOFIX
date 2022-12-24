import java.util.Scanner;

public class Tamu {

    Scanner in = new Scanner(System.in);
    public int id_tamu, no_tlp;
    public String nama, alamat;

    public int getId_tamu() {
        return id_tamu;
    }

    public void setId_tamu(int id_tamu) {
        this.id_tamu = id_tamu;
    }

    public int getNo_hp() {
        return no_tlp;
    }

    public void setNo_hp(int no_hp) {
        this.no_tlp = no_hp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void masuk(){
        System.out.println("nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("No.tlp : "+no_tlp);
        System.out.println("terima kasih telah registrasi");
    }

    public void keluar(){
        System.out.println("Thanks for visited");
    }

    public void ordermakan(){
        int pesan;
        System.out.println("Mau order apa? ");
        pesan = in.nextInt();
        if(pesan==1){
            System.out.println("Anda memesan bakso ");
            System.out.println("Pesanan akan segera kami antar");
        }else if(pesan==2){
            System.out.println("Anda memesan sate");
            System.out.println("Pesanan akan segera kami antar");
        }else if(pesan==3){
            System.out.println("Anda memesan seblak ");
            System.out.println("Pesanan akan segera kami antar");
        }else if(pesan==4){
            System.out.println("Anda memesan mie ayam ");
            System.out.println("Pesanan akan segera kami antar");
        }else if(pesan==5){
            System.out.println("Anda memesan pecel ");
            System.out.println("Pesanan akan segera kami antar");
        }else{
            System.out.println("menu tidak tersedia");
            System.out.println("Pesanan batal");
        }

    }

}