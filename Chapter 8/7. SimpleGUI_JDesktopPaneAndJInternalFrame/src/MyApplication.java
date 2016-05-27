import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

// add sýrasý:
// menu item -> menu -> menu bar -> (set to) jframe
// button -> panel -> jinternalframe (getContentPane class) -> JDesktopPane -> jframe (getContentPane class)
public class MyApplication extends JFrame
// JFramei extend etmesi önemli
{

	private JDesktopPane dp;
	private JInternalFrame jif1;
	private JInternalFrame jif2;
	
	public MyApplication()
	{

		dp = new JDesktopPane();
		this.getContentPane().add(dp);
//		we are adding the desktoppane to the jframe (external one)
		
//		menubar gives us options that we can use to toggle 
		JMenuBar jmb = new JMenuBar();
		this.setJMenuBar(jmb);
//		menubar is set to the frame
		
		JMenu mnuFile = new JMenu("File");
		jmb.add(mnuFile);
//		file menu added to menubar
		
		//add an exit item with no frame under file menu
		JMenuItem mnuItemExit = new JMenuItem("Exit");
//		we add an actionlistener to our menu item
//		so that when we click on a menu item we can have response to it
		mnuItemExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //exit
                int close = JOptionPane.showConfirmDialog(null
                                , "Are you sure you want to exit?"
                                , "End Application?"
                                , JOptionPane.YES_NO_OPTION
                                , JOptionPane.INFORMATION_MESSAGE);
                if (close == 1) return;
//                if answer is no, return to menu
                System.exit(0);
            }
        });
		mnuFile.add(mnuItemExit);
//		exit menu item is added to the file menu
//		which is already added to the menu bar
		
		/// Internal Frames ///
		JMenu mnitemIFs = new JMenu("Internal Frames");
        jmb.add(mnitemIFs);
//        Internal Frames menu is added to the menu bar
        
        //add the two menu items (frame one and frame two)
//        which will launch the entire frame when clicked
        JMenuItem mnuJIFOne = new JMenuItem("Frame One");
        mnuJIFOne.addActionListener(new ActionListener()
        {

			public void actionPerformed(ActionEvent arg0) {
				jif1 = new InternalFrameOne(); // constructor initialized
				jif1.setBounds(0, 0, GUIProgram.width, GUIProgram.height);
				dp.add(jif1);
//				we are adding internal frames to JDesktopPane manager
			}
        	
        });
        mnitemIFs.add(mnuJIFOne);
//        menu item is added to menu 
        
        JMenuItem mnuJIFTwo = new JMenuItem("Frame Two");
        mnuJIFTwo.addActionListener(new ActionListener()
        {

			public void actionPerformed(ActionEvent arg0) {
				jif2 = new InternalFrameTwo();
				jif2.setBounds(0, 0, GUIProgram.width, GUIProgram.height);
				dp.add(jif2);
			}
        	
        });
        mnitemIFs.add(mnuJIFTwo);
	}
}
