package jvm01;

public class test03 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1....");
        Thread.sleep(30000);
        System.out.println("2....");
        byte[] array = new byte[1024 * 1024 * 10];
        Thread.sleep(15000);
        array = null;
        System.gc();
        System.out.println("3....");
        Thread.sleep(1000000L);
    }
}
