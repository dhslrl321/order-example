package presenter;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RegisterFrame extends JFrame{

    public RegisterFrame(){
        setTitle("회원가입");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel rLabel = new JLabel("회원가입");
        rLabel.setFont(new Font("맑은 고딕", Font.BOLD, 26));
        rLabel.setBounds(135, 0, 200, 50);
        c.add(rLabel);

        JLabel rIdLabel = new JLabel("아이디");
        rIdLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        rIdLabel.setBounds(160, 60, 100, 50);
        c.add(rIdLabel);

        JTextField rId = new JTextField(10);
        rId.setBounds(90, 100, 200, 30);
        c.add(rId);

        JLabel rPwLabel = new JLabel("비밀번호");
        rPwLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        rPwLabel.setBounds(153, 130, 100, 30);
        c.add(rPwLabel);

        JPasswordField rPw = new JPasswordField();
        rPw.setBounds(90, 160, 200, 30);
        c.add(rPw);

        JLabel nameLabel = new JLabel("이름");
        nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        nameLabel.setBounds(170, 179, 100, 50);
        c.add(nameLabel);

        JTextField name = new JTextField();
        name.setBounds(90, 220, 200, 30);
        c.add(name);

        JButton done = new JButton("완료");
        done.setBounds(140, 280, 100, 30);
        done.setEnabled(true);
        c.add(done);

        setSize(400, 400);
        setVisible(true);
        setResizable(false);

        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rId.getText().isBlank() || rPw.getText().isBlank() || name.getText().isBlank()){
                    JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
                    return;
                }
                JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
                new LoginFrame();
                setVisible(false);
            }
        });

    }
}
