package fortuneCookies;

//import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Cookies
{
   ArrayList<String> cookieList = new ArrayList<String>();
   ArrayList<String> hxCookieList= new ArrayList<String>();


    // Constructor

    Cookies(String fileName)
    {
       // this.cookieList=cookieList;
       // String fileName=cookieFileName;


     cookieList=createList(fileName);
    }

    ArrayList createList(String fileName)
    {
        // Create structures and initialize
        boolean inMultiLineBuffer=false;
        BufferedReader reader=null;
        StringBuilder sbLine;
        StringBuilder sbMultiLineBuffer=new StringBuilder();
        String line=null;

       // Get cookie file and open it.
        try
        {
            String cookieFile=new String(fileName); // where the cookies are stored
         //   String cookieFile=new String("/Applications/FortuneCookies/CookieTest.txt"); // where the cookies are stored
            reader=new BufferedReader(new FileReader(fileName));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        // Now scan through the file
        while (true) // infinite loop
        {
            try
            {
                line=(reader.readLine());
                if (line == null) //eof or error
                    break; // Fall through List is complete or complete as it will be, so retun it.
                else if (line.isBlank())
                    continue;
                else if (line.charAt(line.length() - 1) == '\\') // line ends in backslash
                {
                    inMultiLineBuffer=true;
                    // amputate backslash
                    int end=line.length() - 1;
                    sbLine=new StringBuilder(line);
                    sbLine.deleteCharAt(end);

                    // add a carriage return
                    sbLine.append('\n');
                    // store in buffer until read in subsequent line
                    sbMultiLineBuffer.append(sbLine);
                    System.out.println(" sbMultiLineBuffer is: " + sbMultiLineBuffer);
                  //  System.out.println(sbMultiLineBuffer);
                    continue;
                }
                else // line ends in '\n' no backslash)
                {
                    // regular line
                    if (inMultiLineBuffer)
                    {
                        sbMultiLineBuffer.append(line); // add line to buffer
                        cookieList.add(sbMultiLineBuffer.toString());
                        sbMultiLineBuffer.append('\n'); // add buffer contents to cookieList
                        inMultiLineBuffer=false;
                        continue;
                    }
                    else // Single line, no need for buffer.
                        cookieList.add(line);

                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

   //     debugCookieList();
        return cookieList;
    }

/*** getters and setters***/
    protected ArrayList<String> getCookieList()
    {
        return cookieList;
    }

    protected String getRandomCookie()
    {
        Random rn=new Random();
        int newCookieNumber=rn.nextInt(cookieList.size());
        String newCookie = cookieList.get(newCookieNumber);
        cookieList.add(newCookie);
       return newCookie;

    }



/*** end getters and setters***/

/*** debugger***/
  void debugCookieList()
  {
      System.out.println("\nUsing for-each loop\n");
      for (String str : cookieList)
      {
          System.out.println(str);
      }

  }

}
