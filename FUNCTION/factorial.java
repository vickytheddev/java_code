
import java.util.Scanner;

public class factorial {
    public static void printFactorial(int n) {
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        printFactorial(n);
    }
}
