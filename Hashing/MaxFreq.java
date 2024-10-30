package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {

    static void maxFrequentElement(){

        int arr[] = {1,2,4,4,5,6,7,8,7,9,4,2,4,6,8,9,1};

        Map<Integer,Integer> freq = new HashMap<>();

        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }else{
                freq.put(el, freq.get(el)+1);
            }
        }

        int maxFreq =0, anskey = -1;
        for(var e : freq.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                anskey = e.getKey();
            }
        }

        System.out.printf("Max frequency of an element :\n " + freq.entrySet());

        System.out.println("anskey\n" +anskey);

        

    }




    public static void main(String[] args) {
        

        maxFrequentElement();
    }
}   

