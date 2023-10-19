package com.passwordManager.first;

import com.passwordManager.essentials.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstView extends View{
	
	private JLabel title;
	private JButton loginButton;
	private JButton signupButton;
	
	public FirstView() {
		super();
		JPanel northPanel = new JPanel();
		JPanel centerPanel = new JPanel(null);
		JPanel southPanel = new JPanel();
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		title = new JLabel("Signup/Login");
		title.setFont(new Font("San Serif", Font.BOLD, 18));
		northPanel.add(title);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(150, 100, 100, 30);
		loginButton.setFont(new Font("San Serif", Font.BOLD, 17));
		
		signupButton = new JButton("Sign Up");
		signupButton.setBounds(150, 225, 100, 30);
		signupButton.setFont(new Font("San Serif", Font.BOLD, 17));
		
		centerPanel.add(loginButton);
		centerPanel.add(signupButton);
		
		mainPanel.add(northPanel, BorderLayout.NORTH);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		
		this.setMainPanel(mainPanel);
	}
	
	public JLabel getTitle() {
		return title;
	}
	public JButton getLoginButton() {
		return loginButton;
	}
	public JButton getSignupButton() {
		return signupButton;
	}
}
