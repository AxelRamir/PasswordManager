package com.passwordManager.essentials;

import javax.swing.*;

public abstract class Frame extends JFrame{
	View view;
	Model model;
	Controller controller;
	
	public Frame() {
		super();
	}
	
	public final void setView(View view) {
		this.view = view;
	}
	public final void setModel(Model model) {
		this.model = model;
	}
	public final void setController(Controller controller) {
		this.controller = controller;
	}
	public final View getView() {
		return view;
	}
	public final Controller getController() {
		return controller;
	}
	public final Model getModel() {
		return model;
	}
	
	public final void updateView(JPanel view) {
		this.getContentPane().removeAll();
		this.getContentPane().add(view);
		this.validate();
	}
}
