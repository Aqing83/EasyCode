package jvm01;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

public class Test04 extends ClassLoader {
    public static void main(String[] args) {
        int j = 0;
        try {
            Test04 test04 = new Test04();
            for (int i = 0; i < 10000; i++) {
                ClassWriter cw = new ClassWriter(0);
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "class" + i, null, "java/lang/Object", null);
                byte[] code = cw.toByteArray();
                test04.defineClass("class" + i, code, 0, code.length);
                j++;
            }
        } finally {
            System.out.println(j);
        }

    }
}
