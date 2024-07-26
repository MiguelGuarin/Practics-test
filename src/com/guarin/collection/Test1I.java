package com.guarin.collection;

public class Test1I {
    static int r = 0;

    {
        r++;
        System.out.println(r);
    }

    static int sumar(int a, int b) {

        return a + b;
    }
}
