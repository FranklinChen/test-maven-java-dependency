package org.talkbank;

import org.junit.*;
import static org.junit.Assert.*;

public class MainTest {
    @Test
	public void changingConstantsShouldTriggerRecompilation() {
	final Main main = new Main();
	assertEquals(main.getVersion(), 42);
    }
}