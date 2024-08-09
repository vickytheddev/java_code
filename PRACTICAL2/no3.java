import java.util.*;

public class no3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your average marks : ");
        int marks = sc.nextInt();
        int avg = marks/10;
        String grade = null;
        switch (avg) {
            case 0:
                grade = "F";
                break;
            case 1:
                grade = "F";
            case 2:
                grade = "F";
                break;
            case 3:
                grade = "F";
                break;
            case 4:
                grade = "C";
                break;
            case 5:
                grade = "B";
                break;
            case 6:
                grade = "B+";
                break;
            case 7:
                grade = "B+";
                break;
            case 8:
                grade = "A";
                break;
            case 9:
                grade = "A+";
                break;
            case 10:
                grade = "A+";
                break;
        }
        System.out.print("Grade is : " + grade);
    }
}