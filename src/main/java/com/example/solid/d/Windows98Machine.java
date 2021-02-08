package com.example.solid.d;

import lombok.Getter;

@Getter
public class Windows98Machine {

    private StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {

        monitor = new Monitor();
        keyboard = new StandardKeyboard();

    }

}
