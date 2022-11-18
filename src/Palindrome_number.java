import java.util.Scanner;
public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0,temp=n;
        for (int i = 0; n>0; i++) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("reverse number:" + rev);
        if (rev == temp) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not a palindrome number ");
        }
    }
}

