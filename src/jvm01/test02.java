package jvm01;

public class test02 {
    private static int count;
    public static void main(String[] args) {
        try {
            method01();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(count);
        }
    }
    private static void method01(){
        count++;
        method01();
    }

}
