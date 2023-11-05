package Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {

    public static void main(String[] args) {

        testStringBuilder();
        testStringBuffer();
    }

    public static void testStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("321231");
        System.out.println(stringBuffer.toString());

        return ;
    }

    public static void testStringBuilder() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("321231");
        System.out.println(stringBuffer.toString());

        return ;
    }
}
