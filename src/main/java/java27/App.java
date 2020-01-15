package java27;
import java.util.HashMap;
import java.util.Map;
/*public class App {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(3,"Uc");
        map.put(2,"Iki");
        map.put(4,"Dort");
        map.put(6,"Alti");
        map.put(9,"Dokuz");
        String text = map.get(9);
        System.out.println(text);
        for (Map.Entry<Integer,String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}*/

import java.util.*;
public class App {
    public static void main(String[] args) {
        Map<Integer, Character> m = new HashMap<Integer, Character>();
        for (int i = 65; i <= 90; i++) {
            m.put(i, (char) i);
        }
        Set<Integer> kSet = m.keySet();
         Iterator<Integer> sayaç = kSet.iterator();
             System.out.println("m : " + m);
                  HashMap<Integer, Character> hMap = new HashMap<Integer, Character>(m);
                      System.out.println("hMap : " + hMap);
                        Hashtable ht = new Hashtable(hMap);
                            System.out.println("ht : " + ht);
    }
}