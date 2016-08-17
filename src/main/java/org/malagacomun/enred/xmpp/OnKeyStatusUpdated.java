package org.malagacomun.enred.xmpp;

import org.malagacomun.enred.crypto.axolotl.AxolotlService;

public interface OnKeyStatusUpdated {
	public void onKeyStatusUpdated(AxolotlService.FetchStatus report);
}
