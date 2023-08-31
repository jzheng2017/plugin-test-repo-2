package org.example;

import org.apache.commons.text.WordUtils;

public interface Foo {
    default String foo() {
        return WordUtils.capitalize("foo");
    }
    String bar(String text);

}
