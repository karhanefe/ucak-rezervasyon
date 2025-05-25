public class Rezervasyon {
    String ad;
    String soyad;
    int yas;
    Ucus ucus;

    public Rezervasyon(String ad, String soyad, int yas, Ucus ucus) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.ucus = ucus;
        ucus.koltukAyir();
    }

    public String toString() {
        return ad + " " + soyad + " (" + yas + ") - " + ucus;
    }
}
