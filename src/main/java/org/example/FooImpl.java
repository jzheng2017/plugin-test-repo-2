package org.example;

import org.apache.commons.text.WordUtils;

public class FooImpl implements Foo {

    @Override
    public String bar(String text) {
        return WordUtils.capitalize(text);
    }
}
