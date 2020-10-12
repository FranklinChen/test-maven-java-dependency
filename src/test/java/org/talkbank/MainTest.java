package org.talkbank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
	public void changingConstantsShouldTriggerRecompilation() {
	final Main main = new Main();
	assertEquals(main.getVersion(), 42);
    }
}
