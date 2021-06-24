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

        //글상자 구현(25분용)
        JLabel WorktimerLabel = new JLabel();
        WorktimerLabel.setFont(new Font("Gothci", Font.ITALIC, 80)); //폰트 설정
        c.add(WorktimerLabel);//컨테이너 안에 추가

        //25분타이머 선언
        Worktimer worktimer = new Worktimer(WorktimerLabel);
        worktimer.start();

        //글상자 구현(5분용)
        JLabel ResttimerLabel = new JLabel();
        ResttimerLabel.setFont(new Font("Gothci", Font.ITALIC, 80)); //폰트 설정
        c.add(ResttimerLabel);//컨테이너 안에 추가

        //5분타이머 선언
        Resttimer resttimer = new Resttimer(ResttimerLabel);
        resttimer.start();

        //창 사이즈&보임여부
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new timerEx();  //창이 열리면서 시간순으로 진행하여 타이머 시작
    }
}