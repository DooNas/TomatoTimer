package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
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
		//컨테이너 선언
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 360);
		
		//패널 선언
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	//패널 레이아웃 선언
		
		//글상자 선언(25분)
		JLabel Time25 = new JLabel("25:00");
		Time25.setBackground(Color.PINK);
		Time25.setFont(new Font("굴림", Font.BOLD, 72));
		Time25.setBounds(24, 10, 207, 162);
		contentPane.add(Time25);	//패널에 추가

		//글상자 선언(5분)
		JLabel Time5 = new JLabel("05:00");
		Time5.setFont(new Font("굴림", Font.BOLD, 72));
		Time5.setBounds(296, 10, 207, 162);
		contentPane.add(Time5);	//패널에 추가

		//버튼 선언(25분 시작)
		JButton playBtn25 = new JButton("\uC7AC\uC0DD");
		playBtn25.setBounds(25, 149, 97, 23);
		contentPane.add(playBtn25);	//패널에 추가

		//버튼 선언(25분 리셋)
		JButton resetBtn25 = new JButton("\uB9AC\uC14B");
		resetBtn25.setBounds(134, 149, 97, 23);
		contentPane.add(resetBtn25);	//패널에 추가

		//버튼 선언(5분 시작)
		JButton playBtn5 = new JButton("\uC7AC\uC0DD");
		playBtn5.setBounds(296, 149, 97, 23);
		contentPane.add(playBtn5);	//패널에 추가

		//버튼 선언(5분 리셋)
		JButton resetBtn5 = new JButton("\uB9AC\uC14B");
		resetBtn5.setBounds(406, 149, 97, 23);
		contentPane.add(resetBtn5);	//패널에 추가

		//버튼 선언(성공여부 확인)
		JButton sucBtn = new JButton("\uC131\uACF5\uD588\uB294\uAC00?");
		sucBtn.setFont(new Font("굴림", Font.BOLD, 27));
		sucBtn.setBounds(24, 213, 207, 87);
		contentPane.add(sucBtn);	//패널에 추가

		//글상자 선언(어제 성공 횟수)
		JLabel ytdaySucctn = new JLabel("\uC5B4\uC81C \uC131\uACF5\uD69F\uC218 :");
		ytdaySucctn.setFont(new Font("굴림", Font.BOLD, 19));
		ytdaySucctn.setBounds(252, 213, 141, 38);
		contentPane.add(ytdaySucctn);	//패널에 추가
		
		//글상자 선언(오늘 성공 횟수)
		JLabel tdaySucctn = new JLabel("\uC624\uB298 \uC131\uACF5\uD69F\uC218 :");
		tdaySucctn.setFont(new Font("굴림", Font.BOLD, 19));
		tdaySucctn.setBounds(252, 253, 141, 38);
		contentPane.add(tdaySucctn);	//패널에 추가

		//글상자 선언(어제 성공 횟수 카운팅)
		JLabel sucCtn1 = new JLabel("00");
		sucCtn1.setHorizontalAlignment(SwingConstants.CENTER);
		sucCtn1.setFont(new Font("굴림", Font.BOLD, 19));
		sucCtn1.setBounds(406, 219, 64, 27);
		contentPane.add(sucCtn1);	//패널에 추가

		//글상자 선언(오늘 성공 횟수 카운팅)
		JLabel sucCtn2 = new JLabel("00");
		sucCtn2.setHorizontalAlignment(SwingConstants.CENTER);
		sucCtn2.setFont(new Font("굴림", Font.BOLD, 19));
		sucCtn2.setBounds(406, 253, 64, 27);
		contentPane.add(sucCtn2);	//패널에 추가
	}
}
