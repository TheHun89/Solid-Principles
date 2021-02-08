package com.example.solid.s;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadBook {

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

    //methods for outputting text to console - should this really be here?
    public void printTextToConsole(){
        //our code for formatting and printing the text
    }


}
