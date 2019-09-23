public class JavaStringBonus {
    public static void main(String[] args) {
//        ----BONUS 1
//
//        Create date format converter application.
//                Take in the following format:
//
//        MM/DD/YYYY
//
//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/01/1999
//        output - December 12, 1999
        System.out.println(formatDate("01/18/1991"));
//                ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants
//
//
//                ----BONUS 3
//
//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this)
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!


    } //main()

    public static String formatDate(String date) {

        String day = date.substring(3, 5);

        String year = date.substring(6);

        String month = date.substring(0, 2);

        if(month.equals("01")) {
            month = "January";
        } else if(month.equals("02")) {
            month = "February";
        } else if(month.equals("03")) {
            month = "March";
        } else if(month.equals("04")) {
            month = "April";
        } else if(month.equals("05")) {
            month = "May";
        } else if(month.equals("06")) {
            month = "June";
        } else if(month.equals("07")) {
            month = "July";
        } else if(month.equals("08")) {
            month = "August";
        } else if(month.equals("09")) {
            month = "September";
        } else if(month.equals("10")) {
            month = "October";
        } else if(month.equals("11")) {
            month = "November";
        } else if(month.equals("12")) {
            month = "December";
        }

        return month + " " + day + "," + year;
    }

} //JavaStringBonus
