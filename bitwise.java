import java.util.*;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number 1");
        int a=sc.nextInt();
        System.out.println("number 2");
        int b=sc.nextInt();
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a|b);
        System.out.println(a>>b);
        System.out.println(a<<b);
    }
}
