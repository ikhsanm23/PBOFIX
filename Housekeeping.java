public class Housekeeping extends Pelayan {
    public String nama, alamat;
    public int no_hp;

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

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public void datahousekeeping(){
        System.out.println("Nama       : paijo");
        System.out.println("Alamat     : banjar");
        System.out.println("No telp    : 082302828373");
        System.out.println("\n");
        System.out.println("Nama       : tukiyem");
        System.out.println("Alamat     : klaten");
        System.out.println("No telp    : 082171713631");
        System.out.println("\n");
        System.out.println("Nama       : pram");
        System.out.println("Alamat     : jogja");
        System.out.println("No telp    : 082175379629");
    }

    @Override
    public String layan() {
        return null;
    }
}