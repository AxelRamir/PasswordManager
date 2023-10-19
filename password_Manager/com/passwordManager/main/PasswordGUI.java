package com.passwordManager.main;

import com.passwordManager.essentials.*;
import com.passwordManager.first.*;

public class PasswordGUI extends Frame{
	
	public PasswordGUI() {
		super();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Password Manager");
		
		Model model = new FirstModel();
		View view = new FirstView();
		Controller controller = new FirstController(model, view);
		controller.setFrame(this);
		
		this.add(view.getMainPanel());
		this.setSize(400, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new PasswordGUI();
	}
}
