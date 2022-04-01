package com.stong.examples.tests;

import java.util.logging.Logger;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.stong.junit.JUnitGroup;
import org.stong.junit.SharedServerTestCase;

public class SlowUnitTest extends SharedServerTestCase {
	Logger logger = Logger.getLogger(this.getClass().getName());
	@Tag(JUnitGroup.SMOKE)
	@Tag(JUnitGroup.REGRESSION)
	@Tag(JUnitGroup.INTEGRATION)
	@Test
	public void smokeAndRegression() throws InterruptedException{
		logger.info("Smoke and regression test");
	}
	@Tag(JUnitGroup.INTEGRATION)
	@Tag(JUnitGroup.REGRESSION)
	@Test
	public void integrationAndRegression() throws InterruptedException{
		logger.info("regression test");
	}
	@Tag(JUnitGroup.PRICE)
	@Tag(JUnitGroup.INTEGRATION)
	@Test
	public void priceAndIntegration() throws InterruptedException{
		logger.info("Price integration test");
	}
}
