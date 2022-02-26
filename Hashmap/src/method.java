import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
// import java.util.Map.Entry;

public class method {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        // Set<Entry<Integer,String>> entrySet=map.entrySet();
        // for(Entry<Integer,String> en:entrySet){
        // System.out.println(en.getKey()+" : "+en.getValue());
        // }
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.putAll(map);
        map1.putIfAbsent(4, "Five");

        Set<Integer> ss = map.keySet();
        for (Integer key : ss) {
            System.out.println(key);
        }

        Collection<String> cc = map.values();
        for (String v : cc) {
            System.out.println(v);
        }
        map.remove(1);
        map.remove(2, "too");
        map.replace(4, "four", "five");
        System.out.println(map1);
        map.put(4, "five");
        System.out.println(map.containsValue("four"));
        System.out.println(map);
    }
}