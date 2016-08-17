package org.malagacomun.enred.xmpp;

import org.malagacomun.enred.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
