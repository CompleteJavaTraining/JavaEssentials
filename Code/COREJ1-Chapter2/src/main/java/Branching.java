public class Branching {

    public static void main(String[] args) {
        int[] arrayOfInts =
                { 32, 87, 3, 589,
                        12, 1076, 2000,
                        8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
        //This program searches for the number 12 in an array. The break statement,
        // terminates the for loop when that value is found. Control flow then transfers to the statement after the for loop.

        //labeled break statement:
        int[][] arrayOfIntsDouble = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int searchforNew = 2000;

        int l;
        int m = 0;
        foundIt = false;

        search:
        for (l = 0; i < arrayOfIntsDouble.length; l++) {
            for (m = 0; m < arrayOfIntsDouble[i].length;
                 m++) {
                if (arrayOfIntsDouble[l][m] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + l + ", " + m);
        } else {
            System.out.println(searchfor + " not in the array");
        }

        //continue statement example
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");

        //labeled continue statement
        String item = "Look for a substring in me";
        String substring = "sub";
        foundIt = false;

        max = item.length() -
                substring.length();

        test:
        for (i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (item.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");

        //return example
        int index = findNumber(589);
        numberPrinter(1076);
    }

    static int findNumber(int number){
        int[] arrayOfInts =
                { 32, 87, 3, 589,
                        12, 1076, 2000,
                        8, 622, 127 };
        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == number) {
                return i;
            }
        }
        return -1;
    }

    static void numberPrinter(int number){
        int[] arrayOfInts =
                { 32, 87, 3, 589,
                        12, 1076, 2000,
                        8, 622, 127 };
        int i;
        boolean foundIt = false;
        if(arrayOfInts.length<1)
            return;
        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == number) {
                System.out.format("\nFound at: %s", i);
                return;
            }
        }
        System.out.println("Not found!");
    }
}
