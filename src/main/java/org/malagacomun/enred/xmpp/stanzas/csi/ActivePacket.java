package org.malagacomun.enred.xmpp.stanzas.csi;

import org.malagacomun.enred.xmpp.stanzas.AbstractStanza;

public class ActivePacket extends AbstractStanza {
	public ActivePacket() {
		super("active");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
