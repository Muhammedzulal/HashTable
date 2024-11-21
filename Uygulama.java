package HashTable;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        HashTablo tablo = new HashTablo(5);
        int choose = -1;
        Scanner sc = new Scanner(System.in);
        while (choose != 0) {
            System.out.println("1-Ekle");
            System.out.println("2-Sil");
            System.out.println("3-Yazdır");
            System.out.println("0-Çıkış");
            System.out.println();
            System.out.print("Seçim :");
            choose = sc.nextInt();
            if (choose == 1) {
                System.out.println();
                System.out.print("Key :");
                int key = sc.nextInt();
                sc.nextLine();
                System.out.print("İsim :");
                String isim = sc.nextLine();
                System.out.println();
                tablo.ekle(key, isim);
                System.out.println();
            } else if (choose == 2) {
                System.out.print("Key :");
                int key = sc.nextInt();
                System.out.println();
                tablo.sil(key);
                System.out.println();
            } else if (choose == 3) {
                System.out.println();
                tablo.yazdir();
                System.out.println();
            } else if (choose == 0) {
                System.out.println();
                tablo.yazdir();
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Hatalı Seçim!");
                System.out.println();
            }
        }
        sc.close();
    }
}
/*
 * tablo.ekle(10, "Akali");
 * tablo.ekle(2, "Ksante");
 * tablo.ekle(3, "Zed");
 * tablo.ekle(23, "Katarina");
 * tablo.ekle(43, "Qiyana");
 * tablo.ekle(14, "Zoe");
 */
