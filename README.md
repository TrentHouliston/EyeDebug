Eye Debug
=========
This library is a simple class made for making the task of debugging easier. No longer must you use the excessively long (and array unfriendly) System.err.println()

Now you can simply use the power of the Eyes (O.o) to make your life easier

##Usage
There are several ways in which this class can be used.

Firstly you can simply use it as a output replacement that is easier to type, either by importing it or by calling it by its fully qualified name

	$ O.o(variable);
	$ 	
	$ o.O.o(variable);

Secondly since it is a varargs method you can use it to quickly output several variables in a single call

	$ O.o(varA, varB, varC)

which will result in [varA, varB, varC]


Thirdly you can use it to output the contents of an array

	$ O.o(array)

which will result in [element1, element2, element3, etc]

These will work in any combination of elements and arrays

	$ O.o(varA, array, varB)
	
results in [varA, [element1, element2, element3, etc], varB]

Enjoy.
