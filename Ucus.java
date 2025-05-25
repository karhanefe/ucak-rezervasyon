public class Ucus {
    Lokasyon kalkis;
    Lokasyon varis;
    String saat;
    Ucak ucak;
    int doluKoltuk = 0;

    public Ucus(Lokasyon kalkis, Lokasyon varis, String saat, Ucak ucak) {
        this.kalkis = kalkis;
        this.varis = varis;
        this.saat = saat;
        this.ucak = ucak;
    }

    public boolean yerVarMi() {
        return doluKoltuk < ucak.koltukSayisi;
    }

    public void koltukAyir() {
        doluKoltuk++;
    }

    public String toString() {
        return kalkis + " -> " + varis + " (" + saat + ") " + ucak;
    }
}
