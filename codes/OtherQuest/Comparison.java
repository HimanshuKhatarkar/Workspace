package com.himanshu;

public class Comparison {
    public static void main(String[] args) {
        String a = "himanshu";
        String b = "himanshu";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("himanshu");
        String name2 = new String("himanshu");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
