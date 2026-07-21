package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps
{
    static void main() {
        System.out.println("Maps");
        Map<String,String> map = new HashMap<>();
        map.put("US","united State");
        map.put("UK","United Kingdom");
        map.put("USA","United States America");
        System.out.println(map);
        Map<String,String> map2= new HashMap<>();
        map2.put("D","Dhiraj");
        map2.put("DU","Dhiraj Upadhyay");
        map2.put("H","Hitesh");
        map2.put("HU","Hitesh Upadhyay");
        System.out.println(map2);
        map.putAll(map2);
        System.out.println(map);
        System.out.println( map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.containsKey("DU"));
        System.out.println(map.containsValue("Dhiraj"));
        System.out.println(map.replace("US","India"));
        System.out.println(map.replace("US","India", "USA America"));
        System.out.println(map);
//        map.clear();
        map.remove("US");
        System.out.println(map.entrySet());
        map.putIfAbsent("IN","India");
        map.putIfAbsent("NP","Nepal");
        System.out.println(map);
        System.out.println(map.get("NP"));
        System.out.println(map.getOrDefault("IAS","Inidan A S"));
        Set<String> keys= map.keySet();
         for(String k:keys){
             if(k.equals("NP")){
                 System.out.println("I love Nepal");
                continue;
             }
            System.out.println(k);
        }
          Set<Map.Entry<String,String>>setEntry= map.entrySet();
         for(Map.Entry<String,String> entry:setEntry){
             System.out.print(entry.getValue()+" ");
         }
    }
}
