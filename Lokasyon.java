public class Lokasyon {
    String sehir;
    String havaalani;

    public Lokasyon(String sehir, String havaalani) {
        this.sehir = sehir;
        this.havaalani = havaalani;
    }

    public String toString() {
        return sehir + " - " + havaalani;
    }
}
