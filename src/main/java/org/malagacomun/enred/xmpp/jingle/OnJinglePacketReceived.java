package org.malagacomun.enred.xmpp.jingle;

import org.malagacomun.enred.entities.Account;
import org.malagacomun.enred.xmpp.PacketReceived;
import org.malagacomun.enred.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
