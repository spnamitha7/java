import java.util.*;
public class treemap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer,String> n=new TreeMap<>();
        for(int i=0;i<7;i++){
            int num=sc.nextInt();
            
            String k=sc.nextLine().trim();
            n.put(num,k);
        }
        System.out.println(n.firstEntry());
        System.out.println(n.lastEntry());
        int np=sc.nextInt();
        System.out.println(n.get(np));
        System.out.println(n.higherEntry(103));
        System.out.println(n.lowerEntry(103));
        n.remove(105);
        System.out.println(n);
    }
}