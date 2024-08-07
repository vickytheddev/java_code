
import java.util.*;
public class eligibleforvote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not Eligible for vote");
        }
    }
}
