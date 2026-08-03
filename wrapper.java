public class wrapper {
    public static void main(String[] args) {
        int a=10;
        Integer o=a;
        System.out.println(o);
        int b=o;
        System.out.println(b);
        Integer obj=Integer.valueOf(b);
        int p=obj.intValue();
        System.out.println(p);
    }
}
