import java.util.Scanner;

public class ArrayExercisesDemo {
    static void menu() {
        System.out.println(" ======= Dizi Analiz Programı ======");
        System.out.println("1 - En Büyük Sayıyı Bul");
        System.out.println("2 - En Küçük Sayıyı Bul");
        System.out.println("3- Çift Sayıları Göster");
        System.out.println("4- Tek Sayıları Göster");
        System.out.println("5- Çift Sayıların Toplamı");
        System.out.println("6- Tek Sayıların Toplamı");
        System.out.println("7- Sayı Ara");
        System.out.println("8- Çıkış");
        System.out.print("Seçiminiz : ");
    }

    static void enBuyukBul(int[] sayilar) {
        int enBuyuk = sayilar[0];
        int ind = 0;

        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
                ind = i;
            }

        }
        System.out.println("Bulunan En Büyük Sayı= " + enBuyuk);
        System.out.println("İndisi = " + ind);
    }

    static void enKucukBul(int[] sayilar) {
        int enKucuk = sayilar[0];
        int ind = 0;
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] < enKucuk) {
                enKucuk = sayilar[i];
                ind = i;
            }
        }
        System.out.println("Bulunan En Küçük Sayı= " + enKucuk);
        System.out.println("İndisi = " + ind);
    }

    static int sayilariTopla(int[] sayilar, boolean ciftMi) {
        int toplam = 0;
        boolean uygunMu;
        for (int i = 0; i < sayilar.length; i++) {
            uygunMu=(sayilar[i] % 2 == 0);
            if (uygunMu == ciftMi) {
                toplam += sayilar[i];
            }
        }

        return toplam;
    }

    static void sayiAra(int[] sayilar) {
        boolean bulundu = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Aranacak Sayıyı Giriniz: ");
        int arananSayi = input.nextInt();
        int ind = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == arananSayi) {

                bulundu = true;
                ind = i;
                break;
            }
        }
        if (bulundu) {
            System.out.println(arananSayi + " sayısı bulundu.");
            System.out.println("İndeksi = " + ind);
        } else {
            System.out.println("Bulunamadı.");
        }
    }

    static void sayilariGoster(int[] sayilar, boolean ciftMi) {
        for (int i = 0; i < sayilar.length; i++) {
            boolean ciftIse;
            ciftIse = (sayilar[i] % 2 == 0);
            if (ciftIse==ciftMi) {
                    System.out.println(sayilar[i]);
                }
    }}}

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean devam = true;
        int[] sayilar = {12, 8, 15, 5, 30, 18, -1, -8};

        while (devam) {
            menu();
            int secim = input.nextInt();
            switch (secim) {
                case 1:
                    enBuyukBul(sayilar);
                    break;
                case 2:
                    enKucukBul(sayilar);
                    break;
                case 3:
                    sayilariGoster(sayilar, true);
                    break;
                case 4:
                    sayilariGoster(sayilar, false);
                    break;
                case 5:
                    int sonuc = sayilariTopla(sayilar, true);
                    System.out.println("Sayıların Toplamı = " + sonuc);
                    break;
                case 6:
                    sonuc = sayilariTopla(sayilar, false);
                    System.out.println("Sayıların Toplamı = " + sonuc);
                    break;
                case 7:
                    sayiAra(sayilar);
                    break;
                case 8:
                    System.out.println("Programdan çıkılıyor...");
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz Seçim!");

            }
        }

    }

}