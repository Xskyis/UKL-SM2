package javaapp1;

import java.util.ArrayList;

public class ListSiswa extends Siswa implements Peminjaman {

    public static final String statusSiswa = null;
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamatSiswa = new ArrayList<String>();
    private ArrayList<String> teleponSiswa = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public ListSiswa() {
        // tabel arraylist siswa
        this.namaSiswa.add("Siswa 1");
        this.alamatSiswa.add("Sawojajar");
        this.teleponSiswa.add("0888092871");
        this.status.add(true);

        this.namaSiswa.add("Siswa 2");
        this.alamatSiswa.add("Wendit");
        this.teleponSiswa.add("0888092871");
        this.status.add(true);

        this.namaSiswa.add("Siswa 3");
        this.alamatSiswa.add("Ngawi");
        this.teleponSiswa.add("0888092871");
        this.status.add(true);
    }

    public void viewSiswa() {
        for (int i = 0; i < this.namaSiswa.size(); i++) {
            System.out.println("Nama Siswa: " + this.namaSiswa.get(i));
            System.out.println("Alamat: " + this.alamatSiswa.get(i));
            System.out.println("Telepon: " + this.teleponSiswa.get(i));
            System.out.println("Status: " + this.status.get(i));
            System.out.println();
        }
    }

    // merubah status siswa menjadi false jika siswa mengambil buku
    public void foundSiswa(String namaSiswa) {
        for (int i = 0; i < this.namaSiswa.size(); i++) {
            if (this.namaSiswa.get(i).equals(namaSiswa)) {
                this.status.set(i, false);
                System.out.println("Nama Siswa: " + this.namaSiswa.get(i));
                System.out.println("Alamat: " + this.alamatSiswa.get(i));
                System.out.println("Telepon: " + this.teleponSiswa.get(i));
                System.out.println("Status: " + this.status.get(i));
                System.out.println();
            }
        }
    }

    // merubah status siswa menjadi true jika siswa mengembalikan buku
    public void returnSiswa(String namaSiswa) {
        for (int i = 0; i < this.namaSiswa.size(); i++) {
            if (this.namaSiswa.get(i).equals(namaSiswa)) {
                this.status.set(i, true);
                System.out.println("Nama Siswa: " + this.namaSiswa.get(i));
                System.out.println("Alamat: " + this.alamatSiswa.get(i));
                System.out.println("Telepon: " + this.teleponSiswa.get(i));
                System.out.println("Status: " + this.status.get(i));
                System.out.println();
            }
        }
    }

    @Override
    public void peminjaman() {
    }

    @Override
    public void pengembalian() {
    }

    @Override
    public void viewStatusPeminjaman() {
    }

    @Override
    public void viewStatusSiswa() {
    }

    @Override
    public void viewListBuku() {
    }

    @Override
    public void viewListPetugas() {
    }

    @Override
    public void foundBuku(String namaBuku) {
    }

    @Override
    public void foundPetugas(String namaPetugas) {
    }

    @Override
    public void foundPeminjaman(String namaPeminjaman) {
    }

    @Override
    public void foundPengembalian(String namaPengembalian) {
    }

    @Override
    public void foundStatusPeminjaman(String namaStatusPeminjaman) {
    }

    @Override
    public void foundStatusSiswa(String namaStatusSiswa) {
    }

    @Override
    public void foundStatusBuku(String namaStatusBuku) {
    }

    @Override
    public void foundStatusPetugas(String namaStatusPetugas) {
    }

    @Override
    public void foundStatusPengembalian(String namaStatusPengembalian) {
    }
}
