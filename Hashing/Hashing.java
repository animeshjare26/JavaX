package Hashing;

import java.util.*;

public class Hashing {

    public static void main(String[] args) {

        int arr[] = {1,4,2,5,1,4,4,6,4,4,4,6,6,2};
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int el : arr){
            if(!map.containsKey(el)){
                map.put(el, 1);
            }else{
                map.put(el,map.get(el) + 1);
            }
        }

        System.out.println(map.entrySet());

        int mxfreq = 0 , anskey  = -1;

        for(var e : map.entrySet()){
            if(e.getValue() > mxfreq){
                mxfreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey + " " + mxfreq);

        // map.put("India", 150);
        // map.put("US", 120);
        // map.put("China", 180);
        // System.out.println(map);

        // System.out.println(map.get("India"));;
    }
    
}
