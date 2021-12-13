import java.awt.*;

import java.awt.event.*;



import javax.swing.JOptionPane;



public class Register implements ActionListener{

	

	Frame f;

	Label name, sex, jumin, hyphen, address, hobby, buseo, intro;

	TextField tfName, tfJumin1, tfJumin2,tfAddress; 	

	CheckboxGroup fm;

	Checkbox cbMale, cbFemale; 

	Checkbox cbSport, cbMusic, cbMovie, cbComp;

	Choice bu;

	TextArea ta;

	Button b1 , b2;

	Panel p1, p2, p3, p4, p4_1, p5, p6, p7, p8, p9;

		

	public Register(){

	f = new Frame( "������" );



	f.addWindowListener( new WindowAdapter() {

	    public void windowClosing( WindowEvent e ) {

		System.exit( 0 );

	    }

	});



	name =  new Label("����");

	sex =  new Label("����");

	jumin =  new Label("�ֹε�Ϲ�ȣ");

	hyphen =  new Label("-");

	address =  new Label("�ּ�");

	hobby =  new Label("���");

	buseo = new Label("�μ���");

	intro =  new Label("�ڱ�Ұ�");



	tfName = new TextField(18);	

	tfJumin1 = new TextField(13);

	tfJumin2 = new TextField(14);

	tfAddress = new TextField(34);

	

	fm = new CheckboxGroup();

	cbMale =  new Checkbox("��",fm,false);

	cbFemale =  new Checkbox("��",fm,false);



	cbSport = new Checkbox("�",true);

	cbMusic = new Checkbox("���ǰ���");

	cbMovie = new Checkbox("��ȭ");

	cbComp = new Checkbox("��ǻ��");



	bu = new Choice();

	bu.add("�μ��� ����");

	bu.add("��ȹ��");

	bu.add("������");

	bu.add("�ѹ���");



	ta = new TextArea(10,40);



	b1 = new Button("����");

	b2 = new Button("����");



	p1 = new Panel();

	p1.setLayout(new GridLayout(5,1,0,20));

	p1.add(name);

	p1.add(jumin);

	p1.add(address);

	p1.add(buseo);

	p1.add(hobby);



	p2 = new Panel();

	p2.add(tfName);

	p2.add(sex);

	p2.add(cbMale);

	p2.add(cbFemale);



	p3 = new Panel();	

	p3.add(tfJumin1);

	p3.add(hyphen);

	p3.add(tfJumin2);



	p4 = new Panel();

	p4.add(tfAddress);	



	p4_1 = new Panel();

	p4_1.add(bu);



	p5 = new Panel();	

	p5.add(cbSport);

	p5.add(cbMusic);

	p5.add(cbMovie);

	p5.add(cbComp);



	p6 = new Panel();

	p6.setLayout(new GridLayout(5,1,0,10));

	p6.add(p2);

	p6.add(p3);

	p6.add(p4);

	p6.add(bu);

	p6.add(p5);



	p7 = new Panel();

	p7.add(p1);

	p7.add(p6);	

	

	p8 = new Panel();		

	p8.setLayout(new BorderLayout());

	p8.add(intro,"North");

	p8.add(ta,"Center");



	p9 = new Panel();

	p9.add(b1);

	p9.add(b2);



	f.add(p7,"North");

	f.add(p8,"Center");

	f.add(p9,"South");



	f.setSize(400,600);

	f.setBackground(Color.yellow);

	f.setLocation(400,100);

	f.setVisible(true);

	f.setResizable(false);	

	

	b1.addActionListener(this);

	b2.addActionListener(this);

	}// ������

	

	public int check(){

		int cnt = 0;

		if(cbSport.getState()) cnt++;					

		if(cbMusic.getState()) cnt++;					

		if(cbMovie.getState()) cnt++;					

		if(cbComp.getState()) cnt++;

		

		return cnt;

	}	

	

	public void memberCheck(){

		if(tfName.getText().equals("")){ //����

			JOptionPane.showMessageDialog(f, "������ �Է� �ϼ���~~!!");

		}else if(cbMale.getState() != true && cbFemale.getState() != true){

			JOptionPane.showMessageDialog(f, "���� ������ �ϳ��� �����ϼ���~~!!");

		}else if(tfJumin1.getText().equals("")){

			JOptionPane.showMessageDialog(f, "�ֹι�ȣ ���ڸ��� �Է��ϼ���");

		}else if(tfJumin1.getText().length() != 6){

			JOptionPane.showMessageDialog(f, "�ֹι�ȣ ���ڸ��� 6�ڸ� �Դϴ�.");

			tfJumin1.setText("");

		}else if(tfJumin2.getText().equals("")){

			JOptionPane.showMessageDialog(f, "�ֹι�ȣ ���ڸ��� �Է��ϼ���");

		}else if(tfJumin2.getText().length() != 7){

			JOptionPane.showMessageDialog(f, "�ֹι�ȣ ���ڸ��� 7�ڸ� �Դϴ�.");

			tfJumin2.setText("");

		}else if(tfAddress.getText().equals("")){

			JOptionPane.showMessageDialog(f, "�ּҸ� �Է� �ϼ���~!!");

     	}else if(bu.getSelectedIndex() == 0){

			JOptionPane.showMessageDialog(f, "�μ����� ���� �ϼ���~~!!");

		}else if(check() < 2){

			JOptionPane.showMessageDialog(f, "��̴� 2���̻� ���� �ϼž� �մϴ�.");

		}else if(ta.getText().equals("")){

			JOptionPane.showMessageDialog(f, "�ڱ� �Ұ��� �Է� �ϼ���~~!!");

		}else{

			JOptionPane.showMessageDialog(f,"ȸ������ ����");

		}

		

	}

	

	@Override

	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		if(e.getSource() == b1){          // ����

			memberCheck();

		}else if(e.getSource() == b2){    // ����

			System.exit(0);

		}

	}



	public static void main(String[] args) {

		Register er =  new Register();

	}

}