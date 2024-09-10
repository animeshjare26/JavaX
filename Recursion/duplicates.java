package Recursion;

public class duplicates {

    public static void removeDuplicates(String str , int idx, StringBuilder newStr , boolean map[]) {
        
        //Base Case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //curent charater
        char currChar = str.charAt(idx);
        
        //kaam
        if(map[currChar-'a'] == true){   //character already seen
            removeDuplicates(str, idx+1, newStr, map);    //recursive call
        }else{
            map[currChar-'a'] = true;   //char ko seen kar diya 
            removeDuplicates(str, idx+1, newStr.append(currChar), map);  //aur newStrt mai append/add kiya n recursive call kiya
        }
    }
    
    public static void main(String[] args) {
        String str = "aniimeshhhjaare";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
