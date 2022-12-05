package factorial;

public class Factorial {

    public static int findFactorial(int num){
        int fact;
        if(num <= 0){
            fact = 1;
        }else{
            fact = num * findFactorial(num -1 );
        }

        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + findFactorial(num));

    }
}
