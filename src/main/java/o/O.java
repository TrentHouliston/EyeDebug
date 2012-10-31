/*
 * This program is free software. It comes without any warranty, to the extent
 * permitted by applicable law. You can redistribute it and/or modify it under
 * the terms of the Do What The Fuck You Want To Public License, Version 2, as
 * published by Sam Hocevar. See http://sam.zoy.org/wtfpl/COPYING for more
 * details.
 */
package o;

import java.util.Arrays;

/**
 * This class is used for simple debugging, it handles arrays and other objects
 * but mainly it is simple to use. It can be used as O.o(objects) (easy for
 * shorthand) or if you do not wish to import then use o.O.o(object)
 *
 * @author Trent Houliston
 */
public class O
{

	/**
	 * This method accepts a variable number of objects and outputs their
	 * content to System.err.
	 *
	 * @param o The objects to output
	 */
	public static void o(Object... o)
	{
		//If only a single object is passed then use use toString
		if (o.length == 1)
		{
			System.err.println(o[0].toString());
		}
		//Otherwise output all the objects using deepToString
		else
		{
			System.err.println(Arrays.deepToString(o));
		}
	}
}
