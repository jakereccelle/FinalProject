
package savetest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class SaveTest extends JFrame implements ActionListener{
    
private JMenuItem saveAs;
 private JMenuBar main = new JMenuBar();
 private JMenu file = new JMenu("File");

	public SaveTest() {
            super("Save Button Test");
		setLayout(new FlowLayout());
        setSize(250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		saveAs = new JMenuItem("Save As...");
		saveAs.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				showSaveFileDialog();
			}
		});
		getContentPane().add(saveAs);
		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
                setJMenuBar(main);
                main.add(file);
                file.add(saveAs);
	}

	public static void main(String[] args) {
            SaveTest frame = new SaveTest();
        frame.setVisible(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { }

        SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new SaveTest();
			}
		});
	}

	private void showSaveFileDialog() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save");

		int userSelection = fileChooser.showSaveDialog(this);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToSave = fileChooser.getSelectedFile();
			System.out.println("Save as file: " + fileToSave.getAbsolutePath());
		}
	}
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
