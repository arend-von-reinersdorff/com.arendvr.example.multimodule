package com.arendvr.example.multimodule.polite;

import com.arendvr.example.multimodule.greeter.Greeter;
import org.junit.jupiter.api.Test;

class PoliteGreeterTest {
    @Test
    void greeterGoodbye() {
        Greeter greeter = new Greeter();

        // test
        greeter.sayGoodbye();
    }

    @Test
    void politeSayGoodbye() {
        PoliteGreeter politeGreeter = new PoliteGreeter();

        // test
        politeGreeter.sayGoodbye();
    }
}
