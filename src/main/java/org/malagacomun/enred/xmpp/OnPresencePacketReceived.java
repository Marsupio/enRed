package org.malagacomun.enred.xmpp;

import org.malagacomun.enred.entities.Account;
import org.malagacomun.enred.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
