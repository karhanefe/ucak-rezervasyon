import java.util.Scanner;

public class AnaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lokasyonlar
        Lokasyon l1 = new Lokasyon("İstanbul", "IST");
        Lokasyon l2 = new Lokasyon("Ankara", "ESB");

        // Uçaklar
        Ucak u1 = new Ucak("737", "Boeing", 2);

        // Uçuşlar
        Ucus ucus1 = new Ucus(l1, l2, "15:30", u1);

        System.out.println("Mevcut Uçuşlar:");
        System.out.println("1) " + ucus1);

        System.out.print("Uçuş seç (1): ");
        int secim = input.nextInt();
        input.nextLine();

        if (secim != 1) {
            System.out.println("Geçersiz seçim.");
            return;
        }

        if (!ucus1.yerVarMi()) {
            System.out.println("Uçakta yer yok.");
            return;
        }

        System.out.print("Ad: ");
        String ad = input.nextLine();
        System.out.print("Soyad: ");
        String soyad = input.nextLine();
        System.out.print("Yaş: ");
        int yas = input.nextInt();

        Rezervasyon r = new Rezervasyon(ad, soyad, yas, ucus1);
        System.out.println("\nRezervasyon Oluştu:");
        System.out.println(r);
        input.close();

    }
}
