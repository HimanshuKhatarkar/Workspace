package com.himanshu.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human himanshu = new Human(34, "himanshu khatarkar");
//        Human twin = new Human(himanshu);

        Human twin = (Human)himanshu.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(himanshu.arr));
    }
}
