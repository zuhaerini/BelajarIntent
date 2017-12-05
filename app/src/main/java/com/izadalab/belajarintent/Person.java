package com.izadalab.belajarintent;

/**
 * Created by DhytoDev on 12/5/17.
 */

public class Person {
    private String nama;
    private int usia;
    private String email;
    private String kota;

    public Person() {
        this.nama = nama;
        this.usia = usia;
        this.email = email;
        this.kota = kota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }
}
