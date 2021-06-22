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

        //버튼 구현
        JButton button = new JButton("Start");
        button.addActionListener(new EventHandler());
        c.add(button);

        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new timerEx();
    }
}
class EventHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){

        }
    }
}