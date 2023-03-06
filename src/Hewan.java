public abstract class Hewan{

    String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    abstract void makan();
    abstract void habitat();
    abstract int jumlahKaki();

}
