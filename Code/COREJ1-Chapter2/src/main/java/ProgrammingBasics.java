public class ProgrammingBasics {
    public static void main(String[] args) {
        /*
        * The Java programming language defines the following kinds of variables:
            * Instance Variables (Non-Static Fields) Technically speaking, objects store their individual states in "non-static fields", that is, fields declared without the static keyword. Non-static fields are also known as instance variables because their values are unique to each instance of a class (to each object, in other words); the currentSpeed of one bicycle is independent from the currentSpeed of another.
            * Class Variables (Static Fields) A class variable is any field declared with the static modifier; this tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated. A field defining the number of gears for a particular kind of bicycle could be marked as static since conceptually the same number of gears will apply to all instances. The code static int numGears = 6; would create such a static field. Additionally, the keyword final could be added to indicate that the number of gears will never change.
            * Local Variables Similar to how an object stores its state in fields, a method will often store its temporary state in local variables. The syntax for declaring a local variable is similar to declaring a field (for example, int count = 0;). There is no special keyword designating a variable as local; that determination comes entirely from the location in which the variable is declared — which is between the opening and closing braces of a method. As such, local variables are only visible to the methods in which they are declared; they are not accessible from the rest of the class.
            * Parameters: Recall that the signature for the main method is public static void main(String[] args). Here, the args variable is the parameter to this method. The important thing to remember is that parameters are always classified as "variables" not "fields". This applies to other parameter-accepting constructs as well (such as constructors and exception handlers) that you'll learn about later in the course.
        * Having said that, the remainder of this tutorial uses the following general guidelines when discussing fields and variables.
        * If we are talking about "fields in general" (excluding local variables and parameters), we may simply say "fields".
        * If the discussion applies to "all of the above", we may simply say "variables".
        * If the context calls for a distinction, we will use specific terms (static field, local variables, etc.) as appropriate.
        * You may also occasionally see the term "member" used as well.
        * A type's fields, methods, and nested types are collectively called its members.
        * */

        //Variables and Assignment Operators
        int cadence = 0;
        int speed = 0;
        int gear = 1;

        /*
        * Variable names are case-sensitive. A variable's name can be any legal identifier — an unlimited-length sequence of Unicode letters and digits, beginning with a letter, the dollar sign "$", or the underscore character "_". The convention, however, is to always begin your variable names with a letter, not "$" or "_". Additionally, the dollar sign character, by convention, is never used at all. You may find some situations where auto-generated names will contain the dollar sign, but your variable names should always avoid using it. A similar convention exists for the underscore character; while it's technically legal to begin your variable's name with "_", this practice is discouraged. White space is not permitted.
        * Subsequent characters may be letters, digits, dollar signs, or underscore characters. Conventions (and common sense) apply to this rule as well. When choosing a name for your variables, use full words instead of cryptic abbreviations. Doing so will make your code easier to read and understand. In many cases it will also make your code self-documenting; fields named cadence, speed, and gear, for example, are much more intuitive than abbreviated versions, such as s, c, and g. Also keep in mind that the name you choose must not be a keyword or reserved word.
        * If the name you choose consists of only one word, spell that word in all lowercase letters. If it consists of more than one word, capitalize the first letter of each subsequent word. The names gearRatio and currentGear are prime examples of this convention. If your variable stores a constant value, such as static final int NUM_GEARS = 6, the convention changes slightly, capitalizing every letter and separating subsequent words with the underscore character. By convention, the underscore character is never used elsewhere.
        * */

        //Arithmetic Operators
        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);

        /*
        OUTPUT:
        1 + 2 = 3
        3 - 1 = 2
        2 * 2 = 4
        4 / 2 = 2
        2 + 8 = 10
        10 % 7 = 3
        * */

        //Equality and Relational Operators
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");

        /*
        OUTPUT:
        value1 != value2
        value1 < value2
        value1 <= value2
        * */

        //Ternary Operator
        value1 = 1;
        value2 = 2;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
        /*
        OUTPUT:
        1
        * */

        //The Type Comparison Operator instanceof
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));

        /*
        Output:
        obj1 instanceof Parent: true
        obj1 instanceof Child: false
        obj1 instanceof MyInterface: false
        obj2 instanceof Parent: true
        obj2 instanceof Child: true
        obj2 instanceof MyInterface: true
        * */

        //Bitwise and Bit Shift operators
        int a = 60;
        int b = 13;
        System.out.println(GetIntBinaryString(a));
        System.out.println(GetIntBinaryString(b));
        //a = 0011 1100 - Binary representation of a
        //b = 0000 1101 - Binary representation of b
        int bitwiseAnd = a&b;
        int bitwiseOr = a|b;
        int bitwiseXor = a^b;
        int bitwiseCompliment = ~a;
        System.out.println(GetIntBinaryString(bitwiseAnd));
        System.out.println(GetIntBinaryString(bitwiseOr));
        System.out.println(GetIntBinaryString(bitwiseXor));
        System.out.println(GetIntBinaryString(bitwiseCompliment));

        //Left Shift
        System.out.println("*******************\n\tLeft Shift\n*******************");
        int value = 1242194743;
        System.out.format("\n%s = %s",
                GetIntBinaryString(value), value);
        for (int i = 0; i < 32; i++)
        {
            int shift = value << i;
            System.out.format("\n%s = %s",
                    GetIntBinaryString(shift), shift);
        }

        //Right Shift
        System.out.println("\n*******************\n\tRight Shift\n*******************");
        value = -1242194743;
        System.out.format("\n%s = %s",
                GetIntBinaryString(value), value);
        for (int i = 0; i < 32; i++)
        {
            int shift = value >> i;
            System.out.format("\n%s = %s",
                    GetIntBinaryString(shift), shift);
        }

        //Unsigned Right Shift
        System.out.println("\n*******************\n\tUnsigned Right Shift\n*******************");
        value = -1242194743;
        System.out.format("\n%s = %s",
                GetIntBinaryString(value), value);
        for (int i = 0; i < 32; i++)
        {
            int shift = value >>> i;
            System.out.format("\n%s = %s",
                    GetIntBinaryString(shift), shift);
        }

        //Expressions
        int number = 1 * 2 * 3;     //here the code on RHS of = is an expression
        boolean comparison = 1 > 2; //here the code on RHS of = is an expression
        System.out.println(Math.pow(2,3)); //here Math.pow(2,3) is an expression

        //Statements
        // assignment statement
        float aValue = 8933.234f;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement
        Child childObject = new Child();

        //Blocks
        boolean condition = true;
        if (condition) { // begin block 1
            System.out.println("Condition is true.");
        } // end block one
        else { // begin block 2
            System.out.println("Condition is false.");
        } // end block 2

        //Yu can also use block to define scope
        {
            int scopedValue = -255; //this variable is not accesible outside the block
        }
        //uncomment the below and it's a compilation error
        //System.out.println(scopedValue);
    }

    static String GetIntBinaryString(int n)
    {
        char[] b = new char[32];
        int pos = 31;
        int i = 0;

        while (i < 32)
        {
            if ((n & (1 << i)) != 0)
            {
                b[pos] = '1';
            }
            else
            {
                b[pos] = '0';
            }
            pos--;
            i++;
        }
        return new String(b);
    }
}

//Classes and interface for the Type Comparison Operator instanceof
interface MyInterface {}
class Parent {}
class Child extends Parent implements MyInterface {}