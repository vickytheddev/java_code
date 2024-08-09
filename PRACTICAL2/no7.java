import java.util.Scanner;
public class no7{
    public static void main(String [] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a=0,b=1,c=0,i;
        for(i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
    }
}