
import java.util.*;
import java.util.stream.*;
public class stream{
    public static void main(String[] args) {
        List<String> name=Arrays.asList("namitha","varshini","vedha");
        Stream<String> namestram=name.stream();
        namestram.forEach(System.out::println);

        int arr[]={1,2,3,4};
        Arrays.stream(arr).forEach(System.out::print);

        Stream<Integer> num=Stream.of(1,3,4,5,6,5);
        num.forEach(System.out::println);

        Stream<String> hello=Stream.generate(()-> "hello").limit(8);
        hello.forEach(System.out::println);

        Stream<Integer> hi=Stream.iterate(3,n -> n+1).limit(3);
        hi.forEach(System.out::println);
    }
}