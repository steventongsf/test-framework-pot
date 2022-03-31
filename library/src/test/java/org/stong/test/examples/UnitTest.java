package org.stong.test.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.stong.junit.JUnitGroup;

class UnitTest {

	@Test
	@Tag(JUnitGroup.UNIT)
	@Tag(JUnitGroup.FAST)
	void testNothing() {
	}
	@Test
	@Tag(JUnitGroup.UNIT)
	@Tag(JUnitGroup.FAST)
	void shouldThrowException() {
	    Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
	      throw new UnsupportedOperationException("Not supported");
	    });
	    assertEquals(exception.getMessage(), "Not supported");
	}

	@Test
	@Tag(JUnitGroup.UNIT)
	@Tag(JUnitGroup.FAST)
	void assertThrowsException() {
	    String str = null;
	    assertThrows(IllegalArgumentException.class, () -> {
	      Integer.valueOf(str);
	    });
	}
	@Tag(JUnitGroup.UNIT)
	@Tag(JUnitGroup.FAST)
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, Integer.MAX_VALUE}) // six numbers
	void isOdd_ShouldReturnTrueForOddNumbers(int number) {
	    assertTrue((number % 2) > 0);
	}
	@Tag(JUnitGroup.UNIT)
	@Tag(JUnitGroup.FAST)
	@ParameterizedTest
	@CsvSource({"test,TEST", "tEst,TEST", "Java,JAVA"})
	void toUpperCase_ShouldGenerateTheExpectedUppercaseValue(String input, String expected) {
	    String actualValue = input.toUpperCase();
	    assertEquals(expected, actualValue);
	}
	@Tag(JUnitGroup.UNIT)
	@Tag(JUnitGroup.FAST)
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	void toUpperCase_ShouldGenerateTheExpectedUppercaseValueCSVFile(
	  String input, String expected) {
	    String actualValue = input.toUpperCase();
	    assertEquals(expected, actualValue);
	}
	
}
