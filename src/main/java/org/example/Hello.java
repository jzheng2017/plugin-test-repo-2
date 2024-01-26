package org.example;

import org.apache.commons.text.WordUtils;

public interface Hello {
    default String world() {
        return WordUtils.capitalize("foo");
    }
    String helloWorldV2(String text);

}
