package com.arendvr.example.multimodule.polite;

import com.arendvr.example.multimodule.greeter.Greeter;

public class PoliteGreeter extends Greeter {
    @Override
    public void greet() {
        System.out.println("Hello, Handsome!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye, Handsome!");
    }
}
