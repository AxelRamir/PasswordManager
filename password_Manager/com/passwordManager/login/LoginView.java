package com.passwordManager.login;

import java.awt.*;
import javax.swing.*;
import com.passwordManager.essentials.*;

public class LoginView extends View{
	private JLabel title;
	private JLabel emailLabel;
	private JTextField emailTxt;
	private JLabel emailError;
	private JLabel passwordLabel;
	private JTextField passwordTxt; 
	private JLabel passwordError;
	private JButton loginButton;
	private JButton backButton;
	
	public LoginView() {
		super();
		JPanel northPanel = new JPanel();
		JPanel centerPanel = new JPanel(null);
		JPanel southPanel = new JPanel();
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		title = new JLabel("Login");
		title.setFont(new Font("San Serif", Font.BOLD, 18));
		northPanel.add(title);
		
		emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("San Serif", Font.BOLD, 16));
		emailLabel.setBounds(175, 55, 50, 20);
		emailLabel.setHorizontalAlignment(getWidth());
		emailTxt = new JTextField();
		emailTxt.setFont(new Font("San Serif", Font.PLAIN, 13));
		emailTxt.setBounds(100, 80, 200, 25);
		emailError = new JLabel("");
		emailError.setFont(new Font("San Serif", Font.PLAIN, 12));
		emailError.setForeground(Color.RED);
		emailError.setBounds(100, 105, 200, 25);
		emailError.setHorizontalAlignment(getWidth());
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("San Serif", Font.BOLD, 16));
		passwordLabel.setBounds(162, 180, 76, 20);
		passwordLabel.setHorizontalAlignment(getWidth());
		passwordTxt = new JTextField();
		passwordTxt.setFont(new Font("San Serif", Font.PLAIN, 13));
		passwordTxt.setBounds(100, 205, 200, 25);
		passwordError = new JLabel("");
		passwordError.setFont(new Font("San Serif", Font.PLAIN, 12));
		passwordError.setForeground(Color.RED);
		passwordError.setBounds(100, 230, 200, 25);
		passwordError.setHorizontalAlignment(getWidth());
		
		loginButton = new JButton("Login");
		loginButton.setFont(new Font("San Serif", Font.BOLD, 17));
		loginButton.setBounds(150, 300, 100, 25);
		backButton = new JButton("Back");
		backButton.setFont(new Font("San Serif", Font.BOLD, 17));
		backButton.setBounds(150, 370, 100, 25);
		
		centerPanel.add(emailLabel);
		centerPanel.add(emailTxt);
		centerPanel.add(emailError);
		centerPanel.add(passwordLabel);
		centerPanel.add(passwordTxt);
		centerPanel.add(passwordError);
		centerPanel.add(loginButton);
		centerPanel.add(backButton);
		
		mainPanel.add(northPanel, BorderLayout.NORTH);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		
		this.setMainPanel(mainPanel);
	}
	
	public JLabel getTitle() {
		return title;
	}
	public JLabel getEmailLabel() {
		return emailLabel;
	}
	public JTextField getEmailTxt() {
		return emailTxt;
	}
	public JLabel getEmailError() {
		return emailError;
	}
	public JLabel getPasswordLabel() {
		return passwordLabel;
	}
	public JTextField getPasswordTxt() {
		return passwordTxt;
	}
	public JLabel getPasswordError() {
		return passwordError;
	}
	public JButton getLoginButton() {
		return loginButton;
	}
	public JButton getBackButton() {
		return backButton;
	}
}
