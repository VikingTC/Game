package com.dvt.gui;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	private MenuPanel menuPanel;
	private PlayGamePanel playGamePanel;

	public GameFrame() {
		menuPanel = new MenuPanel(this);
		playGamePanel = new PlayGamePanel(this);
		add(menuPanel);
		add(playGamePanel);
		setSize(600, 300);
		setLocationRelativeTo(null);
		setLayout(new CardLayout());
	}
}
