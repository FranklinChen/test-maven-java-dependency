package org.talkbank;

import static org.talkbank.Constants.*;

public class Main {
    /**
       When Constants.java is modified so that SILLY is changed,
       Main.java should be recompiled.
     */
    public int getVersion() {
	return MAGIC_NUMBER;
    }
}
