import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        // maps are key value paired 

        Map<String,Integer> num = new HashMap<>();
        num.put("Abc", 45);
        num.put("poi", 18);
        num.put("xyz", 24);
          // key and value 
        num.put("abc",78);  // case in sensitive Abc and abc are differ

        num.put("poi",90); // here same name but we can update the value to 18 to 90 by the key will print once only
        System.out.println(num); 

        
        System.out.println(num.get("Abc"));  //used to get the value of the key

        System.out.println(num.keySet());
        for(String str :num.keySet()){
            System.out.println(num.get(str));   // print all values 
        }

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Python");
        hashMap.put(1, "Java");
        hashMap.put(3, "C");

        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(2, "Python");
        linkedMap.put(1, "Java");
        linkedMap.put(3, "C");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Python");
        treeMap.put(1, "Java");
        treeMap.put(3, "C");

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedMap);
        System.out.println("TreeMap: " + treeMap);
    }
    

// put(K key, V value)
// get(Object key)
// remove(Object key)
// containsKey(Object key)
// containsValue(Object value)
// keySet()   it will give all the keys in the list
// values()  it will give all the values 
// entrySet()
// size()

}
