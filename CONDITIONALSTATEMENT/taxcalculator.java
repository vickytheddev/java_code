
import java.util.*;
public class taxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax;
        System.out.println("Enter income amount:");
        int income = sc.nextInt();
        if(income<500000){
            System.out.println("Your tax is " +0);
        }
        else if(income>500000 && income<=1000000){
            System.out.println("Your tax is " +(income*0.2));
        }
        else{
            System.out.println("Your tax is " +(income*0.3));
        }
    }
}
