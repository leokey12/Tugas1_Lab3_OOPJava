public class RakBuku {
    private String judulBuku;
    private String genreBuku;
    private int hargaBuku;

    public RakBuku() {
        this("", "", 0);
    }

    public RakBuku(String judulBuku, String genreBuku) {
        this(judulBuku, genreBuku, 89000);
    }

    public RakBuku(String judulBuku, String genreBuku, int hargaBuku) {
        this.judulBuku = judulBuku;
        this.genreBuku = genreBuku;
        this.hargaBuku = hargaBuku;
    }

    // method void untuk membeli buku
    public void beliBuku() {
        System.out.println("\n" + judulBuku + " berhasil dibeli");
    }

    // method non void untuk menghitung harga buku
    public int hitungHargaBuku(int banyakBuku) {
        int totalHarga = hargaBuku * banyakBuku;
        return totalHarga;
    }

    public void beliBuku(int banyakBuku) {
        System.out.println("\n" + banyakBuku + " buku " + judulBuku + " berhasil dibeli");
    }

    // getter dan setter
    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getGenreBuku() {
        return genreBuku;
    }

    public void setGenreBuku(String genreBuku) {
        this.genreBuku = genreBuku;
    }

    public int getHargaBuku() {
        return hargaBuku;
    }

    public void setHargaBuku(int hargaBuku) {
        this.hargaBuku = hargaBuku;
    }
}