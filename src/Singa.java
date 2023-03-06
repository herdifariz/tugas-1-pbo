public class Singa extends Hewan implements Gerak{

    @Override
    void makan() {
        System.out.println(this.nama + " memakan mangsanya");
    }

    @Override
    void habitat() {
        System.out.println(this.nama + " tinggal di darat");
    }

    @Override
    int jumlahKaki() {
        return 4;
    }

    @Override
    public void berburu() { System.out.println("Singa berburu untuk mencari makan"); }

    @Override
    public void berlari(int kecepatan) {
        System.out.println("Singa berlari dengan kecepatan " + kecepatan + " km/h");
    }

    @Override
    public void terbang() {
        System.out.println("Singa tidak bisa terbang");
    }
}
