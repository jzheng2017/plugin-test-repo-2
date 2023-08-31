package org.example;

import org.apache.commons.text.WordUtils;

public class Main {
    public static void main(String[] args) {
        Hello s = new HelloImpl();

        System.out.println(s.helloWorld("hello world"));

        System.out.println(WordUtils.capitalize("foo bar"));
    }

}
