import java.util.stream.*;
import java.util.*;
public class intermediate {
    public static void main(String[] args) {
        List<Integer>  num=Arrays.asList(34,3,2,4,3,58,9);
        List<String> name=Arrays.asList("namitha","varshini","vedha");
        num.stream().sorted().forEach(n->System.out.print(n + " "));
        System.out.println();
        num.stream().distinct().forEach(n->System.out.print(n + " "));
        System.out.println();
        name.stream().map(n ->n.toLowerCase()).forEach(n->System.out.print(n + " "));
        System.out.println();
        num.stream().filter(n->n>20).forEach(n->System.out.print(n + " "));
        System.out.println();
        num.stream().limit(3).forEach(n->System.out.print(n + " "));
        System.out.println();
        num.stream().skip(2).forEach(n->System.out.print(n + " "));
    }
}
