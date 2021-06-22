package timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.event.*;

//테스트용 swing 선언
public class timerEx extends JFrame{
    public timerEx() {
        setTitle("토마토 타이머 확인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //컨테이너 생성
        Container c = getContentPane();
        c.setLayout(new FlowLayout());  //컨테이너 속 FlowLayout 설정
        
        //글상자 구현
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothci", Font.ITALIC, 80)); //폰트 설정
        c.add(timerLabel);//컨테이너 안에 추가
        //글상자 구현
        JLabel ResttimerLabel = new JLabel();
        ResttimerLabel.setFont(new Font("Gothci", Font.ITALIC, 80)); //폰트 설정
        c.add(ResttimerLabel);//컨테이너 안에 추가

        setSize(300, 250);
        setVisible(true);
        Worktimer wkt = new Worktimer(timerLabel);  //worktimer 선언
        wkt.start();//타이머 스레드 run()실행
        Resttimer rtt = new Resttimer(ResttimerLabel);  //worktimer 선언
        rtt.start();//타이머 스레드 run()실행
    }

    public static void main(String[] args) {
        new timerEx();
    }
}
