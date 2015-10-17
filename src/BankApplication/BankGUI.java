package BankApplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankGUI extends JFrame{
	
	private JButton addBTN, delete, update, clear;
	
	private JPanel btnPNL, radioPNL, inputPNL;
	
	private JTable list;
	
	private JList accounts;
	
	private JRadioButton checking, savings;
	
	/**JMenu Item that quits when selected*/
	private JMenuItem quitItem, loadBin, saveBin, loadText, saveText;
	private JMenuItem loadXML, saveXML;

	/**JMenu Item that starts new game*/
	private JMenuItem accountN, accountO, dateO;

	/**The File menu for the game*/
	private JMenu fileMenu;
	private JMenu sortMenu;

	/**Menu bar to set the items*/
	private JMenuBar menu;
	
	private JLabel[] label;
	
	public BankGUI(){
		setLayout(new BorderLayout());
		btnPNL = new JPanel(new GridLayout(4,1));
		radioPNL = new JPanel(new GridLayout(1,2));
		inputPNL = new JPanel();
		ButtonListener listener = new ButtonListener();
		
		addBTN = new JButton("Add");
		addBTN.addActionListener(listener);
		btnPNL.add(addBTN);
		
		delete = new JButton("Delete");
		delete.addActionListener(listener);
		btnPNL.add(delete);
		
		update = new JButton("Update");
		update.addActionListener(listener);
		btnPNL.add(update);
		
		clear = new JButton("Clear");
		clear.addActionListener(listener);
		btnPNL.add(clear);
		
		checking = new JRadioButton("Checkings");
		checking.addActionListener(listener);
		radioPNL.add(checking);
		
		savings = new JRadioButton("Savings");
		savings.addActionListener(listener);
		radioPNL.add(savings);
		radioPNL.setAlignmentX(CENTER_ALIGNMENT);
		
		ButtonGroup group = new ButtonGroup();
		group.add(checking);
		group.add(savings);
		
		String data[][] = {{"123", "9/10/15", "Sam", "$1,000.00"}};
		String column[] = {"Number", "Date Opened", "Account Owner", "Balance"};
		
		accounts = new JList();
		list = new JTable(data, column);
		list.setBounds(30,40,200,300);
		JScrollPane sp = new JScrollPane(list);
		JPanel p = new JPanel();
		p.add(Box.createRigidArea(new Dimension()));
		p.add(sp);
		p.add(Box.createRigidArea(new Dimension(10,10)));
		
		inputPNL.add(Box.createRigidArea(new Dimension(10,0)));
		inputPNL.add(labs());
		
		JPanel sets = new JPanel(new BorderLayout());
		sets.add(inputPNL, BorderLayout.CENTER);
		sets.add(btnPNL, BorderLayout.EAST);
		
		setJMenuBar(setupMenu());
		add(p, BorderLayout.NORTH);
		add(radioPNL, BorderLayout.CENTER);
		add(sets, BorderLayout.SOUTH);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
		}
	}
	
	private JPanel labs(){
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
	    c.gridy = GridBagConstraints.RELATIVE;
	    c.gridwidth = 1;
	    c.gridheight = 1;
	    c.insets = new Insets(2, 2, 2, 2);
	    c.anchor = GridBagConstraints.EAST;
	    
	    GridBagConstraints b = new GridBagConstraints();
	    b.gridx = 1;
	    b.gridy = GridBagConstraints.RELATIVE;
	    b.weightx = 1.0;
	    b.fill = GridBagConstraints.HORIZONTAL;
	    b.anchor = GridBagConstraints.CENTER;
	    
		label = new JLabel[7];
		label[0] = new JLabel("Account Number: ");
		label[1] = new JLabel("Account Owner: ");
		label[2] = new JLabel("Date Opened: ");
		label[3] = new JLabel("Account Balance: ");
		label[4] = new JLabel("Monthly Fee: ");
		label[5] = new JLabel("Interest Rate: ");
		label[6] = new JLabel("Minimum Balance: ");
		
		JTextField[] tInput = new JTextField[7];
		for (int i = 0; i < label.length; i++){
			tInput[i] = new JTextField(20);
			
			panel.add(label[i], c);
			label[i].setLabelFor(tInput[i]);
			panel.add(tInput[i], b);
		}
		
		return panel;
	}
	
	public JMenuBar setupMenu(){
		ButtonListener ml = new ButtonListener();
		menu = new JMenuBar();

		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menu.add(fileMenu);
		
		sortMenu = new JMenu("Sort");
		sortMenu.setMnemonic(KeyEvent.VK_F);
		menu.add(sortMenu);

		quitItem = new JMenuItem("Quit");
		quitItem.addActionListener(ml);

		loadBin = new JMenuItem("Load From Binary...");		
		saveBin = new JMenuItem("Save As Binary...");
		
		loadText = new JMenuItem("Load From Text...");
		saveText = new JMenuItem("Save As Text...");
		
		loadXML = new JMenuItem("Load From XML...");		
		saveXML = new JMenuItem("Save As XML...");

		loadBin.addActionListener(ml);
		saveBin.addActionListener(ml);
		loadText.addActionListener(ml);
		saveText.addActionListener(ml);
		loadXML.addActionListener(ml);
		saveXML.addActionListener(ml);
		
		fileMenu.add(loadBin);
		fileMenu.add(saveBin);
		fileMenu.addSeparator();
		fileMenu.add(loadText);
		fileMenu.add(saveText);
		fileMenu.addSeparator();
		fileMenu.add(loadXML);
		fileMenu.add(saveXML);
		fileMenu.addSeparator();
		fileMenu.add(quitItem);
		
		accountN = new JMenuItem("By Account Number");		
		accountO = new JMenuItem("By Account Owner");
		dateO = new JMenuItem("By Date Opened");		
		
		accountN.addActionListener(ml);
		accountO.addActionListener(ml);
		dateO.addActionListener(ml);
		
		sortMenu.add(accountN);
		sortMenu.add(accountO);
		sortMenu.add(dateO);

		return menu;
	}
}
