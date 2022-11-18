public class Max_min_number {
    public static void main(String[] args){
        int a=10,b=20,c=5;
       int m1=a+b*c;
       System.out.println("m1:" +m1);
       int m2=c+a/b;
        System.out.println("m2:" +m2);
       int m3=a%b+c;
        System.out.println("m3:" +m3);
       int m4=a*b+c;
        System.out.println("m4:" +m4);
       if(m1>m2 && m1>m3 && m1>m4){
           System.out.println("m1 is max");
       } else if(m2>m1 &&m2>m3 && m2>m4) {
           System.out.println("m2 is max");
       }
       else if(m3>m1 &&m3>m2 && m3>m4) {
           System.out.println("m3 is max");
       }
       else if(m4>m1 &&m4>m3 && m4>m2) {
           System.out.println("m4 is max");
       }else{

       }
        if(m1<m2 && m1<m3 && m1<m4){
            System.out.println("m1 is min");
        } else if(m2<m1 &&m2<m3 && m2<m4) {
            System.out.println("m2 is min");
        }
        else if(m3<m1 &&m3<m2 && m3<m4) {
            System.out.println("m3 is min");
        }
        else if(m4<m1 &&m4<m3 && m4<m2) {
            System.out.println("m4 is min");
        }else {
        }


    }
}
