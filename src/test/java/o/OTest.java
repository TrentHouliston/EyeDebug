/*
 * This program is free software. It comes without any warranty, to the extent
 * permitted by applicable law. You can redistribute it and/or modify it under
 * the terms of the Do What The Fuck You Want To Public License, Version 2, as
 * published by Sam Hocevar. See http://sam.zoy.org/wtfpl/COPYING for more
 * details.
 */
package o;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

/**
 * This tests that the method works as expected
 *
 * @author Trent Houliston
 */
public class OTest extends TestCase
{

	/**
	 * Test that when no elements are passed, that two square brackets are
	 * outputted.
	 */
	public void testNoElements()
	{
		//Create a stream to capture the output
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setErr(ps);

		//Run the method
		O.o();

		//Check the result
		assertEquals("[]\n", baos.toString());
	}

	public void testSingleElement()
	{
		//Test that when a single element is passed, that just it toString is outputted
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setErr(ps);

		//Output foo
		O.o("foo");

		//Check that foo was outputted
		assertEquals("foo\n", baos.toString());
	}

	/**
	 * Test the case when the varargs are used, (check for a list of all the
	 * elements)
	 */
	public void testVarargs()
	{
		//Capture the result
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setErr(ps);

		//Output three objects
		O.o("foo", "bar", 3);

		//Check the three objects are outputted
		assertEquals("[foo, bar, 3]\n", baos.toString());
	}
}
