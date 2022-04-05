package renshi;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Test1  extends JFrame {
public	 static  JTextField a1;
	   JButton a2;
	 public  Test1(){
		 JLabel a3=new JLabel("请输入用户ID");
		 Container addcp=this.getContentPane(); 
		this.setSize(300,200); 
		a1=new JTextField();
		 a2=new JButton("查询");
		a3.setBounds(60, 40 ,100,20);
		a1.setBounds(170, 40, 100, 20);
		a2.setBounds(120, 80,60,30);
		addcp.setLayout(null);
		addcp.add(a2); 
		addcp.add(a1);
		addcp.add(a3);
		a2.addActionListener(new My11(this));
	 }

	
	
}


class My11 implements ActionListener {
	Test1 c;
	String cc;
	   public My11(Test1 a){
		  this.c=a;  
		this.cc=  c.a1.getText() ;
		   
	   }

	public void actionPerformed(ActionEvent evt) {
	if(evt.getActionCommand().equals("查询")){
		Connection conn = null;
		Statement rs;
		ResultSet  cs;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:bussiness","","");
			rs=conn.createStatement();
		    cs=	rs.executeQuery("select * from worker where worker_name='"+cc+"'");
		while(cs.next()) {
			String str;
		String d=	cs.getString(1);
		String d2=	cs.getString(2);
		String d3=	cs.getString(3);
		String d4=	cs.getString(4);
		String d5=	cs.getString(5);
		String d6=	cs.getString(6);
		String d7=	cs.getString(7);
		String d8=	cs.getString(8);
		String d9=	cs.getString(9);
		String d10=	cs.getString(10);
		String d11=	cs.getString(11);
		String d12=	cs.getString(12);
		String d13=	cs.getString(13);
		str="姓名:"+d+"\n";
		str=str+"I D:"+d2+"\n";
		str=str+"工资:"+d3+"\n";
		str=str+"年龄:"+d4+"\n";
		str=str+"民族:"+d5+d6+d7+"\n";
		str=str+"企业:"+d8+"\n";
		str=str+"年份:"+d9+"\n";
		str=str+"情况:"+d10+"\n";
		str=str+"联系人："+d11+"\n";
		str=str+"联系电话:"+d12+"\n";
		str=str+"备注:"+d13+"\n";
		JOptionPane.showMessageDialog(null,str);	
			
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	}

}

	
	
	
	

