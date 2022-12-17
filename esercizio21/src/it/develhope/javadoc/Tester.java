package it.develhope.javadoc;

/**
 * Class that contains the main method for testing the Wordgames class
 * @author Alessio
 */
public class Tester {
    /**
     * Main method that creates a WordGames object and prints the result of the addHelloWord
     *
     * and getFullName method invocation
     *
     * @param args
     */
    public static void main(String[] args) {

        Wordgames wordgame = new Wordgames();

        wordgame.addHelloWord("Alessio");
        wordgame.getFullName("Alessio", "Lanzi");


        System.out.println(wordgame.addHelloWord(" Alessio"));
        System.out.println(wordgame.getFullName("Alessio", "Lanzi"));
    }
}
