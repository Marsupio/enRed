package org.malagacomun.enred.services;

import org.malagacomun.enred.entities.Account;

public class PushManagementService {

	protected final XmppConnectionService mXmppConnectionService;

	public PushManagementService(XmppConnectionService service) {
		this.mXmppConnectionService = service;
	}

	public void registerPushTokenOnServer(Account account) {
		//stub implementation. only affects playstore flavor
	}

	public boolean available(Account account) {
		return false;
	}

	public boolean isStub() {
		return true;
	}
}
