package javaapp1;

import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        // obj
        ListSiswa listSiswa = new ListSiswa();
        ListPetugas listPetugas = new ListPetugas();
        ListBuku listBuku = new ListBuku();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("==========================================================");
            System.out.println("|                                                        |");
            System.out.println("|                     PERPUSTAKAAN                       |");
            System.out.println("|                                                        |");
            System.out.println("==========================================================");
            System.out.println("|                                                        |");
            System.out.println("|             PETUGAS YANG BERJAGA HARI INI              |");
            listPetugas.viewPetugas(0);
            System.out.println("==========================================================");
            System.out.println("");
            System.out.println("1. Lakukan Peminjaman");
            System.out.println("2. Lakukan Pengembalian");
            System.out.println("3. Lihat Daftar Buku");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            System.out.print("");

            if (pilih == 4) {
                System.out.println("Terima kasih telah menggunakan perpustakaan kami");
                System.out.println("Made With <3 By: @Achmad Nabil Afgareza");
                break;
            } else if (pilih == 3) {
                System.out.println("===================Daftar Buku====================");
                listBuku.viewBuku();
                System.out.println("=Silahkan Pilih Opsi Pinjam Untuk Meminjam Buku=");

            } else if (pilih == 1) {
                // proses peminjaman
                Scanner input1 = new Scanner(System.in);
                System.out.print("Masukkan Nama Siswa: ");
                String namaSiswa = input1.nextLine();
                System.out.print("Masukkan Nama Buku: ");
                String namaBuku = input1.nextLine();

                // buku yang dipinjam beserta harga dan stok
                System.out.println();
                System.out.println("Detail Buku Yang Di Pinjam: ");
                listBuku.foundBuku(namaBuku);
                System.out.println("");

                // stok buku setelah di pinjam
                System.out.println("Stok Setelah di Pinjam: ");
                listBuku.penguranganStok(namaBuku);
                System.out.println("");

                // status siswa setelah meminjam buku
                System.out.println("Status Siswa Setelah Meminjam Buku: ");
                listSiswa.foundSiswa(namaSiswa);
                System.out.println("");

            } else if (pilih == 2) {
                // proses pengembalian
                Scanner input2 = new Scanner(System.in);
                System.out.print("Masukan Nama Siswa: ");
                String namaSiswa = input2.nextLine();
                System.out.print("Masukan Nama Buku: ");
                String namaBuku = input2.nextLine();

                // buku yang dikembalikan beserta harga dan stok
                System.out.println();
                System.out.println("Detail Buku Yang Di Kembalikan: ");
                listBuku.foundBuku(namaBuku);
                System.out.println("");

                // stok buku setelah di kembalikan
                System.out.println("Stok Setelah Pengembalian :");
                listBuku.penambahanStok(namaBuku);
                System.out.println("");

                // status siswa setelah mengembalikan buku
                System.out.println("Status Siswa Setelah Mengembalikan Buku: ");
                listSiswa.returnSiswa(namaSiswa);
                System.out.println("");
            }
        }
    }
}