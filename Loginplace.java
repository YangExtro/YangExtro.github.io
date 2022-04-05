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
	JPasswordField jtpass; //由于多处调用所以在方法外声明
	String jtemp;    //用户名备份
  public Loginplace (){
	  this.setResizable(false);             //窗体固定大小
	  this.setTitle("管理员登陆");
	  this.setSize(300,200);
	  JLabel jlname=new JLabel("用户名:");   //用户名标签
	  JLabel jlpass=new JLabel("密码:");//password 标签
	  jtname=new JTextField();              //用户名文本框
	  jtpass=new JPasswordField(10);        //密码输入框
	  JButton jbok=new JButton("登陆");
	  JButton jbcancel=new JButton("重填");
	  JButton jbclose=new JButton("取消");
	  jlname.setBounds(60,40,60,20);
	  jlpass.setBounds(60,70,60,20);
	  jtname.setBounds(120,40,90,20);
	  jtpass.setBounds(120,70,90,20);
	  jbok.setBounds(50,110,60,20);
	  jbcancel.setBounds(120,110,60,20);
	  jbclose.setBounds(190,110,60,20);
	  Container cp=this.getContentPane();
	  setLocationRelativeTo(null);      //居中显示,强!!
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
	  // 查询数据库是否存在与所输入用户名与密码想匹配的用户，若有则登陆成功
	  if(ispass(jtname.getText(),jtpass.getText())){
		  JOptionPane.showMessageDialog(null,"登陆成功");
		  this.setVisible(false);
		     Mainplace mp=new Mainplace();  //登陆成功,创建主窗体对象
			mp.setVisible(true);             //显示主窗体对象
	  }
	  else JOptionPane.showMessageDialog(null,"用户名或密码错误,请重新输入");
	  jtname.setText("");                   //登陆失败,清空文本框并将光标回归到姓名文本框
	  jtpass.setText("");
	  jtname.requestFocus();  
  }
  public void jbcancel(ActionEvent evt){        //重填按钮事件声明
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

  class MyAction implements ActionListener{            //ActionListener 接口实现
	  Loginplace login=null;
	  public MyAction(Loginplace login){
		  this.login=login;
	  }
	  public void actionPerformed(ActionEvent evt){    //actionPerformed方法  必须实现
		  if(evt.getActionCommand().equals("登陆")){
			  login.jbok(evt);
		 }else if(evt.getActionCommand().equals("重填")){
			 login.jbcancel(evt);
		 }else if(evt.getActionCommand().equals("取消")){
			 login.jbclose(evt);
		 }
	  }
  }
}
