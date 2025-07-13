package pbo1_uas;

public class Perjalanan {
    private Gunung gunung;
    private int durasiHari;

    public Perjalanan(Gunung gunung, int durasiHari) {
        this.gunung = gunung;
        this.durasiHari = durasiHari;
    }

    public Gunung getGunung() {
        return gunung;
    }

    public int getDurasiHari() {
        return durasiHari;
    }

    public void setDurasiHari(int durasiHari) {
        this.durasiHari = durasiHari;
    }

    public void infoPerjalanan() {
        System.out.println("Gunung: " + gunung.getNama());
        System.out.println("Tinggi: " + gunung.getKetinggian() + " mdpl");
        System.out.println("Durasi: " + durasiHari + " hari");
        System.out.println("Saran: " + gunung.saran());
    }
}

