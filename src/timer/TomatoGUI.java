package timer;

import test.timer;

import java.awt.EventQueue;

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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TomatoGUI frame = new TomatoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TomatoGUI() {
		//�����̳� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 360);
		
		//�г� ����
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	//�г� ���̾ƿ� ����
		
		//�ۻ��� ����(25��)
		JLabel Time25 = new JLabel("25:00");
		Time25.setBackground(Color.PINK);
		Time25.setFont(new Font("����", Font.BOLD, 72));
		Time25.setBounds(24, 10, 207, 162);
		contentPane.add(Time25);	//�гο� �߰�

		//�ۻ��� ����(5��)
		JLabel Time5 = new JLabel("05:00");
		Time5.setFont(new Font("����", Font.BOLD, 72));
		Time5.setBounds(296, 10, 207, 162);
		contentPane.add(Time5);	//�гο� �߰�

		//��ư ����(25�� ����)
		JButton playBtn25 = new JButton("\uC7AC\uC0DD");
		playBtn25.setBounds(25, 149, 97, 23);
		contentPane.add(playBtn25);	//�гο� �߰�
		//Ÿ�̸� ��ȣ�ۿ�
		playBtn25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Worktimer worktimer = new Worktimer(Time25);
				worktimer.start();
			}
		});

		//��ư ����(25�� ����)
		JButton resetBtn25 = new JButton("\uB9AC\uC14B");
		resetBtn25.setBounds(134, 149, 97, 23);
		contentPane.add(resetBtn25);	//�гο� �߰�

		//��ư ����(5�� ����)
		JButton playBtn5 = new JButton("\uC7AC\uC0DD");
		playBtn5.setBounds(296, 149, 97, 23);
		contentPane.add(playBtn5);	//�гο� �߰�
		//Ÿ�̸� ��ȣ�ۿ�
		playBtn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Resttimer resttimer = new Resttimer(Time5);
				resttimer.start();
			}
		});

		//��ư ����(5�� ����)
		JButton resetBtn5 = new JButton("\uB9AC\uC14B");
		resetBtn5.setBounds(406, 149, 97, 23);
		contentPane.add(resetBtn5);	//�гο� �߰�

		//��ư ����(�������� Ȯ��)
		JButton sucBtn = new JButton("\uC131\uACF5\uD588\uB294\uAC00?");
		sucBtn.setFont(new Font("����", Font.BOLD, 27));
		sucBtn.setBounds(24, 213, 207, 87);
		contentPane.add(sucBtn);	//�гο� �߰�

		//�ۻ��� ����(���� ���� Ƚ��)
		JLabel ytdaySucctn = new JLabel("\uC5B4\uC81C \uC131\uACF5\uD69F\uC218 :");
		ytdaySucctn.setFont(new Font("����", Font.BOLD, 19));
		ytdaySucctn.setBounds(252, 213, 141, 38);
		contentPane.add(ytdaySucctn);	//�гο� �߰�
		
		//�ۻ��� ����(���� ���� Ƚ��)
		JLabel tdaySucctn = new JLabel("\uC624\uB298 \uC131\uACF5\uD69F\uC218 :");
		tdaySucctn.setFont(new Font("����", Font.BOLD, 19));
		tdaySucctn.setBounds(252, 253, 141, 38);
		contentPane.add(tdaySucctn);	//�гο� �߰�

		//�ۻ��� ����(���� ���� Ƚ�� ī����)
		JLabel sucCtn1 = new JLabel("00");
		sucCtn1.setHorizontalAlignment(SwingConstants.CENTER);
		sucCtn1.setFont(new Font("����", Font.BOLD, 19));
		sucCtn1.setBounds(406, 219, 64, 27);
		contentPane.add(sucCtn1);	//�гο� �߰�

		//�ۻ��� ����(���� ���� Ƚ�� ī����)
		JLabel sucCtn2 = new JLabel("00");
		sucCtn2.setHorizontalAlignment(SwingConstants.CENTER);
		sucCtn2.setFont(new Font("����", Font.BOLD, 19));
		sucCtn2.setBounds(406, 253, 64, 27);
		contentPane.add(sucCtn2);	//�гο� �߰�
	}
}