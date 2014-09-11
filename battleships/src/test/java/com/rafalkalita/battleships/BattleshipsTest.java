package com.rafalkalita.battleships;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleshipsTest {

	private Battleships battleships = new Battleships();

	@Test
	public void testStart() throws Exception {
		String result = battleships.start();
		assertEquals("Invalid result", "Battleships!", result);
	}
}
