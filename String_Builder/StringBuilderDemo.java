package String_Builder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder strb= new StringBuilder("ABC");
        System.out.println(strb.append("CD"));
        System.out.println(strb.append(10));
        System.out.println(strb.insert(2,"Y"));
        System.out.println(strb.delete(0, 03));
        System.out.println(strb.reverse());
    }
    
}
