package javaapp1;

import java.util.ArrayList;

public class ListPetugas implements Peminjaman {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamatPetugas = new ArrayList<String>();
    private ArrayList<String> teleponPetugas = new ArrayList<String>();

    public ListPetugas() {
        this.namaPetugas.add("ADMIN 1");
        this.alamatPetugas.add("Jl. Kebon Jeruk No.1");
        this.teleponPetugas.add("0888092871");

        this.namaPetugas.add("ADMIN 2");
        this.alamatPetugas.add("Jl. Kebon Jeruk No.2");
        this.teleponPetugas.add("0888092871");

        this.namaPetugas.add("ADMIN 3");
        this.alamatPetugas.add("Sawojajar");
        this.teleponPetugas.add("0888092871");
    }

    // tampilkan salah satu petugas
    public void viewPetugas(int index) {
        System.out.println("Nama Petugas: " + this.namaPetugas.get(index));
        System.out.println("Alamat: " + this.alamatPetugas.get(index));
        System.out.println("Telepon: " + this.teleponPetugas.get(index));
        System.out.println();
    }

    @Override
    public void peminjaman() {

    }

    @Override
    public void pengembalian() {
        // TODO Auto-generated method stub

    }

    @Override
    public void viewStatusPeminjaman() {
        // TODO Auto-generated method stub

    }

    @Override
    public void viewStatusSiswa() {
        // TODO Auto-generated method stub

    }

    @Override
    public void viewListBuku() {
        // TODO Auto-generated method stub

    }

    @Override
    public void viewListPetugas() {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundBuku(String namaBuku) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundPetugas(String namaPetugas) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundSiswa(String namaSiswa) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundPeminjaman(String namaPeminjaman) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundPengembalian(String namaPengembalian) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundStatusPeminjaman(String namaStatusPeminjaman) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundStatusSiswa(String namaStatusSiswa) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundStatusBuku(String namaStatusBuku) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundStatusPetugas(String namaStatusPetugas) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundStatusPengembalian(String namaStatusPengembalian) {
        // TODO Auto-generated method stub

    }
}
