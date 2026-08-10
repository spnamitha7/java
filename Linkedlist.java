import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> hello=new LinkedList<>();
        for(int i=0;i<5;i++){
           hello.add(sc.nextInt());
        }
        hello.addFirst(10);
        hello.addLast(39);
        hello.removeFirst();
        hello.removeLast();
        System.out.println(hello.getFirst());
        System.out.println(hello.getLast());
sc.nextLine();
        LinkedList<String> n=new LinkedList<>();
         for(int i=0;i<5;i++){
            n.add(sc.nextLine());
         }
         boolean found=false;
         for(int i=0;i<n.size();i++){
            if(n.get(i).equalsIgnoreCase("ravi")){
                System.out.println("ravi found and removed");
                n.remove(i);
                found=true;
                break;
                
            }
         }
         if(!found){
            System.out.println("not found ravi");
         }
         for(int i=0;i<n.size();i++){
            System.out.println(n.get(i));
         }
    }
}
