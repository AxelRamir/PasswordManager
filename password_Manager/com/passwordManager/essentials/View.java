package com.passwordManager.essentials;

import javax.swing.*;

public abstract class View extends JPanel{
	JPanel mainPanel = new JPanel();
	
	public View() {
		super();
	}
	
	public final JPanel getMainPanel() {
		return mainPanel;
	}
	public final void setMainPanel(JPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
}
