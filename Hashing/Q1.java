package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Q1 {

    static void hashMapMethods(){
        Map<String,Integer> map = new HashMap<>();

        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);

        System.out.println(map.get("Lav"));

        //get all keys
        map.keySet();
        //get all values
        map.values();
        //get all entries
        map.entrySet();

        for(var  e : map.entrySet()){
            System.out.printf("Age of %s  is %d\n",e.getKey(),e.getValue());
        }
    }

    public static void main(String[] args) {
        hashMapMethods();
        
    }
    
}


