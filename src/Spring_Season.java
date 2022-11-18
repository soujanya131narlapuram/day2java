import java.util.Scanner;
public class Spring_Season {
public static void main(String[] args) {
    System.out.println("Enter the month number");
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    System.out.println("Enter the day number");
    int day = sc.nextInt();
    if ((month == 3 && day >= 20 && day <= 31)){
        System.out.println("true");
    } else if ((month == 4 || month ==5 ) && day >= 1 && day <= 31) {
        System.out.println("true");
    } else if ((month==6 &&day>=1 && day<=20)){
        System.out.println("true");
    }else {
        System.out.println("false");
    }
}
}
