import java.util.*;
public class treeset {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       TreeSet<Integer> n=new TreeSet<>();
       for(int i=0;i<7;i++){
        n.add(sc.nextInt());
       } 
       for(int num:n){
        System.out.print(num+" ");
       }
       System.out.println(n.first());
       System.out.println(n.last());
    }
}
