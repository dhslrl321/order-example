package presenter;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MainDisplay extends JFrame {



    public MainDisplay(){

        setTitle("메인화면");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(null);

        ImageIcon album = new ImageIcon("image/image.png");

        Image img = album.getImage();
        Image changeImg = img.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        JLabel lbl = new JLabel(changeIcon);
        lbl.setBounds(700, 80, 210, 210);
        c.add(lbl);

        ImageIcon album1 = new ImageIcon("image/image.png");

        Image img1 = album1.getImage();
        Image changeImg1 = img1.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        ImageIcon changeIcon1 = new ImageIcon(changeImg1);
        JLabel lbl1 = new JLabel(changeIcon1);
        lbl1.setBounds(80, 80, 90, 90);
        c.add(lbl1);

        JLabel title1 = new JLabel("회전목마(Feat. Zion.T, 원슈타인)(Prod. Slom");
        title1.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title1.setBounds(180, 90 , 200, 20);
        c.add(title1);

        JLabel singer1 = new JLabel("sokodomo");
        singer1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer1.setBounds(180, 130, 200, 20);
        c.add(singer1);

        ImageIcon album2 = new ImageIcon("image/image.png");

        Image img2 = album2.getImage();
        Image changeImg2 = img2.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        ImageIcon changeIcon2 = new ImageIcon(changeImg2);
        JLabel lbl2 = new JLabel(changeIcon2);
        lbl2.setBounds(80, 190, 90, 90);
        c.add(lbl2);

        JLabel title2 = new JLabel("쉬어(Feat. MINO)(Prod. GRAY");
        title2.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title2.setBounds(180, 200 , 200, 20);
        c.add(title2);

        JLabel singer2 = new JLabel("아던닐라이트(Anandelight)");
        singer2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer2.setBounds(180, 240, 200, 20);
        c.add(singer2);

        ImageIcon album3 = new ImageIcon("image/image.png");

        Image img3 = album3.getImage();
        Image changeImg3 = img3.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        ImageIcon changeIcon3 = new ImageIcon(changeImg3);
        JLabel lbl3 = new JLabel(changeIcon3);
        lbl3.setBounds(80, 300, 90, 90);
        c.add(lbl3);

        JLabel title3 = new JLabel("Wake Up (Prod. 코드 쿤스트)");
        title3.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title3.setBounds(180, 310 , 200, 20);
        c.add(title3);

        JLabel singer3 = new JLabel("개코, Ourealgoat (아우릴고트)");
        singer3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer3.setBounds(180, 350, 200, 20);
        c.add(singer3);

        ImageIcon album4 = new ImageIcon("image/image.png");

        Image img4 = album4.getImage();
        Image changeImg4 = img4.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        ImageIcon changeIcon4 = new ImageIcon(changeImg4);
        JLabel lbl4 = new JLabel(changeIcon4);
        lbl4.setBounds(80, 410, 90, 90);
        c.add(lbl4);

        JLabel title4 = new JLabel("strawberry moon");
        title4.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title4.setBounds(180, 420 , 200, 20);
        c.add(title4);

        JLabel singer4 = new JLabel("아이유");
        singer4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer4.setBounds(180, 460, 200, 20);
        c.add(singer4);

        JButton play = new JButton("▶");
        play.setBounds(770, 330, 70, 70);
        play.setFont(new Font("plain", Font.PLAIN, 16));
        c.add(play);

        JButton previous = new JButton("<");
        previous.setBounds(700, 330, 70, 70);
        previous.setFont(new Font("plain", Font.PLAIN, 22));
        c.add(previous);

        JButton next = new JButton(">");
        next.setBounds(840, 330, 70, 70);
        next.setFont(new Font("plain", Font.PLAIN, 22));
        c.add(next);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setBounds(700,300,210,20);
        c.add(progressBar);

        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(play.getText().equals("▶")){
                    play.setText("⏸");
                    play.setFont(new Font("plain", Font.BOLD, 20));
                }
                else{
                    play.setText("▶");
                    play.setFont(new Font("plain", Font.PLAIN, 16));
                }
            }
        });

        setSize(1000, 600);
        setVisible(true);
        setResizable(false);

    }



}
