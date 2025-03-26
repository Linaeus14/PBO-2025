package model;

import interf.*;

public class ParuhWaktu implements Pekerja, Pelajar {
    private String nama;
    private int umur;
    private String perusahaan;
    private String universitas;

    public ParuhWaktu(String nama, int umur, String perusahaan, String universitas) {
        this.nama = nama;
        this.umur = umur;
        this.perusahaan = perusahaan;
        this.universitas = universitas;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    @Override
    public void tampilkanInfoPekerja() {
        System.out.println("Perusahaan: " + perusahaan);
    }

    @Override
    public void tampilkanInfoPelajar() {
        System.out.println("Universitas: " + universitas);
    }
}
