import java.util.*;
public class dequeue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Deque<String> n=new LinkedList<>();
        for(int i=0;i<3;i++){
            n.addLast(sc.nextLine());
        }
        for(int i=3;i<5;i++){
            n.addFirst(sc.nextLine());
        }
        System.out.println(n.peekFirst());
        System.out.println(n.peekLast());
        n.removeFirst();
        n.removeLast();
        System.out.println(n);

    }
}
