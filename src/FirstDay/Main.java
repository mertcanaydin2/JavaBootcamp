package FirstDay;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = {"Mertcan", "Beyza", "Osman", "Alperen", "Rümeysa", "Poyraz"};
        for (String ogrenci :
                ogrenciler) {
            System.out.println(ogrenci);


        }

        //2 boyutlu dizi
        String[][] sehirler = new String[3][4];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Tunceli";
        sehirler[0][2] = "Samsun";
        sehirler[1][0] = "Konya";
        sehirler[1][1] = "Isparta";
        sehirler[1][2] = "İzmir";
        sehirler[2][0] = "Edirne";
        sehirler[2][1] = "Erzurum";
        sehirler[2][2] = "Adana";

        for(int i = 0; i<=2; i++){
            System.out.println("-----------------------");
            for(int j = 0; j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }


        //String işlemleri
        String mesaj = "Bu bir deneme mesajıdır.";
        System.out.println(mesaj+" Cümlesinde toplam "+mesaj.length()+" karakter vardır.");
        System.out.println("Cümledeki 7. eleman : " +mesaj.charAt(6));
        System.out.println(mesaj.startsWith("e"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[24];
        mesaj.getChars(0,mesaj.length(),karakterler,0);
        System.out.println(karakterler);
        for(int k = karakterler.length-1; k>=0; k--){
            System.out.print(mesaj.charAt(k));
        }
        System.out.println(" ");
        System.out.println(mesaj.replace(' ','.'));
        System.out.println(mesaj.substring(4));
        for (String kelime:mesaj.split("a")
        ) {
            System.out.println(kelime);

        }
        System.out.println(mesaj.toLowerCase(Locale.ROOT));
        System.out.println(mesaj.toUpperCase(Locale.ROOT));


        System.out.println("*********************Asal");
        //100'e kadar olan asal sayıları yazdırma.
        int sayac2 = 0;
        for (int a = 2;a<=100;a++){
            int sayac = 0;
            for(int b = 2; b<a;b++){
                if(a%b == 0){
                    sayac++;
                }
            }
            if(sayac==0){
                System.out.println(a);
                sayac2++;

            }
        }
        System.out.println(sayac2);

        System.out.println("-------------------------");
        //Mükemmel sayı bulma.
        int sayi99 = 6;
        int sayiToplam = 0;
        for(int i = 1;i<sayi99;i++){

            if(sayi99 % i == 0){
                sayiToplam = sayiToplam+i;
            }}
        if (sayiToplam == sayi99) {
            System.out.println("Sayı mükemmel sayıdır.");
        }else{
            System.out.println("Sayı mükemmel sayı değildir.");
        }

        System.out.println("----------------------");
        //Arkadaş sayıları bulma.
        int sayi3 = 220;
        int sayi4 = 284;
        int sayi3a = 0;
        int sayi4a = 0;

        for(int i = 1; i<sayi3;i++){
            if(sayi3%i ==0){
                sayi3a = sayi3a+i;
            }
        }
        for(int i = 1;i<sayi4;i++){
            if(sayi4%i ==0){
                sayi4a = sayi4a+i;
            }

        }
        if(sayi3a == sayi4 && sayi4a == sayi3){
            System.out.println(sayi3a+" "+sayi4a);
            System.out.println("Sayılar arkadaş sayıdır.");
        }
        else{
            System.out.println("Değiller kanka.");
        }

        System.out.println("----------------------");
        //Dizi içinde verilen sayıyı arama.
        int[] sayilar = new int[]{1,2,3,4,5,6,7};

        int aranacak = 9;
        int sayac = 0;
        for (int dene:sayilar
        ) {
            if(dene == aranacak){
                sayac++;
                break;
            }
        }
        if (sayac != 0){
            System.out.println(aranacak +" var kanka.");
        }
        else{
            System.out.println(aranacak +" yok kanka.");
        }

    }
}
