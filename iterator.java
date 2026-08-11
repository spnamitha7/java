import java.util.*;
public class iterator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> n=new ArrayList<>();
        for(int i=0;i<5;i++){
            n.add(sc.nextInt());
        }
        Iterator<Integer> it=n.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(num==30){
                it.remove();
            }
        }
        System.out.println(n);

    }
}
