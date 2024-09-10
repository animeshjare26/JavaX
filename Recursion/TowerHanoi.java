package Recursion;

public class TowerHanoi {

    public static void towerOFHanoi(int n , String src , String helper , String dest) {

        if(n == 1){
            System.out.println("transfer from " + n + " from " + src + " to " + dest);
            return;
        }
        
        towerOFHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + helper );
        
        towerOFHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n= 1;
        towerOFHanoi(n, "S", "H", "D");
    }

}
