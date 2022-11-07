package jvm01;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class Test09 {
    private static final int _512KB = 512 * 1024;
    private static final int _1MB =  1024 * 1024;
    private static final int _4MB = 4 * 1024 * 1024;
    private static final int _6MB = 6 * 1024 * 1024;
    private static final int _7MB = 7 * 1024 * 1024;
    private static final int _8MB = 8 * 1024 * 1024;
    private static final int _1GB = 1024 * 1024 * 1024;

    public static void main(String[] args) throws IOException {
        List<byte[]> list = new ArrayList<>();
        list.add(new byte[_7MB]);
        list.add(new byte[_512KB]);
        list.add(new byte[_512KB]);

    }
}
