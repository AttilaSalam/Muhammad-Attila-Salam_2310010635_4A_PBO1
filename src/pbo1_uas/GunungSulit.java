package pbo1_uas;

public class GunungSulit extends Gunung {
    public GunungSulit(String nama, int ketinggian) {
        super(nama, ketinggian);
    }

    @Override
    public String saran() {
        return "Hanya untuk pendaki berpengalaman. Wajib latihan fisik!";
    }
}
