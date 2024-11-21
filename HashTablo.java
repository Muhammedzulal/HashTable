package HashTable;

public class HashTablo {
    Node dizi[];
    int size;

    HashTablo(int size) {
        this.size = size;
        dizi = new Node[size];
        for (int i = 0; i < size; i++) {
            dizi[i] = new Node();
        }
    }

    int indexBul(int key) {
        return key % size;
    }

    void ekle(int key, String name) {
        int index = indexBul(key);
        Node eleman = new Node(key, name);
        Node temp = dizi[index];
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = eleman;
        System.out.println("[" + key + "] " + eleman.name + " " + index + " bölümüne eklendi");
    }

    void sil(int key) {
        int index = indexBul(key);// sileceğimiz kişinin kök dizisindeki yeri
        Node temp = dizi[index];// boş olana atadık
        Node temp2 = dizi[index];

        if (temp.next == null) {// sadece ana boş kök var
            System.out.println(key + " numaralı kayıt yok");
        } else if (temp.next.next == null && temp.next.key == key) {
            // bir düğüm var && aradığımız key
            System.out.println("[" + key + "] " + temp.next.name + " " + index + " den silindi");
            temp.next = null;
        } else {
            while (temp != null) {
                if (temp.key == key) {
                    System.out.println("[" + key + "] " + temp.name + " " + index + " den silindi");
                    temp2.next = temp.next;
                }
                temp2 = temp;
                temp = temp.next;
            }
        }
    }

    void yazdir() {
        for (int i = 0; i < size; i++) {
            Node temp = dizi[i];
            System.out.print("[" + i + "] :");
            temp = temp.next;
            while (temp != null) {
                System.out.print(temp.name);
                if (temp.next != null)
                    System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
