package fortuneCookies;

import javax.swing.*;
import java.util.ArrayList;

/**
 * The document class
 */
public class FortuneCookies
{


    //   private ArrayList<String> cookieList = null; //=new ArrayList<String>();
    // works  private String fin = new String("/Applications/FortuneFortuneCookies/FortuneFortuneCookies.txt");

    private Cookies cookies = null;


    private static JFrame frame;
    private static FCView view;
    private JScrollPane FCScrollPane=null;
    private static FortuneCookies doc=null;

    //debugger
    private final String fileName = new String("/Applications/FortuneCookies/CookieTest.txt");
    // real coookie file
    //private final String fileName = new String("/Applications/FortuneCookies/FortuneCookies.txt");



    FortuneCookies()
    {
        doc=this;
        cookies=new Cookies(fileName);
        //Cookies list;
    //  cookies=new Cookies(cookieFile);
        // cookieList = ((fortuneCookies.Cookies) Cookies).getCookieList();
        //   cookieList = Cookies.getCookieList();

        String currentCookie=cookies.getRandomCookie();


    } // constructor


    private static void createAndShowGUI()
    {

        // Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create and set up the window.
        // view will put random cookie into textPane.
        frame=new FCView(doc);
        view = (FCView)frame;

        // Start by displaying new random cookie in textPane
        // view.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Display the window.
        frame.setVisible(true);
        //    getFrame();




    }


    public static void main(String[] args)
    {
        FortuneCookies FortuneCookies=new FortuneCookies();
        // System.out.println("main speaks");
        //  FCView view = new FCView();

        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });


    }



    /**
     * Stores help information. Called by the view
     *
     * @return
     */
    String helpMessage()
    {


        String helpMessage=new String(
                "When you choose \"Copy\", the program copies your signature and quote to the system clipboard. \n" +
                        "Go to your email and press Command/Control-V to insert it.\n\n\n" +
                        "Your Fortune Cookie Files should be in the /Applications/FortuneCookies directory. " +
                        "The file name is FortuneCookies.txt.\n It contains the quotes to be added to your email signature.\n If fhe file isn't " +
                        "there, you make one in any word processor that can save text files (filename" +
                        ".txt)" +
                        "\n\nQuotes are separated by blank lines.\n" +

                        "Single Line Quote looks like this int the text file:\n\t\t\nMiracles are not contrary to nature, but only contrary to what we know about nature.— St. Augustine\n\n" +
                        "For quotes that run over 1 line, such a poetry, end each line with a backslash (\\)\n"+
                        "The blackslash tells the computer to ignore any special character that follows it, like a cariage return (\\n)\n" +
                        "Multiple Line Quote looks like this in the FortuneCookies.txt file:\n\t\tThe opposite of love is not hate, it's indifference.\\\n\t\tThe opposite of art is" +
                        "not" + "ugliness, it's indifference.\\\n\t\tThe opposite of faith is not heresy, it's " +
                        "indifference.\\\n" +
                        "\t\tAnd the opposite of life is not death, it's indifference.— Elie Wiesel\n\n" +
                        "Another of my favorite quotes is: If you want your children to be brilliant, read them fairy tales. If you want " +
                        "them to be geniuses, read them more fairy tales.—Albert Einstein\n\n\n" +
                        "Your signature is in /Applications/FortuneCookies/Signatures.txt.\n" +
                        "You need to edit to show your signature. For instance: \nMark White\nProgrammer\nphone number 123-456-789\n  " +
                        "\n\nThe program will read this, add the quote beneath it, and copy it to the system clipboard, so you can insert it in your email by pressing Command/Control V."
        );

        return helpMessage;

    }


    // Getters and Setters

    FortuneCookies getDoc()
    {
        return this;
    }

    String getRandomCookie()
    {
        String newCookie = cookies.getRandomCookie();
        // Add to history list
   //     cookies.hxCookieList.add(newCookie);
        return newCookie;

    }

   Cookies getCookies()
    {
        return cookies;
    }

/*
    protected void setHxCookiesPane()
    {
        view.setHxCookiesPane();
    }
*/
    protected ArrayList<String> getHxCookieList()
    {
        return cookies.hxCookieList = new ArrayList<String>();
    }

}

  // End of FortuneCookies Class













