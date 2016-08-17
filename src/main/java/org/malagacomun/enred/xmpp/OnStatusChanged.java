package org.malagacomun.enred.xmpp;

import org.malagacomun.enred.entities.Account;

public interface OnStatusChanged {
	public void onStatusChanged(Account account);
}
