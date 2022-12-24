public class Kamar {
    public int no_kamar;
    public String lokasi;

    public int getNo_kamar() {
        return no_kamar;
    }

    public void setNo_kamar(int no_kamar) {
        this.no_kamar = no_kamar;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public void DataKamar(){
        System.out.println("1. Private Room -----Rp.200.000");
        System.out.println("2. Suites Room-----Rp.400.000");
        System.out.println("3. President Room -----Rp.500.000");
    }
}