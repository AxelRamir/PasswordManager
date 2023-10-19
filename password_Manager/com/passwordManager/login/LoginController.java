package com.passwordManager.login;

import java.awt.event.*;

import com.passwordManager.dataClasses.*;
import com.passwordManager.essentials.*;
import com.passwordManager.first.*;

public class LoginController extends Controller{
	public LoginController(Model model, View view) {
		super((LoginModel) model, (LoginView) view);
		addActionListeners();
	}

	@Override
	public void addActionListeners() {
		// TODO Auto-generated method stub
		LoginView view = (LoginView) getView();
		view.getLoginButton().addActionListener(new EventHandler());
		view.getBackButton().addActionListener(new EventHandler());
		
	}
	
	private class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object obj = e.getSource();
			LoginView v = (LoginView) getView();
			if(obj == v.getLoginButton()) {
				//Setting view and model
				LoginView view = (LoginView) getView();
				LoginModel model = (LoginModel) getModel();
				
				//clear error messages
				view.getEmailError().setText("");
				view.getPasswordError().setText("");
				
				//setting email and password
				Email email = new Email(view.getEmailTxt().getText());
				Password password = new Password(view.getPasswordTxt().getText());
				boolean validEmail = email.isValid();
				boolean validPassword = password.isValid();
				if(!validEmail) {
					view.getEmailError().setText(email.getErrorMessage());
				}
				if(!validPassword) {
					view.getPasswordError().setText(password.getErrorMessage());
				}
			}
			else if(obj == v.getBackButton()) {
				FirstModel model = new FirstModel();
				FirstView view = new FirstView();
				FirstController controller = new FirstController(model, view);
				controller.setFrame(getFrame());
				
				getFrame().setModel(model);
				getFrame().setView(view);
				getFrame().setController(controller);
				getFrame().updateView(view.getMainPanel());
			}
		}
		
	}
}
