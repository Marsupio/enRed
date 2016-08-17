package org.malagacomun.enred.xmpp.jingle;

import org.malagacomun.enred.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
