package presenter;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    public LoginFrame() throws HeadlessException {
        setTitle("로그인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("Melona");
        label.setFont(new Font("Arial", Font.BOLD, 26));
        label.setBounds(140, 10, 100, 50);
        c.add(label);

        JLabel idLabel = new JLabel("ID : ");
        idLabel.setFont(new Font("Arial", Font.BOLD, 14));
        idLabel.setBounds(100, 70, 100, 50);
        c.add(idLabel);

        JTextField id = new JTextField(10);
        id.setBounds(135, 85, 100, 20);
        c.add(id);

        JLabel pwLabel = new JLabel("Password : ");
        pwLabel.setFont(new Font("Arial", Font.BOLD, 14));
        pwLabel.setBounds(45, 103, 100, 50);
        c.add(pwLabel);

        JPasswordField pw = new JPasswordField(10);
        pw.setBounds(135, 120, 100, 20);
        c.add(pw);

        JButton login = new JButton("로그인");
        login.setBounds(135, 180, 100, 30);
        c.add(login);

        JButton register = new JButton("회원가입");
        register.setBounds(135, 220, 100, 30);
        c.add(register);

        setSize(400, 400);
        setVisible(true);
        setResizable(false);

        register.addActionListener(e -> {
            new RegisterFrame();
            setVisible(false);
        });

        login.addActionListener(e -> {
            if(id.getText().equals("user") && pw.getText().equals("user")) {
                new MainFrame();
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 정확히 입력해 주세요.");
            }
        });
    }
}
