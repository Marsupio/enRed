package org.malagacomun.enred.xmpp;

import org.malagacomun.enred.entities.Account;
import org.malagacomun.enred.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	public void onIqPacketReceived(Account account, IqPacket packet);
}
