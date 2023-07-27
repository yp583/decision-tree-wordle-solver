import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class AIWordlePlayer extends WordlePlayer
{
    ArrayList<String> allowedGuesses;
    char[][] yellow;
    char[] green;
    String grey;

    public AIWordlePlayer()
    {
        allowedGuesses = new ArrayList<String>();
        try
        {
            //load the words for guesses from text files
            //dont cheat and also load the answers
            Scanner s = new Scanner(new File("wordleWords.txt"));
            while (s.hasNext())
            {
                String word = s.nextLine();
                allowedGuesses.add(word);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    private int getScore(String word){
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (grey.indexOf(chars[i]) >= 0)
        }
    }
    public String getGuess(int [] previousResults, int guessesRemaining)
    {
        String guess = "";
        int maxScore = 0;
        for (int i = 0; i < allowedGuesses.size(); i++) {
            score = allowedGuesses.size
        }


        return guess;
    }

}