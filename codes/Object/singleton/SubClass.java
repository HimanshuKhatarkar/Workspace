package com.himanshu.singleton;

import com.himanshu.access.A;

import java.util.ArrayList;
import java.util.Collections;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "himanshu khatarkar");
//        int n = obj.num;
    }
}

class SubSubclass extends SubClass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "himanshu khatarkar");
        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "himanshu khatarkar");
//        int n = obj.num;
    }
}