

import java.util.Scanner;
public class Vowel_consonent {

    public static void main(String[] args){
        System.out.println("enter the character below:" );
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
//        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
//        {
//            System.out.println("given character is a vowel:" +vowel);
//        }
//        else
//        {
//            System.out.println("character is a consonent:" );
//        }
    switch (ch)
    {
        case 'a':
            System.out.println("character is a vowel");
                    break;
        case 'e':
            System.out.println("character is a vowel");
            break;
        case 'i':
            System.out.println("character is a vowel");
            break;
        case 'o':
            System.out.println("character is a vowel");
            break;
        case 'u':
            System.out.println("character is a vowel");
            break;
        default:
            System.out.println("entered the consonent character");
    }
    }
}
