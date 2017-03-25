package com.structural.facade;


public class MainContentGenerator implements ContentGenerator {

    @Override
    public String generate() {
        return "Generating mail body";
    }
}
