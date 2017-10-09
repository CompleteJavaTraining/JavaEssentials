public class Loops {

    public static void main(String[] args) {
        //while example
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        //infinite loop using while
        /*
        while (true){
            // this statement will run forever
            System.out.println("I will keep running forever!");
        }
        */

        //do-while example
        count = 12;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        //for loop/statement example
        /*
        For loop syntax:
        for (initialization; termination;
            increment) {
                statement(s)
        }
        * */
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }

        //infinite for-loop
        /*
        for ( ; ; ) {

            // for-ever code here
            System.out.println("This is going to run forever");
        }
        * */

        //enhanced for loop
        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};     //more on arrays later
        //it is recommended to use this form of the for statement instead of the general form whenever possible.
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
        //using a traditional for loop on the above would be like:
        for(int i = 0; i<numbers.length; i++){
            System.out.println("Count is: " + numbers[i]);
        }
    }
}
