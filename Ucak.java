public class Ucak {
    String model;
    String marka;
    int koltukSayisi;

    public Ucak(String model, String marka, int koltukSayisi) {
        this.model = model;
        this.marka = marka;
        this.koltukSayisi = koltukSayisi;
    }

    public String toString() {
        return marka + " " + model + " (" + koltukSayisi + " koltuk)";
    }
}
