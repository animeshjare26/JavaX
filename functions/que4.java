package functions;

public class que4 {

    public static int sumOfDigits(int num) {
        int sum = 0;

        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sume = sumOfDigits(4255);
        System.out.println(sume);
    }
}
