package org.stong.local.servers;

public class LdapServer implements DTServer {

	@Override
	public boolean start() {
		if (this.isAvailable()) {
			return true;
		}
		else {
			return this.restart(true);
		}
	}

	@Override
	public boolean stop() {
		if (this.isAvailable()) {
			// TODO stop server
			return true;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean restart() {
		if (!this.stop()) {
			return false;
		}
		return this.start();
	}

	@Override
	public boolean isAvailable() {
		// TODO Implement check
		return false;
	}

	@Override
	public boolean restart(boolean force) {
		if (!this.stop()) {
			return false;
		}
		return this.start();
	}

}
