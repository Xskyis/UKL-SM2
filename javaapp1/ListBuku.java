package javaapp1;

import java.util.ArrayList;

public class ListBuku {

    ArrayList<String> namaBuku = new ArrayList<String>();
    ArrayList<String> stok = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    // list buku beserta stok, harga, dan nama buku
    public ListBuku() {
        this.namaBuku.add("Buku 1");
        this.stok.add("10");
        this.harga.add(10000);

        this.namaBuku.add("Buku 2");
        this.stok.add("20");
        this.harga.add(20000);

        this.namaBuku.add("Buku 3");
        this.stok.add("30");
        this.harga.add(30000);
    }

    // view list buku beserta stok, harga, dan nama buku
    public void viewBuku() {
        for (int i = 0; i < this.namaBuku.size(); i++) {
            System.out.println("Nama Buku: " + this.namaBuku.get(i));
            System.out.println("Stok: " + this.stok.get(i));
            System.out.println("Harga: " + this.harga.get(i));
            System.out.println();
        }
    }

    // found buku
    public void foundBuku(String namaBuku) {
        for (int i = 0; i < this.namaBuku.size(); i++) {
            if (this.namaBuku.get(i).equals(namaBuku)) {
                System.out.println("Nama Buku: " + this.namaBuku.get(i));
                System.out.println("Stok: " + this.stok.get(i));
                System.out.println("Harga: " + this.harga.get(i));
                System.out.println();
            }
        }
    }

    // pengurangan stok buku setelah di pinjam
    public void penguranganStok(String namaBuku) {
        for (int i = 0; i < this.namaBuku.size(); i++) {
            if (this.namaBuku.get(i).equals(namaBuku)) {
                int stok = Integer.parseInt(this.stok.get(i));
                stok--;
                this.stok.set(i, Integer.toString(stok));

                System.out.println("Nama Buku: " + this.namaBuku.get(i));
                System.out.println("Sisa Stok: " + this.stok.get(i));
            }
        }
    }

    // penambahan stok buku dari peminjaman buku setelah dikembalikan
    public void penambahanStok(String namaBuku) {
        for (int i = 0; i < this.namaBuku.size(); i++) {
            if (this.namaBuku.get(i).equals(namaBuku)) {
                int stok = Integer.parseInt(this.stok.get(i));
                stok++;
                this.stok.set(i, Integer.toString(stok));

                System.out.println("Nama Buku: " + this.namaBuku.get(i));
                System.out.println("Sisa Stok: " + this.stok.get(i));
            }
        }
    }
}