import java.util.Scanner;

///Write a Program for the sum of n natural numbers
//using while loop
public class Sum_Nnaturalnumber {
public static void main(String[] ars) {
    System.out.println("enter the number:");
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
    int n=5;
    int sum = 0,i=1;
    while (i<=n) {
        System.out.println(i);
        sum=sum+i;
        i++;
    }
    System.out.println(sum);
    }
  }

