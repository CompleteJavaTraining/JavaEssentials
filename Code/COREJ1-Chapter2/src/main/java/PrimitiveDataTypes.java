public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
        * You may have noticed that the new keyword isn't used when initializing a variable of a primitive type.
        * Primitive types are special data types built into the language; they are not objects created from a class.
        * A literal is the source code representation of a fixed value; literals are represented directly in your code without requiring computation.
        * As shown below, it's possible to assign a literal to a variable of a primitive type:
        * */
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;

        /*
        * Integer Literals
        * An integer literal is of type long if it ends with the letter L or l; otherwise it is of type int. It is recommended that you use the upper case letter L because the lower case letter l is hard to distinguish from the digit 1.
        * Values of the integral types byte, short, int, and long can be created from int literals. Values of type long that exceed the range of int can be created from long literals. Integer literals can be expressed by these number systems:
            * Decimal: Base 10, whose digits consists of the numbers 0 through 9; this is the number system you use every day
            * Hexadecimal: Base 16, whose digits consist of the numbers 0 through 9 and the letters A through F
            * Binary: Base 2, whose digits consists of the numbers 0 and 1 (you can create binary literals in Java SE 7 and later)
        * For general-purpose programming, the decimal system is likely to be the only number system you'll ever use. However, if you need to use another number system, the following example shows the correct syntax.
        * The prefix 0x indicates hexadecimal and 0b indicates binary:
        * */
        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;

        /*
        * Floating-Point Literals
        * A floating-point literal is of type float if it ends with the letter F or f; otherwise its type is double and it can optionally end with the letter D or d.
        * The floating point types (float and double) can also be expressed using E or e (for scientific notation), F or f (32-bit float literal) and D or d (64-bit double literal; this is the default and by convention is omitted).
        * */

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;

        /*
        * Literals of types char and String may contain any Unicode (UTF-16) characters. If your editor and file system allow it, you can use such characters directly in your code. If not, you can use a "Unicode escape" such as '\u0108' (capital C with circumflex), or "S\u00ED Se\u00F1or" (Sí Señor in Spanish). Always use 'single quotes' for char literals and "double quotes" for String literals. Unicode escape sequences may be used elsewhere in a program (such as in field names, for example), not just in char or String literals.
        * The Java programming language also supports a few special escape sequences for char and String literals: \b (backspace), \t (tab), \n (line feed), \f (form feed), \r (carriage return), \" (double quote), \' (single quote), and \\ (backslash).
        * There's also a special null literal that can be used as a value for any reference type. null may be assigned to any variable, except variables of primitive types. There's little you can do with a null value beyond testing for its presence. Therefore, null is often used in programs as a marker to indicate that some object is unavailable.
        * Finally, there's also a special kind of literal called a class literal, formed by taking a type name and appending ".class"; for example, String.class. This refers to the object (of type Class) that represents the type itself.
        * */
        System.out.println("S\u00ED Se\u00F1or");
        //prints
        //Sí Señor
        System.out.println("\b (backspace), \t (tab), \n (line feed), \f (form feed), \r (carriage return), \" (double quote), \' (single quote), and \\ (backslash).");

        /*
        * Using Underscore Characters in Numeric Literals
        * The following example shows other ways you can use the underscore in numeric literals:
        * */
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        /*
        * You can place underscores only between digits; you cannot place underscores in the following places:
            * At the beginning or end of a number
            * Adjacent to a decimal point in a floating point literal
            * Prior to an F or L suffix
            * In positions where a string of digits is expected
        * */
    }
}
