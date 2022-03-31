package org.stong.local.servers;

public interface DTServer {
	public boolean start();
	public boolean stop();
	public boolean restart();
	public boolean isAvailable();
	public boolean restart(boolean force);
}
