import java.util.Scanner;

public class PigLatinCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        // convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

//        String cat = "cat"; // "atcay"
//
//        String firstLetter = cat.substring(0, 1);
//
//        String wordMinusFirstLetter = cat.substring(1, cat.length());
//
//        String pigLatinWord = wordMinusFirstLetter + firstLetter + "ay";
//
//        System.out.println(pigLatinWord);

        System.out.println("Give me a sentence and I'll translate it to Pig Latin");

        String userInput = sc.nextLine();

        String[] arrOfString = userInput.split(" ");


        for(String var: arrOfString) {

            //COPIES FIRST LETTER OF STRING AND STORES IT

            String firstLetter = var.substring(0, 1);

            //COPIES EVERYTHING IN STRING BEGINNING SECOND LETTER

            String wordMinusFirstLetter = var.substring(1, var.length());

            //MAKES THE WORD INTO PIG LATIN

            String pigLatinString = wordMinusFirstLetter + firstLetter + "ay ";

//            System.out.println(pigLatinString);
            //-----------------------------------------------------------------------------

            //CHECK TO SEE IF WORDS HAVE PUNCTUATION

            //TURN TRANSLATED STRING BACK INTO ARRAY

            String[] pigLatinArray = pigLatinString.split(" ");

            for(String nextVar: pigLatinArray) {

                //Loop that checks each word and see if it has punctuation and then removes it

                System.out.print(nextVar + " ");

                if(nextVar.indexOf("?") >= 1) {
                    //Take out that character and place it at the end




                } //if


            } //for()

        }// for() outer





    } //main()

} //pigLatinCat Class
