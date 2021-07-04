package fortuneCookies;

import javax.swing.*;
import java.awt.*;
import java.nio.charset.Charset;

public class FCView extends JFrame
{
    private static JFrame frame;
    private final FortuneCookies doc;
    JTextPane textPane = new JTextPane();
    JTextPane hxCookiesPane= new JTextPane();
    private JScrollPane FCScrollPane=new JScrollPane(textPane);
    private JPanel contentPane=new JPanel();
    private FCView  view = null;
    JPanel buttonPanel;
 //   private static final long serialVersionUID=1L;
    JMenuBar menuBar;
    Charset charset=Charset.forName("UTF-8");


    //Constructor
    public FCView(FortuneCookies doc)
    {
        super("Fortune Cookies");
        this.view = view;
        this.doc = doc;




        System.setProperty("apple.laf.useScreenMenuBar", "true");
        // set the name of the application menu item
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Fortune Cookie Chooser");


// set the look and feel
        //
        setLayout(new BorderLayout());
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());
        contentPane.add(FCScrollPane,BorderLayout.CENTER);
       // FCScrollPane.add(textPane);



        // Set the frame to be wide and take up the top third of screen.
        // of the screen.
        int inset=100;
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(inset, inset, screenSize.width / 2 - inset,
                screenSize.height / 3 - inset);


      // Set up text pane
        Font font=new Font("Arial", Font.PLAIN, 18);
        textPane.setFont(font);
        textPane.setEditable(false);

        textPane.setText(doc.getRandomCookie());


        add(FCScrollPane, BorderLayout.CENTER);
        buttonPanel=new FCButtonPanel(doc,this);
        add(buttonPanel, BorderLayout.SOUTH);




           menuBar=new FCMenu(doc).createMenuBar();
           add(menuBar, BorderLayout.NORTH);

           // Set Up Previous cookies pane
        // Set up text pane
       // Font font=new Font("Arial", Font.PLAIN, 18);
       hxCookiesPane.setFont(font);
       hxCookiesPane.setEditable(false);



    } // constructor




    // Getters and Setters

    void setTextPane(String newQuote)
    {
        textPane.setText(newQuote);
    }

    void setHxCookiesPane()
    {

       remove(textPane);
       JTextPane hxCookiesPane= new JTextPane();
       hxCookiesPane.setText("69");
       add(hxCookiesPane);
       hxCookiesPane.setVisible(true);
       this.setVisible(true);

       // Now add button panel for moving among history cookies
        FCButtonPanel hxButtonsPanel =(FCButtonPanel) new JPanel();
        // add buttons
 ////       buttonPanel.setHxButtons(hxButtonsPanel);
        add(hxButtonsPanel);


    }


    protected void setHxAndButtonsPane()
    {
        // add the Panel

        // tell the buttons class to add buttons
    }


} // Class
