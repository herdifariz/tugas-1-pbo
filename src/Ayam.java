public class Ayam extends Hewan{
    @Override
    void makan() {
        System.out.println(this.nama + " memakan segalanya");
    }

    @Override
    void habitat() {
        System.out.println(this.nama + " tinggal di darat tetapi bisa terbang");
    }

    @Override
    int jumlahKaki() {
        return 2;
    }
}
