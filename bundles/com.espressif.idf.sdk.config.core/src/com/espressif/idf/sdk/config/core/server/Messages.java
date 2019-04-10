package com.espressif.idf.sdk.config.core.server;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
	private static final String BUNDLE_NAME = "com.espressif.idf.sdk.config.core.server.messages"; //$NON-NLS-1$
	public static String JsonConfigServerRunnable_CmdToBeExecuted;
	static
	{
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages()
	{
	}
}
