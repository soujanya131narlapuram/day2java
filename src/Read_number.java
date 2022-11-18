//read a number 1,10,100,1000
import java.util.Scanner;
public class Read_number {
public static void main(String[] args){
    System.out.println("enter the digit:");
    Scanner sc=new Scanner(System.in);
    int num= sc.nextInt();
    if(num==1) {
        System.out.println("unit digit");
       }else if(num==10){
            System.out.println("tens digit");
        }
        else if(num==100){
            System.out.println("hundred digit");
        }
        else if(num==1000){
            System.out.println("thousand digit");
        }
        else {
            System.out.println("invalid digit");
        }
    }
}
