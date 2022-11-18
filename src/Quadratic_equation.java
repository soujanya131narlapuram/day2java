import java.util.Scanner;
import java.lang.Math;
public class Quadratic_equation {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the a,b,c values to find the roots:");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double delta = (b * b) - (4 * a * c);
    double sqrt = Math.sqrt(delta);
    System.out.println("delta value:" + delta);
    double x1 = (-b + sqrt) / (2 * a);
    double x2 = (-b - sqrt) / (2 * a);
    if (delta > 0) {
        System.out.println("root1 value:" + x1);
        System.out.println("root2 value:" + x2);
    }else if(delta==0){
        System.out.println("root :" +(-b ) / (2 * a) );
    }
}
}
