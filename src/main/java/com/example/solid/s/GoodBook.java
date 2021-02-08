package com.example.solid.s;

public class GoodBook {

    private String name;
    private String author;
    private String text;

    //methods that directly relate to the book properties
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}
