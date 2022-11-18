public class Armstrong_num {
    public static void main(String[] args) {
        int n = 153, rem, sum = 0;
        int t = n;

        while (n > 0) {
            rem = n % 10;
//            rev = rev * 10 + rem;
            sum = (sum) + (rem * rem * rem);
            n = n / 10;

        }

        if (t == sum) {
            System.out.println(sum);
            System.out.println("armstrong number:");
        } else {
            System.out.println("not armstrong number");
        }
    }
}
