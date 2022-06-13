package javaapp1;

public interface Peminjaman {
    String statusPeminjaman = null;

    public void peminjaman();

    public void pengembalian();

    public void viewStatusPeminjaman();

    public void viewStatusSiswa();

    public void viewListBuku();

    public void viewListPetugas();

    public void foundBuku(String namaBuku);

    public void foundPetugas(String namaPetugas);

    public void foundSiswa(String namaSiswa);

    public void foundPeminjaman(String namaPeminjaman);

    public void foundPengembalian(String namaPengembalian);

    public void foundStatusPeminjaman(String namaStatusPeminjaman);

    public void foundStatusSiswa(String namaStatusSiswa);

    public void foundStatusBuku(String namaStatusBuku);

    public void foundStatusPetugas(String namaStatusPetugas);

    public void foundStatusPengembalian(String namaStatusPengembalian);
}
