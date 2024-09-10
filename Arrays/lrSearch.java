package Arrays;

import java.util.*;

public class lrSearch {

    public static int update(String fruits [], String key) {
        for(int i = 0 ;i< fruits.length;i++){
            if(fruits[i].equals(key)){
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        String fruits [] = { "apple","banana","chiko","gauva","pineapple"};
        String key = "pineapple";

        int index = update(fruits, key);

        if(index == -1){
            System.out.println("Not FOund");
        }else{
            System.out.println("FOund at " + index);
        }
    }
}
