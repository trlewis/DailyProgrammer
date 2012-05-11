package IntermediateChallenges;

import java.io.File;

/**
 * @author Travis Lewis
 * Date: 10 May 2012
 * Challenge #50
 * 
 * Given an absolute path, write a program that outputs an ASCII tree of 
 * that directory.
 * 
 * Note: 'tree' utility is not allowed.
 * Extra credit: Limit the depth of the tree by variable n.
 */
public class ASCIIDirectory 
{
    public static String printDirectory(final String path, final int depth) 
    {
        String result = "";
        File[] list = (new File(path)).listFiles();
        
        for(int i = 0 ; i < list.length ; i++)
        {
            for(int j = 0 ; j < depth ; j++)
                result += "    ";
            result += "+-";
            
            if(list[i].isDirectory())
                result += list[i].getName() + "/\n" +
                        printDirectory(list[i].getAbsolutePath(), depth+1);
            else
                result += list[i].getName() + "\n";
        }
        return result;
    }
    
}
