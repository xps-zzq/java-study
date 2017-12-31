package org.goskyer.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行参数
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 堆溢出
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
