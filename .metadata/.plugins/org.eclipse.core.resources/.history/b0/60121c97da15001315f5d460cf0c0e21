package Start;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Start {

	public static JFrame MakeGUI()
	{
		System.out.println("Making GUI");
		JFrame mainFrame = new JFrame("William's Timeline");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel emptyLabel = new JLabel("");
		emptyLabel.setPreferredSize(new Dimension(568, 100));
		mainFrame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		mainFrame.pack();
		return mainFrame;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Starting");
		JFrame Screen = MakeGUI();
		Screen.setVisible(true);
	}
	
}
