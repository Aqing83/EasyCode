package jvm01;

public class Test06 extends ClassLoader {
    public static void main(String[] args) {

        String s2 = new String ("a")+new String("b");
        String s3 = s2.intern();
        String s1 = "ab";


        System.out.println(s1 == s3);
        System.out.println(s2 == s1);

    }
}
