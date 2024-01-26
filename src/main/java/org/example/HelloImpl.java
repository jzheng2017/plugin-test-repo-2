package org.example;

import org.apache.commons.text.WordUtils;

public class HelloImpl implements Hello {

    @Override
    public String helloWorldV2(String text) {
        return WordUtils.capitalize(text);
    }
}
