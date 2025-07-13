package pbo1_uas;

public class Gunung {
    private String nama;
    private int ketinggian;

    public Gunung(String nama, int ketinggian) {
        this.nama = nama;
        this.ketinggian = ketinggian;
    }

    public String getNama() {
        return nama;
    }

    public int getKetinggian() {
        return ketinggian;
    }

    public String saran() {
        return "Persiapkan fisik dan logistik.";
    }
}
