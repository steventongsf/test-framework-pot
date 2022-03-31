package org.stong.junit;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.stong.local.servergroups.LdapServerGroup;

public class LdapServerTestCase {
	Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	@BeforeEach
	public void beforeEach() {
		LdapServerGroup ssg = new LdapServerGroup();
		ssg.start();
	}
}
