package it.develhope.javadoc;

/**
 *
 * Class that contains methods
 *
 * @author Alessio
 *
 */
public class Wordgames {

    /**
     * Method that takes one parameter called word and returns the String "Hello [wordHere]".
     * @param word define the word
     * @return Hello + word
     */
    String addHelloWord(String word){

        return "Hello" + word;
    }


    /**
     * Method that takes two parameters called name and surname and returns their concatenation.
     * @param name define name
     * @param surname define surname
     * @return concatenation name and surname
     */
   String getFullName(String name, String surname ){
return name +" " +surname;
    }
}
