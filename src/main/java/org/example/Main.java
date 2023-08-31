package org.example;

import org.apache.commons.text.WordUtils;

public class Main {
    public static void main(String[] args) {
        Foo s = new FooImpl();

        System.out.println(s.bar("hello world"));

        System.out.println(WordUtils.capitalize("foo bar"));
    }

}
