package jvm01;

public class test01 {
    public static void main(String[] args) {
        method01();
    }
    private static void method01(){
        method02(1,2);
    }
    private static int method02(int a ,int b){
        int c = a + b ;
        return c;
    }

}
