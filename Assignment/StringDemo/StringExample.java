package Assignment.StringDemo;

public class StringExample {
    public static void main(String[] args) {
        

    
    String S1="Aviraj";
    String S2="pratik";
    System.out.println("length of S1 is"+S1.length());
    System.out.println("character at index"+S1.charAt(1));
    System.out.println(S1.concat(S2));
    System.out.println("last index of a"+S2.lastIndexOf('a'));
    System.out.println("Replace pratik to gratik="+S2.replace('p','g'));
    String S3="  Hello";
    System.out.println("original S3 is"+S3);
    System.out.println("Length of S3="+S3.length());
    String S4=S3.trim();
    System.out.println("length of S4="+S4.length());
    System.out.println("After print S4 ="+S4.length());
    }
}
