package DifficultChallenges;

/**
 * @author Travis Lewis
 * Date: 11 May 2012
 * Challenge #50
 * 
 * T9 Spelling: The Latin alphabet contains 26 characters and telephones only 
 * have ten digits on the keypad. We would like to make it easier to write a 
 * message to your friend using a sequence of keypresses to indicate the 
 * desired characters. The letters are mapped onto the digits as 2=ABC, 3=DEF, 
 * 4=GHI, 5=JKL, 6=MNO, 7=PQRS, 8=TUV, 9=WXYZ. To insert the character B for 
 * instance, the program would press 22. In order to insert two characters in 
 * sequence from the same key, the user must pause before pressing the key a 
 * second time. The space character should be printed to indicate a pause. For 
 * example “2 2″ indicates AA whereas “22″ indicates B. Each message will 
 * consist of only lowercase characters a-z and space characters. Pressing 
 * zero emits a space. For instance, the message “hi” is encoded as “44 444″, 
 * “yes” is encoded as “999337777″, “foo  bar” (note two spaces) is encoded as 
 * “333666 6660022 2777″, and “hello world” is encoded as 
 * “4433555 555666096667775553″.
 */
public class T9Spelling 
{
    public static String convertToT9(final String input)
    {
        final String[] letters = {"","","ABC","DEF","GHI","JKL","MNO",
            "PQRS","TUV","WXYZ"};
        
        String result = "";
        final char[] line = input.toUpperCase().toCharArray();
        int position, lastnum = -1;
        
        for(int i = 0 ; i < line.length ; i++)
        {
            if(line[i] == ' ')
            {
                result += "0";
                lastnum = 0;
            }
            else
            {
                for(int j = 2 ; j < letters.length ; j++)
                {
                    position = letters[j].indexOf(String.valueOf(line[i]));
                    if(position >= 0)
                    {
                       if(lastnum == j)
                           result += " ";
                       for(int k = 0 ; k < position + 1 ; k++)
                           result += String.valueOf(j);
                       lastnum = j;
                       break;
                    }
                }//for each string in letters
            }
        }//for each input character
        return result;
    }
}
