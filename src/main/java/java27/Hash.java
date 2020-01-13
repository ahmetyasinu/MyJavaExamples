package java27;
import java.util.*;
public class Hash {
    public static void main(String[] args) {
        Hashtable<Integer, String> hTable = new Hashtable<Integer,
                String>();
        // Hashtable nesnesine öğe ekleme
        hTable.put(new Integer(474), "Kars");
        hTable.put(new Integer(376), "Balıkesir");
        hTable.put(new Integer(322), "Ankara");
        hTable.put(new Integer(232), "Đzmir");
        hTable.put(new Integer(284), "Edirne");
        // Hashtable öğelerini yazdır
        System.out.println("hTable : " + hTable);
        // anahtar ve değerlere erişmek için Hashtable sıralaması
        Enumeration em = hTable.keys();
        while (em.hasMoreElements()) {
            // Hashtable'ın öğelerine erişim
            int key = (Integer) em.nextElement();
            // değere erişim
            String value = (String) hTable.get(key);
            System.out.println("Anahtar :" + key + " değer :" + value);
        }
        HashMap hMap = new HashMap(hTable);
        System.out.println("hMap : " + hMap);
    }
}
