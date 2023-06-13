public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

    // 2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hello, world!";
        System.out.println(myString);

        // 3. Change your code to assign a character value to myString. What do you notice?
        // incompatible types: char cannot be converted to java.lang.String
        // myString = 'A';

    // 4. Change your code to assign the value 3.14159 to myString. What happens?
    //  incompatible types: double cannot be converted to java.lang.String
//        myString = 3.14159;

        // 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        // variable myNumber might not have been initialized
//        long myNumber;
        //        System.out.println(myNumber);

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
        // incompatible types: possible lossy conversion from double to long
//        myNumber = 3.14;
    // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;
    // 8. Change your code to assign the value 123 to myNumber.
//        myNumber = 123;
    //  Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        long can only hold integers, but assigning an integer value (int literal) like 42 to a long variable works because int values can be automatically converted to long.
    // 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        incompatible types: possible lossy conversion from double to float
//        float myNumber = 3.14;
//        you can ue this to fix the code
        float myNumber = 3.14f;
//        float myNumber = (float) 3.14;
//      10.  Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        The first code block (x++) is using the post-increment operator. It prints the value of x (5) and then increments x by 1. So, the first print statement displays the original value of x, and the second print statement shows the updated value (6).
//        The second code block (++x) is using the pre-increment operator. It increments x by 1 first and then prints the updated value. Therefore, both print statements display the same value (6), as x is incremented before the first print statement executes.
//        11. Try to create a variable named class. What happens?
//        String class;
//        You will encounter a compilation error because class is a reserved keyword
//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')

//        13. Rewrite the following expressions using the relevant shorthand assignment operators:
//        Q. int x = 4;
//        x = x + 5;

//        A. int x = 4;
//        x += 5;

//        Q. int x = 3;
//        int y = 4;
//        y = y * x;

//        A. int x = 3;
//        int y = 4;
//        y *= x;

//        Q.int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
// 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//        If you assign a value to a numerical variable that is larger than the type can hold, it will result in an overflow.
//        When assigning a value beyond the capacity of a numerical type or incrementing a variable beyond its maximum value, the value will wrap around to the minimum representable value for that type, causing an overflow.








    }
}