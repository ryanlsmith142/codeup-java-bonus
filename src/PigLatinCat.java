public class PigLatinCat {
    public static void main(String[] args) {
        // convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)
        String cat = "cat"; // "atcay"

        String firstLetter = cat.substring(0, 1);

        String wordMinusFirstLetter = cat.substring(1, cat.length());

        String pigLatinWord = wordMinusFirstLetter + firstLetter + "ay";

        System.out.println(pigLatinWord);




    }
}
