package org.malagacomun.enred.xmpp.jingle.stanzas;

import org.malagacomun.enred.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
