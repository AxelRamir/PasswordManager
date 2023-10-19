package com.passwordManager.essentials;

public abstract class Controller {
	private Model model;
	private View view;
	private Frame frame;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public abstract void addActionListeners();
	
	
	//getters
	public Model getModel() {
		return model;
	}
	public View getView() {
		return view;
	}
	public Frame getFrame() {
		return frame;
	}
	
	//setters
	public void setModel(Model model) {
		this.model = model;
	}
	public void setView(View view) {
		this.view = view;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
}