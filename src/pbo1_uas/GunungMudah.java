package pbo1_uas;

public class GunungMudah extends Gunung {
    public GunungMudah(String nama, int ketinggian) {
        super(nama, ketinggian);
    }

    @Override
    public String saran() {
        return "Cocok untuk pemula. Jangan lupa bawa jaket!";
    }
}