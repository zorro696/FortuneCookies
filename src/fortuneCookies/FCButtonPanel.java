package fortuneCookies;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FCButtonPanel extends JPanel
{
    private final JPanel quotePanel = new JPanel();
    private static JTextPane hxPanel = new JTextPane();
    private FortuneCookies doc = null;
    FCView view = null;

    FCButtonPanel(FortuneCookies doc, FCView view)
    {
       this.doc = doc;
        this.view = view;
        setLayout(new BorderLayout());


        // Put button panel on bottom. Don't add fcEditPanel unless we need it.
        add(quotePanel, BorderLayout.SOUTH);
////        add(hxPanel, BorderLayout.CENTER);
     //   add(editPanel, BorderLayout.NORTH);

        quotePanel.setVisible(true);
 //       previousCookiesPanel.setVisible(true);
 ///      hxPanel.setVisible(true);
        // hide editPanel until user asks for it
     //   editPanel.setVisible(false);





        // Create and add Quote buttons
        JButton buttonCopy=new JButton("Copy");
        buttonCopy.setToolTipText("Copy the quote to the system clipboard. You can then paste it into your email.");

        buttonCopy.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onCopy();
            }
        });
        quotePanel.add(buttonCopy);



        JButton buttonNew=new JButton("New");
        buttonNew.setToolTipText("Show a new, randomly-chosen, quote.");

        buttonNew.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onNew();
            }
        });
        quotePanel.add(buttonNew);





   /*     JButton previousButton = new JButton("➡︎");
   previousButton.setFont(new Font(null, Font.PLAIN, 18));*/
        JButton Button = new JButton("Go Back");

        Button.setToolTipText("See the last quotes you viewed.");
        Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //  System.out.println("Pressed previousButton.");
                onGoBack();
                // doc.fcQuit();
            }
        });
        quotePanel.add(Button);

        JButton quitButton = new JButton("Quit");
        quitButton.setToolTipText("Quit the program.");
        quitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //  out.println("Pressed quoteQuit.");
                onQuit();
            }
        });
        quotePanel.add(quitButton);



    }

    void setHxButtons(JPanel hxButtonsPanel)
    {
        JButton backButton = new JButton("Back");
        hxButtonsPanel.add(backButton);
        JButton forwadbutton = new JButton("Forward");
        hxButtonsPanel.add(forwadbutton);

    }

    private void onNew()
    {
        String newCookie = doc.getRandomCookie();

        view.setTextPane(newCookie);

        // the System clipboard as needed.
        // fc.textPane.setText(nextCookie);
    }

    void onCopy()
    {
        //fc.copyCookieToClipboard();

    }



    void onQuit()
    {
       // out.println("in OnQuit.");
        System.exit(1);
    }

    void onGoBack()
    {
  ////      hxPanel = view.setHxCookiesPanel();


    }

    void onNextQuote()
    {
        ///fc.getNextQuote();
    }


}
