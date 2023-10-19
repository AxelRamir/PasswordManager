package com.passwordManager.signup;

import java.awt.event.*;

import com.passwordManager.essentials.*;
import com.passwordManager.first.*;

public class SignupController extends Controller{
	
	public SignupController(Model model, View view) {
		super((SignupModel)model, (SignupView)view);
		addActionListeners();
	}

	@Override
	public void addActionListeners() {
		// TODO Auto-generated method stub
		SignupView view = (SignupView) getView();
		view.getSignupButton().addActionListener(new EventHandler());
		view.getBackButton().addActionListener(new EventHandler());
	}
	
	private class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			SignupView v = (SignupView)getView();
			if(obj == v.getSignupButton()) {
				System.out.println("Signup button was pressed");
			}
			else if(obj == v.getBackButton()) {
				FirstView view = new FirstView();
				FirstModel model = new FirstModel();
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
