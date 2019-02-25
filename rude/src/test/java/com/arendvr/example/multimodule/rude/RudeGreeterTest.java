package com.arendvr.example.multimodule.rude;

import com.arendvr.example.multimodule.greeter.Greeter;
import org.junit.jupiter.api.Test;

class RudeGreeterTest {
    @Test
    void greterGreet() {
        Greeter greeter = new Greeter();

        // test
        greeter.greet();
    }

    @Test
    void rudeGreet() {
        RudeGreeter rudeGreeter = new RudeGreeter();

        // test
        rudeGreeter.greet();
    }
}
