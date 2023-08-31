package org.example;

import org.apache.commons.text.WordUtils;

public class HelloImpl implements Hello {

    @Override
    public String helloWorld(String text) {
        return WordUtils.capitalize(text);
    }
}
