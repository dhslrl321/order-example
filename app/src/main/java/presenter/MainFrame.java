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

public class MainFrame extends JFrame {

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


    private static int now = 0;

    public MainFrame(){

        player = new MusicByClip();

        List<Music> playlist = new ArrayList<>();
        String rootPath = System.getProperty("user.dir");

        playlist.add(new Music("만남은 쉽고 이별은 어려워", "베이식", (rootPath + "/music/m1-easy-to-meet.wav")));
        playlist.add(new Music("회전목마", "sokodomo", (rootPath + "/music/m2-merry-go-round.wav")));
        playlist.add(new Music("불협화음", "머드 더 스튜던트", (rootPath + "/music/m3-untuned.wav")));
        playlist.add(new Music("Wake-Up", "신스, 조광일, 아우릴고트", (rootPath + "/music/m4-wake-up.wav")));

        setTitle("메인화면");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel left = new JPanel();
        left.setLayout(null);
        left.setPreferredSize(new Dimension(580, 500));
        JPanel right = new JPanel();
        right.setLayout(null);
        right.setPreferredSize(new Dimension(370, 500));

        Container c = getContentPane();


        ImageIcon album = new ImageIcon("image/blank.png");

        Image img = album.getImage();
        Image changeImg = img.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        lbl = new JLabel(changeIcon);
        lbl.setBounds(60, 80, 210, 210);
        right.add(lbl);

        JLabel title = new JLabel("title");
        title.setBounds(10, 290, 100, 100);
        title.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
        right.add(title);

        JLabel singer = new JLabel("singer");
        singer.setBounds(10, 320, 100, 100);
        singer.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
        right.add(singer);

        ImageIcon album1 = new ImageIcon("image/easy.JPG");

        Image img1 = album1.getImage();
        changeImg1 = img1.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        changeIcon1 = new ImageIcon(changeImg1);
        JLabel lbl1 = new JLabel(changeIcon1);
        lbl1.setBounds(80, 80, 90, 90);
        left.add(lbl1);

        JLabel title1 = new JLabel("만남은 쉽고 이별은 어려워");
        title1.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title1.setBounds(180, 90 , 200, 20);
        left.add(title1);

        JLabel singer1 = new JLabel("베이식(Basic)");
        singer1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer1.setBounds(180, 130, 200, 20);
        left.add(singer1);

        JButton add1 = new JButton("+");
        add1.setBounds(460, 102, 50,50);
        add1.setFont(new Font("plain", Font.BOLD, 22));
        left.add(add1);

        ImageIcon album2 = new ImageIcon("image/merry-go-round.jpg");

        Image img2 = album2.getImage();
        changeImg2 = img2.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        changeIcon2 = new ImageIcon(changeImg2);
        JLabel lbl2 = new JLabel(changeIcon2);
        lbl2.setBounds(80, 190, 90, 90);
        left.add(lbl2);

        JLabel title2 = new JLabel("회전목마(Feat.자이언티)");
        title2.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title2.setBounds(180, 200 , 200, 20);
        left.add(title2);

        JLabel singer2 = new JLabel("소코도모(sokodomo)");
        singer2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer2.setBounds(180, 240, 200, 20);
        left.add(singer2);

        JButton add2 = new JButton("+");
        add2.setBounds(460, 212, 50,50);
        add2.setFont(new Font("plain", Font.BOLD, 22));
        left.add(add2);

        ImageIcon album3 = new ImageIcon("image/untuned.jpg");

        Image img3 = album3.getImage();
        changeImg3 = img3.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        changeIcon3 = new ImageIcon(changeImg3);
        JLabel lbl3 = new JLabel(changeIcon3);
        lbl3.setBounds(80, 300, 90, 90);
        left.add(lbl3);

        JLabel title3 = new JLabel("불협화음(Feat. 악동뮤지션)");
        title3.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title3.setBounds(180, 310 , 200, 20);
        left.add(title3);

        JLabel singer3 = new JLabel("머드 더 스튜던트");
        singer3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer3.setBounds(180, 350, 200, 20);
        left.add(singer3);

        JButton add3 = new JButton("+");
        add3.setBounds(460, 322, 50,50);
        add3.setFont(new Font("plain", Font.BOLD, 22));
        left.add(add3);

        ImageIcon album4 = new ImageIcon("image/wake-up.JPG");

        Image img4 = album4.getImage();
        changeImg4 = img4.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        changeIcon4 = new ImageIcon(changeImg4);
        JLabel lbl4 = new JLabel(changeIcon4);
        lbl4.setBounds(80, 410, 90, 90);
        left.add(lbl4);

        JLabel title4 = new JLabel("Wake-Up");
        title4.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        title4.setBounds(180, 420 , 200, 20);
        left.add(title4);

        JLabel singer4 = new JLabel("신스, 조광일, 아우릴코트");
        singer4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        singer4.setBounds(180, 460, 200, 20);
        left.add(singer4);

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

        c.add(right, BorderLayout.EAST);

        play.addActionListener(e -> {
            if(play.getText().equals("▶")){ // 최초 실행될 때
                play.setText("◼︎");
                play.setFont(new Font("plain", Font.BOLD, 20));

                Music music = playlist.get(now);
                player.switchMusic(music);
                player.play();
            }
            else{
                play.setText("▶");
                play.setFont(new Font("plain", Font.PLAIN, 16));
                player.stop();
            }
        });

        add1.addActionListener((e) -> {
            changeImg1 = img1.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            changeIcon1 = new ImageIcon(changeImg1);
            lbl.setIcon(changeIcon1);
            play.setEnabled(true);
            now = 0;
            Music music = playlist.get(now);
            title.setText(music.getTitle());
            singer.setText(music.getSinger());
        });

        add2.addActionListener(e -> {
            changeImg2 = img2.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            changeIcon2 = new ImageIcon(changeImg2);
            lbl.setIcon(changeIcon2);
            play.setEnabled(true);

            now = 1;
            Music music = playlist.get(now);
            title.setText(music.getTitle());
            singer.setText(music.getSinger());
        });
        add3.addActionListener(e -> {
            changeImg3 = img3.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            changeIcon3 = new ImageIcon(changeImg3);
            lbl.setIcon(changeIcon3);
            play.setEnabled(true);

            now = 2;
            Music music = playlist.get(now);
            title.setText(music.getTitle());
            singer.setText(music.getSinger());
        });

        add4.addActionListener(e -> {
            changeImg4 = img4.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            changeIcon4 = new ImageIcon(changeImg4);
            lbl.setIcon(changeIcon4);
            play.setEnabled(true);

            now = 3;
            Music music = playlist.get(now);
            title.setText(music.getTitle());
            singer.setText(music.getSinger());
        });

        setSize(1000, 600);
        setVisible(true);
        setResizable(false);
    }
}