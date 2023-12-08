public class Operasi {
    public double nilai1;
    public double nilai2;
    public double hasil;

    public double getNilai1() {
        return this.nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return this.nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public double getHasil() {
        return this.hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public double tambah(double nilai1, double nilai2) {
        this.hasil = nilai1 + nilai2;

        return this.hasil;
    }

    public double kurang(double nilai1, double nilai2) {
        this.hasil = nilai1 - nilai2;

        return this.hasil;
    }

    public double kali(double nilai1, double nilai2) {
        this.hasil = nilai1 * nilai2;

        return this.hasil;
    }

    public double bagi(double nilai1, double nilai2) {
        this.hasil = nilai1 / nilai2;

        return this.hasil;
    }

    public double modulus(double nilai1, double nilai2) {
        this.hasil = nilai1 % nilai2;

        return this.hasil;
    }

}
