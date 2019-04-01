
package githubfinalproject;

/**
 *
 * @author mt13
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GithubFinalProject extends JFrame implements ActionListener
{
    Container con = getContentPane();
    JLabel word = new JLabel("Output: Word in question"); //placeholder to get results
    JLabel definition = new JLabel("Output: Definition"); //placeholder to get results
    JButton prev = new JButton("< Previous");
    JButton flip = new JButton("Flip");
    JButton next = new JButton("Next >");
    GridBagLayout layout = new GridBagLayout();

    GithubFinalProject()
    {
        con.setLayout(layout);
        con.add(word);
        
        con.add(prev);
        con.add(flip);
        con.add(next);
        //action liseners for actions....
        prev.addActionListener(this);
        flip.addActionListener(this);
        next.addActionListener(this);
        //harder, daddy
        
        //setSize for setting size... size
        setSize(450, 250);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        
        if(source == prev)
            System.out.println(""); //placeholder, so it doesnt error
        else if(source == flip)
            System.out.println(""); //placeholder, so it doesnt error
        else if(source == next)
            System.out.println(""); //placeholder, so it doesnt error
        
    }
    
    public static void main(String[] args) 
    {
        GithubFinalProject frame = new GithubFinalProject();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    
}
