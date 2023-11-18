package com.owr.division;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AngleDivisionTest {

	private AngleDivision2 instance;

	@BeforeEach
	public void init() {
		instance = new AngleDivision2();
	}

	@Test
	public void zeroInTheEnd() {

		DataResult res = instance.div(new DataInput(920, 4));

		assertEquals(230, res.getResult());
		assertEquals(0, res.getRemainder());

	}

	@Test
	public void zeroInTheMiddle() {

		DataResult res = instance.div(new DataInput(4004, 4));

		assertEquals(1001, res.getResult());
		assertEquals(0, res.getRemainder());

	}

	@Test
	public void moveTwoNumbersInARow() {

		DataResult res = instance.div(new DataInput(1435, 7));

		assertEquals(205, res.getResult());
		assertEquals(0, res.getRemainder());

	}

	@Test
	public void firstIsLessThanDivider2() {

		DataResult res = instance.div(new DataInput(3060, 9));

		assertEquals(340, res.getResult());
		assertEquals(0, res.getRemainder());

	}

	@Test
	public void firstIsLessThanDivider3() {

		DataResult res = instance.div(new DataInput(1122, 6));

		assertEquals(187, res.getResult());
		assertEquals(0, res.getRemainder());

	}

	@Test
	public void firstIsLessThanDividerWithReminder() {

		DataResult res = instance.div(new DataInput(1127, 6));

		assertEquals(187, res.getResult());
		assertEquals(5, res.getRemainder());

	}

	@Test
	public void firstIsGreaterThanDivider() {

		DataResult res = instance.div(new DataInput(7122, 6));

		assertEquals(1187, res.getResult());
		assertEquals(0, res.getRemainder());

	}

	@Test
	public void firstIsGreaterThanDividerWithReminder() {

		DataResult res = instance.div(new DataInput(7127, 6));

		assertEquals(1187, res.getResult());
		assertEquals(5, res.getRemainder());

	}

	@Test
	public void test12345_6() {

		DataResult res = instance.div(new DataInput(12345, 6));

		assertEquals(2057, res.getResult());
		assertEquals(3, res.getRemainder());

	}

	@Test
	public void test54321_7() {

		DataResult res = instance.div(new DataInput(54321, 7));

		assertEquals(7760, res.getResult());
		assertEquals(1, res.getRemainder());

	}

	@Test
	public void test855_5() {

		DataResult res = instance.div(new DataInput(855, 5));

		assertEquals(171, res.getResult());
		assertEquals(0, res.getRemainder());

	}

}
