import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// add sýrasý: drop down panels -> card layout panel -> entire panel -> jframe
public class CardLayoutExample extends JFrame implements ItemListener
// internal frame yok
{
	JPanel panelCards = null;
//	instance variable might be used by 
//	every method of CardLayoutExample class
	private final String CARD_ONE = "Card One";
	private final String CARD_TWO = "Card Two";
//	with constants we guarantee there would be no mistake
//	spelling the variables later on
	
	public CardLayoutExample()
	{
		JPanel jp = new JPanel();
		
		String[] cardDetails = new String[2];
		cardDetails[0] = CARD_ONE;
		cardDetails[1] = CARD_TWO;
		JComboBox jcb = new JComboBox(cardDetails);
//		allows us to have drop down list of cardDetails array
		jcb.setEditable(false);
//		adds item listener into this entire form
//		so when JComboBox is toggled, it will fire on this form 
//		and form will handle that based on what
//		we are doing in itemStateChanged event handler
//		(through implemented ItemListener)
		jcb.addItemListener(this);
		jp.add(jcb);
//		drop-down list added to the panel
		
		// creating multiple panels to toggle between them
		JPanel c1 = new JPanel();
		c1.add(new JButton("Press Me"));
		c1.add(new JTextField("Some Text Here"));
		
		JPanel c2 = new JPanel();
		c2.add(new JLabel("Enter your name: "));
		c2.add(new JButton("Press me Instead"));
		
		panelCards = new JPanel(new CardLayout());
//		we can use cardlayout for tabs as well
//		if we want to make tabbed panels we can change the 
//		cardlayout into tab panel layout
		panelCards.add(c1, CARD_ONE);
		panelCards.add(c2, CARD_TWO);
//		we add multiple panels to card layout to toggle between them
		
		jp.add(panelCards);
//		we add card layout (drop down deðil) to the entire panel
		
//		we add panel to the jframe
		this.getContentPane().add(jp);
		this.setLocation(250,250);
		this.setSize(GUIProgram.width+20,GUIProgram.height+60);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Card Layout");
		this.setBounds(0, 0, GUIProgram.width+20,GUIProgram.height+60);
		this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
//		we get a new card layout from our panelCards.getLayout
//		and we use that to show specific card panel
//		based on the argument passed in (arg0)
//		kýsacasý dropdown ile panel arasýndaki senkronizasyonu saðlýyor
		CardLayout cl = (CardLayout)(panelCards.getLayout());
        cl.show(panelCards, (String)arg0.getItem());
	}
}
