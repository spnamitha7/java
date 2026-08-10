import java.util.*;
public class LinkedHashset{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<String> n=new LinkedHashSet<>();
        for(int i=0;i<7;i++){
            n.add(sc.nextLine());
        }
        System.out.println(n);
    }
}