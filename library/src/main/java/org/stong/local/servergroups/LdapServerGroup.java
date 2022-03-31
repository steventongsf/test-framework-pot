package org.stong.local.servergroups;

import org.stong.local.servers.LdapServer;

public class LdapServerGroup implements DTServerGroup {

	@Override
	public boolean start() {
		LdapServer ldap = new LdapServer();
		return ldap.start();
	}

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean restart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean restart(boolean force) {
		// TODO Auto-generated method stub
		return false;
	}

}
