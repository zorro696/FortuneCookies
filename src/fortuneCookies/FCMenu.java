package fortuneCookies;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class FCMenu implements ActionListener
{
    static FortuneCookies doc;
    static FCView view;
    JMenuBar menuBar;


    FCMenu(FortuneCookies doc)
    {
        this.doc=doc;
        //this.view = view;

        menuBar=new JMenuBar();


        // Set up the lone menu.
        JMenu fileMenu=new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_D);
        menuBar.add(fileMenu);

        JMenuItem aboutMI=new JMenuItem("About This Program");
        aboutMI.setActionCommand("about");
        aboutMI.addActionListener(this);
        fileMenu.add(aboutMI);


        //fileMenu.add(aboutMI);
        JMenuItem fileNewMI=new JMenuItem("New  ⌘N");
        fileNewMI.setMnemonic(KeyEvent.VK_N);
        fileNewMI.setActionCommand("new");
        fileNewMI.addActionListener(this);
        fileMenu.add(fileNewMI);


        JMenuItem prefsMI=new JMenuItem("Preferences");
        aboutMI.setActionCommand("prefs");
        aboutMI.addActionListener(this);
        fileMenu.add(prefsMI);

        JMenuItem quitMI=new JMenuItem("Exit");
        quitMI=new JMenuItem("Quit  ⌘Q");
        quitMI.setMnemonic(KeyEvent.VK_Q);
        quitMI.setActionCommand("quit");
        quitMI.addActionListener(this);
        fileMenu.add(quitMI);


        JMenuItem helpMI=new JMenuItem("Help");
        menuBar.add(helpMI);

       // JMenuItem FCFileMI=new JMenuItem("Fortune Cookie Help Files");
        helpMI.setActionCommand("help");
        helpMI.addActionListener(this);
        menuBar.add(helpMI);


    }

    // React to menu selections.
    public void actionPerformed(ActionEvent e)
    {
        if ("new".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,
                    "Reached New MI",
                    "Good Job",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if ("quit".equals(e.getActionCommand()))
        {
            System.exit(1);
        }
        else if ("about".equals(e.getActionCommand()))
        {
            String text="This program produces a signature and chooses a random quote appended below it. This " +
                                "string is added to the system clipboard. Users need only place the cursor on in the text of the " +
                                "email " + "and insert the signture.\nWritten by Mark White, mark@markewhite.com\n" +
                                "\nSpecial Thanks to Install4J for use of their excellent installer.\n" +
                                "Fortune Cookies is distributed under the GNU Public License. Code is on GitHub at https://github.com/markewhite/FortuneCookies";

        //  final JOptionPane = new JOptionPane(text, "Fortune Cookie Chooser.", JOptionPane
          //                                                                               .PLAIN_MESSAGE, null);

        }
        else if ("help".equals(e.getActionCommand()))
        {
           // JOptionPane.showMessageDialog(null, doc.helpMessage(), "Help Window", JOptionPane.QUESTION_MESSAGE, null);

          //For some reason, can't display JOptionPane.QUESTION_MESSAGE icon. Error message works fine. Displays generic Java icon. Must be bug.
            JOptionPane.showMessageDialog(null,doc.helpMessage(), "FortuneCookies Help", JOptionPane.QUESTION_MESSAGE);

         /*   final JOptionPane optionPane = new JOptionPane(
                    "The only way to close this dialog is by\n"
                            + "pressing one of the following buttons.\n"
                            + "Do you understand?",
                    JOptionPane.QUESTION_MESSAGE,
                    JOptionPane.YES_NO_OPTION);
*/
        }

    }



    public JMenuBar createMenuBar()
    {
        return menuBar;
    }

}
