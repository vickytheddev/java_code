
import java.util.*;
public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String type = num%2==0?"even":"odd";
        System.out.println(type);
    }
}
