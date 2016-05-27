package raceManagerSystem;

import java.awt.EventQueue;

public class GUIProgram 
{

	public static void main(String[] args0)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RaceManager frame = new RaceManager();
//					launches our race manager
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
