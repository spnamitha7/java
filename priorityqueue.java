import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> n=new PriorityQueue<>();
        for(int i=0;i<7;i++){
            n.add(sc.nextInt());
        }
        System.out.println(n);
        while(!n.isEmpty()){
            System.out.println(n.poll());
        }
    }
    
}
