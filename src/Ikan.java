public class Ikan extends Hewan{

    @Override
    void makan() {
        System.out.println(this.nama + " memakan makhluk kecil lainnya");
    }

    @Override
    void habitat() {
        System.out.println(this.nama + " hidup di air");
    }

    @Override
    int jumlahKaki() {
        return 0;
    }
}
