public class ControlFlow {
    public static void main(String[] args) {

    }

    static  void DecisionMakingStatements(){

        //if-then example:
        int number = 10;
        if(number%2==0)
            System.out.println("The number is even number!");   //Notice that you can omit the braces if there is only one statement that want to execute in the branch.
        //OR
        if(number%2!=0)
        {
            System.out.println("The number is odd number!");
        }

        //if-then-else example
        number=15;
        if(number%2==0)
            System.out.println("The number is even!");
        else
            System.out.println("The number is odd!");
        float score = 86.45f;
        if(score>90.00f)
            System.out.println("Your grade is: A+");
        else if(score>85.00f)
            System.out.println("Your grade is: A");
        else if(score>75.00f)
            System.out.println("Your Grade is; B+");
        else if(score>70.00f)
            System.out.println("Your Grade is; B");
        else if(score>60.00f)
            System.out.println("Your Grade is; C+");
        else if(score>55.00f)
            System.out.println("Your Grade is; C");
        else if(score>45.00f)
            System.out.println("Your Grade is; D+");
        else if(score>40.00f)
            System.out.println("Your Grade is; D");
        else if(score>33.00f)
            System.out.println("Your Grade is; E");
        else
            System.out.println("Your Grade is: F");

        //switch example
        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);

        //switch fall-through example
        java.util.ArrayList<String> futureMonths =
                new java.util.ArrayList<String>();      //don't worry we will cover this later in the course - for now just understand that this is bag for collecting names.

        month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }
    }
}
