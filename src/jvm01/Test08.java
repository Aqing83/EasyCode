package jvm01;

import javax.xml.transform.Source;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class Test08 {
    private static final int _4MB = 4 * 1024 * 1024;

    public static void main(String[] args) throws IOException {
//        List<byte[]> list = new ArrayList<>();
//        for(int i =0;i<5;i++){
//            list.add(new byte[_4MB]);
//        }
//
//        System.in.read();
        soft();
    }

    public static void soft() {
        List<SoftReference<byte[]>> ref = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            SoftReference<byte[]> sof = new SoftReference<>(new byte[_4MB]);
            System.out.println(sof.get());
            ref.add(sof);
            System.out.println(ref.size());
        }
        System.out.println("循环结束：" + ref.size());
        for (SoftReference<byte[]> srf : ref) {
            System.out.println(srf.get());
        }

    }
}
