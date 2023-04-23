public class Main {
    public static void main(String[] args) {
        RakBuku buku1 = new RakBuku();
        buku1.setJudulBuku("Twilight");
        buku1.setGenreBuku("Fiction");
        buku1.setHargaBuku(90000);
        buku1.beliBuku();

        System.out.println("Harga Buku : Rp" + buku1.getHargaBuku());
        System.out.println("Judul Buku : "+ buku1.getJudulBuku());
        System.out.println("Genre Buku : "+ buku1.getGenreBuku());
        System.out.println("Total      : "+ buku1.hitungHargaBuku(3));

        RakBuku buku2 = new RakBuku();
        buku2.setJudulBuku("Five Feet Apart");
        buku2.setGenreBuku("Romance");
        buku2.setHargaBuku(95000);
        buku2.beliBuku(2);

        System.out.println("Harga Buku : Rp" + buku2.getHargaBuku());
        System.out.println("Judul Buku : "+ buku2.getJudulBuku());
        System.out.println("Genre Buku : "+ buku2.getGenreBuku());
        System.out.println("Total      : "+ buku2.hitungHargaBuku(2));
    }
}