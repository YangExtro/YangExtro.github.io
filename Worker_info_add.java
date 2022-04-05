package renshi;



import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;


public class Worker_info_add extends JFrame {
	
	JTextField jtname;   //���������ı���
	JTextField jtbirth;  //���������ı���
	JRadioButton jrbsexmale;     //�����Ա�ѡ��Ť����
	JRadioButton jrbsexfemale;    //Ů
	JComboBox jcmarriage;   //�������״��������
	JComboBox jcedu;    //����ѧ��������
	JComboBox jcpostevent;  //������ְ���������
	JTextField jtpost;        //�����λ������
	JTextField jtwage;       //���幤���ı���
	JTextField jtfuli;       //���帣���ı���
	JRadioButton jrbtrayes;     //������ѵ��ѡ��ť����
	JRadioButton jrbtrano;    //��
	JButton jbline;
	JButton jbok,jbcancel,jbclose;

 public Worker_info_add(){
		this.setResizable(false);              //����̶���С
		this.setTitle("Ա����Ϣ���");
		this.setSize(400,500);
		
		JLabel jlname=new JLabel("��        ��:");
		JLabel jlsex=new JLabel("��        ��:");
		JLabel jlbirth=new JLabel("��������:");
		JLabel jlmarriage=new JLabel("����״��:");
		JLabel jledu=new JLabel("ѧ        ��:");
		JLabel jlpostevent=new JLabel("�ڸ����:");
		JLabel jlpost=new JLabel("����ְλ:");
		JLabel jlwage=new JLabel("��        н:");
		JLabel jltra=new JLabel("�Ƿ���ѵ:");
		JLabel jlfuli=new JLabel("��        ��:");

		jbok=new JButton("���");
		jbcancel = new JButton("����");
		jbclose=new JButton("ȡ��");
		jbline=new JButton();
		jtname=new JTextField();
		jtbirth=new JTextField();
		jrbsexmale=new JRadioButton("��");
		jrbsexfemale=new JRadioButton("Ů");
		
		jcedu=new JComboBox();
		jcpostevent=new JComboBox();
		jtpost=new JTextField();
		jtwage=new JTextField();
		jtfuli=new JTextField();
		jrbtrayes=new JRadioButton("��");
		jrbtrano=new JRadioButton("δ");
		jcmarriage=new JComboBox();
		//Ϊ����״�����ѡ��
		jcmarriage.addItem("");
		jcmarriage.addItem("δ��");
		jcmarriage.addItem("�ѻ�");
		jcmarriage.addItem("����");
		
		//Ϊѧ�����������ѡ��
		jcedu.addItem("");
		jcedu.addItem("��������");
		jcedu.addItem("����");
		jcedu.addItem("ר��");
		jcedu.addItem("����");
		jcedu.addItem("˶ʿ");
		jcedu.addItem("��ʿ");
		jcedu.addItem("��ʿ����");
		//Ϊ�ڸ�������ѡ��
		jcpostevent.addItem("��ְ");
		jcpostevent.addItem("�ݼ�");
		jcpostevent.addItem("��ְ");
		jcpostevent.addItem("����");
		jcpostevent.addItem("����");
		
		//Ϊ��ѡ�����
		ButtonGroup bgsex=new ButtonGroup();
		  bgsex.add(jrbsexmale);
		  bgsex.add(jrbsexfemale);
		  jrbsexmale.setSelected(true);    //Ĭ��ѡ������
		ButtonGroup bgtra=new ButtonGroup();
		  bgtra.add(jrbtrayes);
		  bgtra.add(jrbtrano);
		  jrbtrano.setSelected(true);     //Ĭ��ѡ�з�
		  
		//����bounds
		jlname.setBounds(40,40,60,20);
		jtname.setBounds(100,40,70,20);
		jlsex.setBounds(40,80,60,20);
		jrbsexmale.setBounds(100,80,40,20);
		jrbsexfemale.setBounds(150,80,40,20);
		jlbirth.setBounds(200,80,60,20);
		jtbirth.setBounds(270,80,80,20);
		jlmarriage.setBounds(200,120,60,20);
		jcmarriage.setBounds(270,120,80,20);
		jledu.setBounds(40,120,60,20);
		jcedu.setBounds(100,120,70,20);
		jbline.setBounds(30,165,340,1);
		jlpostevent.setBounds(40,200,60,20);
		jcpostevent.setBounds(100,200,70,20);
		jlpost.setBounds(200,200,60,20);
		jtpost.setBounds(270,200,80,20);
		jlwage.setBounds(40,240,60,20);
		jtwage.setBounds(100,240,70,20);
		jltra.setBounds(40,280,60,20);
		jrbtrayes.setBounds(100,280,40,20);
		jrbtrano.setBounds(140,280,40,20);
		jlfuli.setBounds(40,320,60,20);
		jtfuli.setBounds(100,320,250,20);
		jbok.setBounds(70,400,60,20);
		jbcancel.setBounds(160,400,60,20);
		jbclose.setBounds(250,400,60,20);
		
		Container addcp=this.getContentPane();
		setLocationRelativeTo(null);    //������ʾ,ǿ!!
		  addcp.setLayout(null);
		  addcp.add(jlname);
		  addcp.add(jtname);
		  addcp.add(jlsex);
		  addcp.add(jrbsexmale);
		  addcp.add(jrbsexfemale);
		  addcp.add(jlbirth);
		  addcp.add(jtbirth);
		  addcp.add(jlmarriage);
		  addcp.add(jcmarriage);
		  addcp.add(jledu);
		  addcp.add(jcedu);
		  addcp.add(jlpostevent);
		  addcp.add(jcpostevent);
		  addcp.add(jlpost);
		  addcp.add(jtpost);
		  addcp.add(jlwage);
		  addcp.add(jtwage);
		  addcp.add(jbline);
		  addcp.add(jltra);
		  addcp.add(jrbtrayes);
		  addcp.add(jrbtrano);
		  addcp.add(jlfuli);
		  addcp.add(jtfuli);
		  addcp.add(jbok);
		  addcp.add(jbcancel);
		  addcp.add(jbclose);
		   //���jcpostevent������
		  jcpostevent.addItemListener(
				  new ItemListener(){
					  public void itemStateChanged(ItemEvent e){
						  if(e.getItem().equals("��ְ")||e.getItem().equals("�ݼ�")){
						  jtpost.setEditable(true);
						  }
						  else jtpost.setEditable(false);
						       jtwage.setEditable(false);
					  }
				  });
		  jbok.addActionListener(new MyAction(this));
		  jbcancel.addActionListener(new MyAction(this));
		  jbclose.addActionListener(new MyAction(this));
	}
public void jbok(ActionEvent evt){
	String sname,ssex,smarriage,sedu,spostevent,spost,sfuli,stra,swage,sbirth;
	String str;
    sname=jtname.getText();
    if (jrbsexmale.isSelected()){
    	ssex="��";}
    else ssex="Ů";
    smarriage=(String)jcmarriage.getSelectedItem();
	sedu=(String)jcedu.getSelectedItem();
	sbirth=jtbirth.getText();
	spostevent=(String)jcpostevent.getSelectedItem();
	spost=jtpost.getText();
	swage=jtwage.getText();
	if(jrbtrayes.isSelected()){
		stra="��";}
	else stra="��";
	sfuli=jtfuli.getText();
	
	if(sname.equals("")||ssex.equals("")||sbirth.equals("")||sedu.equals("")||smarriage.equals("")||stra.equals("")||sfuli.equals("")||spostevent.equals("")){
		JOptionPane.showMessageDialog(null,"���ʧ��:������Ϣδ��");
	}
	else{
	str="����:"+sname+"\n";
	str=str+"�Ա�:"+ssex+"\n";
	str=str+"��������:"+sbirth+"\n";
	str=str+"ѧ��:"+sedu+"\n";
	str=str+"����״��:"+smarriage+"\n";
	str=str+"��ְ���:"+spostevent+"\n";
	str=str+"ְλ:"+spost+"\n";
	str=str+"����:"+swage+"\n";
	str=str+"�Ƿ���ѵ:"+stra+"\n";
	str=str+"���ܸ���:"+sfuli+"\n";
	
	
try{
		  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		  Connection con=DriverManager.getConnection("jdbc:odbc:bussiness","","");
		  String sql="insert into employees (name,birth,sex,edu,postevent,post,marriage,wage,tra,fuli)Values(?,?,?,?,?,?,?,?,?,?)";
		  PreparedStatement pstmt=con.prepareStatement(sql);
		   pstmt.setString(1,sname);
		   pstmt.setString(2,sbirth);
		   pstmt.setString(3,ssex);
		   pstmt.setString(4,sedu);
		   pstmt.setString(5,spostevent);
		   pstmt.setString(6,spost);
		   pstmt.setString(7,smarriage);
		   pstmt.setString(8,swage);
		   pstmt.setString(9,stra);
		   pstmt.setString(10,sfuli);

		   if (pstmt.executeUpdate()>0){
			   JOptionPane.showMessageDialog(null,str+"\n"+"��ӳɹ�");
			   jbcancel(evt);
		   }
		   else{
			   JOptionPane.showMessageDialog(null,"���ʧ��");
		   }
		   pstmt.close();
		   con.close();
	}catch(Exception e1){
		e1.printStackTrace();
	}
}
}
	



public void jbcancel(ActionEvent evt){
	jtname.setText("");
	jtbirth.setText("");
	jcedu.setSelectedIndex(0);
	jcpostevent.setSelectedIndex(0);
	jcmarriage.setSelectedIndex(0);
	jtpost.setText("");
	jrbsexmale.setSelected(true);
	jtfuli.setText("");
	jtwage.setText("");
	jrbtrayes.setSelected(true);
	jtname.requestFocus();
	
}
public void jbclose(ActionEvent evt){
	this.setVisible(false);
}
class MyAction implements ActionListener{
	Worker_info_add wiap=null;
	public MyAction(Worker_info_add wiap){
		 this.wiap=wiap;
	 }
	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals("���")){
			wiap.jbok(evt);
		 }else if(evt.getActionCommand().equals("����")){
			 wiap.jbcancel(evt);
		 }else if(evt.getActionCommand().equals("ȡ��")){
			 wiap.jbclose(evt);
	}
}
}
}
