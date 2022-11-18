public class For_reverse {
public static void main(String[] args){
int n=321,rem,rev=0;
for(int i=1;i<=n; i++)
{
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
    }
    System.out.println("reverse number:"+rev);
}
}
