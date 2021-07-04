package fortuneCookies;
      import javax.swing.*;
      import java.util.ArrayList;

/**
 * Shows viewed cookies
 */
public class HxPanel extends JPanel
{

    private Cookies cookies;

  //  private static JFrame frame;
    private JScrollPane FCScrollPane=null;
    private static FortuneCookies doc=null;
    private ArrayList<String> hxCookieList= new ArrayList<String>();


    HxPanel(FortuneCookies doc)
    {
        this.doc=doc;
        cookies = doc.getCookies();
        hxCookieList= doc.getHxCookieList();
        // cookieList = ((fortuneCookies.Cookies) Cookies).getCookieList();
        //   cookieList = Cookies.getCookieList();



    } // constructor




} // End of HxPanel Class














