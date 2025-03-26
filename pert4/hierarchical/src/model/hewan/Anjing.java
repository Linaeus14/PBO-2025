package model.hewan;

import model.Hewan;

public class Anjing extends Hewan {
    private String ras;

    public Anjing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ras: " + ras);
    }

    public void suara() {
        System.out.println("Suara: Guk-guk!");
    }
}
