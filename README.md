# Decimal_Converter
Program that converts decimal to binary and hexadecimal as done by Group 3


a)
The toBinarytoHex.java file answers part a of the question and successfully converts a decimal number to Binary as shown on the screenshots attached in the images folder.
The program is responsive as it asks the user the number they would like to convert.
It achieves this by using two functions;
  i)  toBinary(int num) 
  This function takes the decimal number as input
  Intialises and array of int values
  the logic is, if the decimal number is 0, the output will be 0 and if 1, 0
  but when greater than one, it will get the modulus of the number and 2 and append it to the array until it is complete
  We will then read the array backwards as it is usually done in binary conversion using a for loop.
  
  ii)toHex(int num)
  This function takes the decimal number as input,
  Intialises an array of char values because hexadecimal includes values such as A,B,C,D,E and F which are not integers
  the logic is, if the decimal number is 0, the output will be 0 and if 1, 0
  but when greater than 1, it will calculate the modulus of the number and 16
  and before appending to the array, it will check if it is greater than 10, if yes, it will convert it to its respective char value
  but if it is less than ten, it will append it to the array directly
  
This is all run on the output.java file that displays an interface to enter their desired decimal number
  
b)
The DoubleToBinary.java answers part b of the question and successfully generates 30 random floating point numbers and converts them to their binary equivalent.
It acheves this by using four functions;
  i)RandomNumbers()
  This function generates a random floating point number and returns it.
  ii)splitter(double x)
  This function takes the floating number generated above and splits it to form separate integer and double values and returns the double part of the nmber
  iii)IntToBinary(double x)
  This function converts the integer part to binary and stores the binary values in an array which is then read backwards to produce correct output. 
  iv)FractionToBinary( double x)
  This function converts the decimal part of the random number generated to binary and stores the binary values in an array which is then read to produce the correct output.
  
  
