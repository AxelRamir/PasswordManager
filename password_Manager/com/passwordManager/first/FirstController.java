package com.passwordManager.first;

import com.passwordManager.essentials.*;
import com.passwordManager.login.*;
import com.passwordManager.signup.*;

import java.awt.event.*;

public class FirstController extends Controller{
	
	public FirstController(Model model, View view) {
		super((FirstModel)model, (FirstView)view);
		addActionListeners();
	}
	
	@Override
	public void addActionListeners() {
		FirstView view = (FirstView) getView();
		view.getLoginButton().addActionListener(new EventHandler());
		view.getSignupButton().addActionListener(new EventHandler());
		
	}
	
	private class EventHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			
			//typecasting the view for functions
			FirstView v = (FirstView)getView();
			
			if(obj == v.getLoginButton()) {
				Model model = new LoginModel();
				View view = new LoginView();
				Controller controller = new LoginController(model, view);
				controller.setFrame(getFrame());
				
				getFrame().setModel(model);
				getFrame().setView(view);
				getFrame().setController(controller);
				getFrame().updateView(view.getMainPanel());
			}
			else if(obj == v.getSignupButton()) {
				Model model = new SignupModel();
				View view = new SignupView();
				Controller controller = new SignupController(model, view);
				controller.setFrame(getFrame());
				
				getFrame().setModel(model);
				getFrame().setView(view);
				getFrame().setController(controller);
				getFrame().updateView(view.getMainPanel());
			}
		}
		
	}
}
