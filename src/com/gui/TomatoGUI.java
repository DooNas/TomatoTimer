package com.gui;

import com.timer.Rest05;
import com.timer.Work25;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class TomatoGUI extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public TomatoGUI() {
		//Set
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 360);
		
		//JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Button(For 25minutes)
		JLabel Time25 = new JLabel("25:00");
		Time25.setBackground(Color.PINK);
		Time25.setFont(new Font("Gulim", Font.BOLD, 72));
		Time25.setBounds(24, 10, 207, 162);
		contentPane.add(Time25);	//Add into JPanel

		//Button(For 5minutes)
		JLabel Time5 = new JLabel("05:00");
		Time5.setFont(new Font("Gulim", Font.BOLD, 72));
		Time5.setBounds(296, 10, 207, 162);
		contentPane.add(Time5);	//Add into JPanel

		//Button(For 25minutes Start)
		JButton playBtn25 = new JButton("\uC7AC\uC0DD");
		playBtn25.setBounds(25, 149, 199, 23);
		contentPane.add(playBtn25);	//Add into JPanel

		JButton playBtn5 = new JButton("\uC7AC\uC0DD");
		playBtn5.setBounds(296, 149, 199, 23);
		playBtn5.setEnabled(false);
		contentPane.add(playBtn5);	//Add into JPanel
		//Interaction(For 25minutes)
		playBtn25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//new Worktimer(Time25, playBtn5).start();
				new Work25(Time25, playBtn5).start();
				playBtn25.setEnabled(false);
			}
		});
		//Interaction(For 5minutes)
		playBtn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//new Resttimer(Time5, playBtn25).start();
				new Rest05(Time5, playBtn25).start();
				playBtn5.setEnabled(false);
			}
		});

		//Button(For Check Sucess)
		JButton sucBtn = new JButton("\uC131\uACF5\uD588\uB294\uAC00?");
		sucBtn.setFont(new Font("Gulim", Font.BOLD, 27));
		sucBtn.setBounds(24, 213, 207, 87);
		contentPane.add(sucBtn);	//Add into JPanel

		//TextBox(For Check yesterday SucessCounts)
		JLabel ytdaySucctn = new JLabel("\uC5B4\uC81C \uC131\uACF5\uD69F\uC218 :");
		ytdaySucctn.setFont(new Font("Gulim", Font.BOLD, 19));
		ytdaySucctn.setBounds(252, 213, 141, 38);
		contentPane.add(ytdaySucctn);	//Add into JPanel

		//TextBox(For Check today SucessCounts)
		JLabel tdaySucctn = new JLabel("\uC624\uB298 \uC131\uACF5\uD69F\uC218 :");
		tdaySucctn.setFont(new Font("Gulim", Font.BOLD, 19));
		tdaySucctn.setBounds(252, 253, 141, 38);
		contentPane.add(tdaySucctn);	//Add into JPanel

		//TextBox(For Check yesterday SucessCounts)
		JLabel sucCtn1 = new JLabel("00");
		sucCtn1.setHorizontalAlignment(SwingConstants.CENTER);
		sucCtn1.setFont(new Font("Gulim", Font.BOLD, 19));
		sucCtn1.setBounds(406, 219, 64, 27);
		contentPane.add(sucCtn1);	//Add into JPanel

		//TextBox(For Check today SucessCounts)
		JLabel sucCtn2 = new JLabel("00");
		sucCtn2.setHorizontalAlignment(SwingConstants.CENTER);
		sucCtn2.setFont(new Font("Gulim", Font.BOLD, 19));
		sucCtn2.setBounds(406, 253, 64, 27);
		contentPane.add(sucCtn2);	//Add into JPanel
	}
}
