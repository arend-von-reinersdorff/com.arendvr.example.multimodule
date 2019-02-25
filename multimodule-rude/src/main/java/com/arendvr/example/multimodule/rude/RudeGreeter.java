package com.arendvr.example.multimodule.rude;

import com.arendvr.example.multimodule.greeter.Greeter;

public class RudeGreeter extends Greeter {
    @Override
    public void greet() {
        System.out.println("Hello, Stupid!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye, Stupid!");
    }
}
