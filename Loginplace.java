package renshi;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class Loginplace extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField jtname;
	JPasswordField jtpass; //���ڶദ���������ڷ���������
	String jtemp;    //�û�������
  public Loginplace (){
	  this.setResizable(false);             //����̶���С
	  this.setTitle("����Ա��½");
	  this.setSize(300,200);
	  JLabel jlname=new JLabel("�û���:");   //�û�����ǩ
	  JLabel jlpass=new JLabel("����:");//password ��ǩ
	  jtname=new JTextField();              //�û����ı���
	  jtpass=new JPasswordField(10);        //���������
	  JButton jbok=new JButton("��½");
	  JButton jbcancel=new JButton("����");
	  JButton jbclose=new JButton("ȡ��");
	  jlname.setBounds(60,40,60,20);
	  jlpass.setBounds(60,70,60,20);
	  jtname.setBounds(120,40,90,20);
	  jtpass.setBounds(120,70,90,20);
	  jbok.setBounds(50,110,60,20);
	  jbcancel.setBounds(120,110,60,20);
	  jbclose.setBounds(190,110,60,20);
	  Container cp=this.getContentPane();
	  setLocationRelativeTo(null);      //������ʾ,ǿ!!
	  cp.setLayout(null);
	  cp.add(jlname);
	  cp.add(jlpass);
	  cp.add(jtname);
	  cp.add(jtpass);
	  cp.add(jbok);
	  cp.add(jbcancel);
	  cp.add(jbclose);
	  jbok.addActionListener(new MyAction(this));
	  jbcancel.addActionListener(new MyAction(this));
	  jbclose.addActionListener(new MyAction(this));
  }
  public void jbok(ActionEvent evt){
	  // ��ѯ���ݿ��Ƿ�������������û�����������ƥ����û����������½�ɹ�
	  if(ispass(jtname.getText(),jtpass.getText())){
		  JOptionPane.showMessageDialog(null,"��½�ɹ�");
		  this.setVisible(false);
		     Mainplace mp=new Mainplace();  //��½�ɹ�,�������������
			mp.setVisible(true);             //��ʾ���������
	  }
	  else JOptionPane.showMessageDialog(null,"�û������������,����������");
	  jtname.setText("");                   //��½ʧ��,����ı��򲢽����ع鵽�����ı���
	  jtpass.setText("");
	  jtname.requestFocus();  
  }
  public void jbcancel(ActionEvent evt){        //���ť�¼�����
	  jtname.setText("");
	  jtpass.setText("");
	  jtname.requestFocus();
  }
  public void jbclose(ActionEvent evt){
	  System.exit(0);
  }
  public boolean ispass(String username,String password){
	  boolean ok=false;
	  try{
		  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		  Connection con=DriverManager.getConnection("jdbc:odbc:bussiness","","");
		 
		  String sql="select*from users where username='"+username+"'and password='"+password+"'";
		  Statement stmt= con.createStatement();
		  ResultSet rs=stmt.executeQuery(sql);
		  if(rs.next()){
			  ok=true;
		  }
		  rs.close();
		  stmt.close();
	      }catch(Exception e){
		  e.printStackTrace();
	  }
	  return ok;
  }

  class MyAction implements ActionListener{            //ActionListener �ӿ�ʵ��
	  Loginplace login=null;
	  public MyAction(Loginplace login){
		  this.login=login;
	  }
	  public void actionPerformed(ActionEvent evt){    //actionPerformed����  ����ʵ��
		  if(evt.getActionCommand().equals("��½")){
			  login.jbok(evt);
		 }else if(evt.getActionCommand().equals("����")){
			 login.jbcancel(evt);
		 }else if(evt.getActionCommand().equals("ȡ��")){
			 login.jbclose(evt);
		 }
	  }
  }
}
