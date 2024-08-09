import java.util.Scanner;
public class no5{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int i,number,fact=1;
        System.out.println("Enter a number: ");
        number= sc.nextInt();
        for(i=number;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
} 
