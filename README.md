# NumberFormatException in Scala String to Int Constructor

This example demonstrates a common Scala error: `NumberFormatException` when converting a String to an Int within a secondary constructor.  The issue arises when the String cannot be parsed into a valid integer value.

## Steps to reproduce

1. Create a `MyClass` with an Int constructor and a String constructor that calls the Int constructor. 
2. Attempt to create an instance of `MyClass` using the String constructor with a non-numeric String.

## Solution

Proper error handling is crucial.  Add a `try-catch` block around the conversion to handle `NumberFormatException` gracefully.