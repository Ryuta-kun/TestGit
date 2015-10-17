package BankApplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankGUI extends JFrame{
	private JButton addBTN;
	private JButton delete;
	private JButton update;
	private JButton clear;
	private JPanel btnPNL;
	
	public BankGUI(){
		btnPNL = new JPanel(new GridLayout(4,1));
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
		
		add(btnPNL);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
		}
	}
}
