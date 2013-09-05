package Start;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Start extends JPanel implements ActionListener{

	public Start()
	{
		JButton b1 = new JButton("Birth - 1997");
		b1.setVerticalTextPosition(AbstractButton.CENTER);
		b1.setActionCommand("1");
		b1.setEnabled(true);
		
		JButton b2 = new JButton("First Birthday - 1998");
		b2.setVerticalTextPosition(AbstractButton.CENTER);
		b2.setActionCommand("2");
		b2.setEnabled(true);
		
		JButton b3 = new JButton("Internship at CHS - 2007");
		b3.setVerticalTextPosition(AbstractButton.CENTER);
		b3.setActionCommand("3");
		b3.setEnabled(true);
		
		JButton b4 = new JButton("First Year At SMS (and last) - 2009");
		b4.setVerticalTextPosition(AbstractButton.CENTER);
		b4.setActionCommand("4");
		b4.setEnabled(true);
		
		JButton b5 = new JButton("Started Programming - 2009");
		b5.setVerticalTextPosition(AbstractButton.CENTER);
		b5.setActionCommand("5");
		b5.setEnabled(true);
		
		JButton b6 = new JButton("Started attending online school - 2010");
		b6.setVerticalTextPosition(AbstractButton.CENTER);
		b6.setActionCommand("6");
		b6.setEnabled(true);
		
		JButton b7 = new JButton("Beta tested Chromebook for Google - 2011");
		b7.setVerticalTextPosition(AbstractButton.CENTER);
		b7.setActionCommand("7");
		b7.setEnabled(true);
		
		JButton b8 = new JButton("Peleased First Application - 2011");
		b8.setVerticalTextPosition(AbstractButton.CENTER);
		b8.setActionCommand("8");
		b8.setEnabled(true);
		
		JButton b9 = new JButton("First year of CHS - 2012");
		b9.setVerticalTextPosition(AbstractButton.CENTER);
		b9.setActionCommand("9");
		b9.setEnabled(true);
		
		JButton b10 = new JButton("Grandfather died - 2013");
		b10.setVerticalTextPosition(AbstractButton.CENTER);
		b10.setActionCommand("10");
		b10.setEnabled(true);
		
		JButton b11 = new JButton("Started making user programs - 2013");
		b11.setVerticalTextPosition(AbstractButton.CENTER);
		b11.setActionCommand("11");
		b11.setEnabled(true);
		
		JButton b12 = new JButton("Graduation - 2016");
		b12.setVerticalTextPosition(AbstractButton.CENTER);
		b12.setActionCommand("12");
		b12.setEnabled(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String isString = e.getActionCommand();
		int ID = Integer.decode(isString);
		MakeDisplayGUI(ID);
	}

	public static JFrame MakeGUI()
	{
		System.out.println("Making GUI");
		JFrame mainFrame = new JFrame("William's Timeline");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Start buttons = new Start();
		buttons.setOpaque(true);
		buttons.setPreferredSize(new Dimension(440,220));
		mainFrame.setContentPane(buttons);
		mainFrame.pack();
		return mainFrame;
	}
	
	public static void MakeDisplayGUI(int ID)
	{
		String[] Info = getLayout(ID);
		System.out.println("Making GUI");
		JFrame mainFrame = new JFrame(Info[0]);
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JLabel emptyLabel = new JLabel("");
		emptyLabel.setPreferredSize(new Dimension(500,500));
		mainFrame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		mainFrame.getContentPane().add(new JLabel(convertToMultiline(Info[1])));
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	public static String convertToMultiline(String orig)
	{
	    return "<html> <body>" + orig.replaceAll("\n", "<br>") + "</body> </html>";
	}
	
	public static String[] getLayout(int id)
	{
		switch (id)
		{
		case 1: return new String[] {"Birth","1/29/1997 \n \n I was born on this day \n I was born by cesarean section in Kissimmee Florida"}; 
		//break;
		case 2: return new String[] {"First Birthday","1/29/1998 \n \n This was my first birthday \n apperently i ate the cake very carefully"}; 
		//break;
		case 3: return new String[] {"Internship at CHS","2007 \n \n I did an internship at CHS \n I internshiped for a week in the computer matinence class"};
		//break;
		case 4: return new String[] {"First Year Of SMS","2009 \n \nThis was my first year at Smith Middle School"}; 
		//break;
		case 5: return new String[] {"Started Programming","2009 \n \n I began programming small scripts on a linux machine"}; 
		//break;
		case 6: return new String[] {"Started going to online school","2010 \n \n I began going to an online charther school \n The school was called connections acadamy"}; 
		//break;
		case 7: return new String[] {"Started making math programs","2010 \n \nI began making math oriented programs \n Used them in math class"}; 
		//break;
		case 8: return new String[] {"Released first application","2011 \n \n I released a math oritened command line program \n called fastcal the program no longer works"}; 
		//break;
		case 9: return new String[] {"First year of CHS","2012 \n \n I began my first year of Cleburne High School \n this was also the first time in a physicall school in 2 years"}; 
		//break;
		case 10: return new String[] {"Grandfather died","2013 \n \n My grandfather dies due to a brain Hemorrhage while on blood thinners"}; 
		//break;
		case 11: return new String[] {"Started making programs with UIs","2012 \n \n i began making programs that have visual interfaces \n such as this one"}; 
		//break;
		case 12: return new String[] {"Graduation","2016 \n \n This sia future event"}; 
		//break;
		default: return new String[] {"Error","No Date \n \n An invalid option has been invoked"}; 
		//break;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Starting");
		JFrame Screen = MakeGUI();
		Screen.setVisible(true);
	}
	
}