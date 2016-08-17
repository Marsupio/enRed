package org.malagacomun.enred.xmpp;

import org.malagacomun.enred.entities.Account;
import org.malagacomun.enred.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
