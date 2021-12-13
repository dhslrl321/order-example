package presenter;

import domain.Music;
import domain.MusicByClip;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.ArrayList;
import java.util.List;

public class MainDisplay extends JFrame {

    private final MusicByClip player;

    private JLabel lbl;
    private Image changeImg1;
    private ImageIcon changeIcon1;
    private Image changeImg2;
    private ImageIcon changeIcon2;
    private Image changeImg3;
    private ImageIcon changeIcon3;
    private Image changeImg4;
    private ImageIcon changeIcon4;

    public MainDisplay(){

        player = new MusicByClip();

        List<Music> playlist = new ArrayList<>();
        String rootPath = System.getProperty("user.dir");

        playlist.add(new Music("만남은 쉽고 이별은 어려워", "베이식", (rootPath + "/music/m1-easy-to-meet.wav")));
        playlist.add(new Music("회전목마", "sokodomo", (rootPath + "/music/m2-merry-go-round.wav")));
        playlist.add(new Music("", "", (rootPath + "")));
        playlist.add(new Music("", "", (rootPath + "")));

        setTitle("메인화면");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel left = new JPanel();
        left.setLayout(null);
        left.setPreferredSize(new Dimension(580, 500));
        JPanel right = new JPanel();
        right.setLayout(null);
        right.setPreferredSize(new Dimension(370, 500));
        Container c = getContentPane();

        //c.setLayout(null);

        ImageIcon album = new ImageIcon("image/blank.png");

        Image img = album.getImage();
        Image changeImg = img.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        lbl = new JLabel(changeIcon);
        lbl.setBounds(60, 80, 210, 210);
        right.add(lbl);

        ImageIcon album1 = new ImageIcon("image/test1.png");

        Image img1 = album1.getImage();
        changeImg1 = img1.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        changeIcon1 = new ImageIcon(changeImg1);
        JLabel lbl1 = new JLabel(changeIcon1);
        lbl1.setBounds(80, 80, 90, 90);
        left.add(lbl1);

        JLabel title1 = new JLabel();
        title1.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title1.setBounds(180, 90 , 200, 20);
        left.add(title1);

        JLabel singer1 = new JLabel("sokodomo");
        singer1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer1.setBounds(180, 130, 200, 20);
        left.add(singer1);

        JButton play1 = new JButton("▶");
        play1.setBounds(400, 102, 50,50);
        left.add(play1);

        JButton add1 = new JButton("+");
        add1.setBounds(460, 102, 50,50);
        add1.setFont(new Font("plain", Font.BOLD, 22));
        left.add(add1);

        ImageIcon album2 = new ImageIcon("image/test2.png");

        Image img2 = album2.getImage();
        changeImg2 = img2.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        changeIcon2 = new ImageIcon(changeImg2);
        JLabel lbl2 = new JLabel(changeIcon2);
        lbl2.setBounds(80, 190, 90, 90);
        left.add(lbl2);

        JLabel title2 = new JLabel("쉬어(Feat. MINO)(Prod. GRAY");
        title2.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title2.setBounds(180, 200 , 200, 20);
        left.add(title2);

        JLabel singer2 = new JLabel("아던닐라이트(Anandelight)");
        singer2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer2.setBounds(180, 240, 200, 20);
        left.add(singer2);

        JButton play2 = new JButton("▶");
        play2.setBounds(400, 212, 50,50);
        left.add(play2);

        JButton add2 = new JButton("+");
        add2.setBounds(460, 212, 50,50);
        add2.setFont(new Font("plain", Font.BOLD, 22));
        left.add(add2);

        ImageIcon album3 = new ImageIcon("image/test3.png");

        Image img3 = album3.getImage();
        changeImg3 = img3.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        changeIcon3 = new ImageIcon(changeImg3);
        JLabel lbl3 = new JLabel(changeIcon3);
        lbl3.setBounds(80, 300, 90, 90);
        left.add(lbl3);

        JLabel title3 = new JLabel("Wake Up (Prod. 코드 쿤스트)");
        title3.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title3.setBounds(180, 310 , 200, 20);
        left.add(title3);

        JLabel singer3 = new JLabel("개코, Ourealgoat (아우릴고트)");
        singer3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer3.setBounds(180, 350, 200, 20);
        left.add(singer3);

        JButton play3 = new JButton("▶");
        play3.setBounds(400, 322, 50,50);
        left.add(play3);

        JButton add3 = new JButton("+");
        add3.setBounds(460, 322, 50,50);
        add3.setFont(new Font("plain", Font.BOLD, 22));
        left.add(add3);

        ImageIcon album4 = new ImageIcon("image/test4.png");

        Image img4 = album4.getImage();
        changeImg4 = img4.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        changeIcon4 = new ImageIcon(changeImg4);
        JLabel lbl4 = new JLabel(changeIcon4);
        lbl4.setBounds(80, 410, 90, 90);
        left.add(lbl4);

        JLabel title4 = new JLabel("strawberry moon");
        title4.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title4.setBounds(180, 420 , 200, 20);
        left.add(title4);

        JLabel singer4 = new JLabel("아이유");
        singer4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer4.setBounds(180, 460, 200, 20);
        left.add(singer4);

        JButton play4 = new JButton("▶");
        play4.setBounds(400, 432, 50,50);
        left.add(play4);

        JButton add4 = new JButton("+");
        add4.setBounds(460, 432, 50,50);
        add4.setFont(new Font("plain", Font.BOLD, 22));
        left.add(add4);

        JScrollPane scroll = new JScrollPane(left, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        c.add(scroll, BorderLayout.WEST);

        JPanel center = new JPanel();
        center.setPreferredSize(new Dimension(50, 600));
        JSeparator s = new JSeparator();
        s.setPreferredSize(new Dimension(10, 540));
        s.setOrientation(SwingConstants.VERTICAL);
        center.add(s, BorderLayout.EAST);
        c.add(center);

        JButton play = new JButton("▶");
        play.setBounds(130, 330, 70, 70);
        play.setFont(new Font("plain", Font.PLAIN, 16));
        play.setEnabled(false);
        right.add(play);

        JButton previous = new JButton("<");
        previous.setBounds(60, 330, 70, 70);
        previous.setFont(new Font("plain", Font.PLAIN, 22));
        previous.setEnabled(false);
        right.add(previous);

        JButton next = new JButton(">");
        next.setBounds(200, 330, 70, 70);
        next.setFont(new Font("plain", Font.PLAIN, 22));
        next.setEnabled(false);
        right.add(next);

        c.add(right, BorderLayout.EAST);

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

        play1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeImg1 = img1.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
                changeIcon1 = new ImageIcon(changeImg1);
                lbl.setIcon(changeIcon1);
                play.setEnabled(true);
                next.setEnabled(true);
                previous.setEnabled(true);

                Music music = playlist.get(0);
                player.switchMusic(music);

                player.play();
            }
        });
        play2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeImg2 = img2.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
                changeIcon2 = new ImageIcon(changeImg2);
                lbl.setIcon(changeIcon2);
                play.setEnabled(true);
                next.setEnabled(true);
                previous.setEnabled(true);



                Music music = playlist.get(1);
                player.switchMusic(music);

                player.play();
            }
        });
        play3.addActionListener(e -> {
            changeImg3 = img3.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            changeIcon3 = new ImageIcon(changeImg3);
            lbl.setIcon(changeIcon3);
            play.setEnabled(true);
            next.setEnabled(true);
            previous.setEnabled(true);
        });
        play4.addActionListener(e -> {
            changeImg4 = img4.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            changeIcon4 = new ImageIcon(changeImg4);
            lbl.setIcon(changeIcon4);
            play.setEnabled(true);
            next.setEnabled(true);
            previous.setEnabled(true);
        });

        setSize(1000, 600);
        setVisible(true);
        setResizable(false);

    }



}