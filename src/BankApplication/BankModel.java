package BankApplication;

import java.util.*;

import javax.swing.*;

public class BankModel extends AbstractListModel {
	private ArrayList<Account> acts;

	public BankModel(){
		acts = new ArrayList<Account>();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return acts.size();
	}

	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		return acts.get(index);
	}

	public void add(Account other){
		if(other instanceof CheckingAccount){
			acts.add(other);
		}
		if(other instanceof SavingsAccount){
			acts.add(other);
		}
	}

	public void delete(int index){
		acts.remove(index);
	}
}
