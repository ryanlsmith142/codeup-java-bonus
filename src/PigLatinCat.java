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
            String firstLetter = var.substring(0, 1);

            String wordMinusFirstLetter = var.substring(1, var.length());

            String pigLatinString = wordMinusFirstLetter + firstLetter + "ay ";

            System.out.print(pigLatinString);

        }



    }
}
