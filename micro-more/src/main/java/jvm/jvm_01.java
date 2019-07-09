package jvm;

import java.util.ArrayList;
import java.util.List;

public class jvm_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list = null;
    }
}
