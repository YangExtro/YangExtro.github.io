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
	
	JTextField jtname;   //定义姓名文本框
	JTextField jtbirth;  //定义生日文本框
	JRadioButton jrbsexmale;     //定义性别单选按扭：男
	JRadioButton jrbsexfemale;    //女
	JComboBox jcmarriage;   //定义婚姻状况下拉框
	JComboBox jcedu;    //定义学历下拉框
	JComboBox jcpostevent;  //定义在职情况下拉框
	JTextField jtpost;        //定义岗位下拉框
	JTextField jtwage;       //定义工资文本框
	JTextField jtfuli;       //定义福利文本框
	JRadioButton jrbtrayes;     //定义培训单选按钮：是
	JRadioButton jrbtrano;    //否
	JButton jbline;
	JButton jbok,jbcancel,jbclose;

 public Worker_info_add(){
		this.setResizable(false);              //窗体固定大小
		this.setTitle("员工信息添加");
		this.setSize(400,500);
		
		JLabel jlname=new JLabel("姓        名:");
		JLabel jlsex=new JLabel("性        别:");
		JLabel jlbirth=new JLabel("出生年月:");
		JLabel jlmarriage=new JLabel("婚姻状况:");
		JLabel jledu=new JLabel("学        历:");
		JLabel jlpostevent=new JLabel("在岗情况:");
		JLabel jlpost=new JLabel("现任职位:");
		JLabel jlwage=new JLabel("月        薪:");
		JLabel jltra=new JLabel("是否培训:");
		JLabel jlfuli=new JLabel("福        利:");

		jbok=new JButton("添加");
		jbcancel = new JButton("重填");
		jbclose=new JButton("取消");
		jbline=new JButton();
		jtname=new JTextField();
		jtbirth=new JTextField();
		jrbsexmale=new JRadioButton("男");
		jrbsexfemale=new JRadioButton("女");
		
		jcedu=new JComboBox();
		jcpostevent=new JComboBox();
		jtpost=new JTextField();
		jtwage=new JTextField();
		jtfuli=new JTextField();
		jrbtrayes=new JRadioButton("已");
		jrbtrano=new JRadioButton("未");
		jcmarriage=new JComboBox();
		//为婚姻状况添加选项
		jcmarriage.addItem("");
		jcmarriage.addItem("未婚");
		jcmarriage.addItem("已婚");
		jcmarriage.addItem("离异");
		
		//为学历下拉框添加选项
		jcedu.addItem("");
		jcedu.addItem("高中以下");
		jcedu.addItem("高中");
		jcedu.addItem("专科");
		jcedu.addItem("本科");
		jcedu.addItem("硕士");
		jcedu.addItem("博士");
		jcedu.addItem("博士以上");
		//为在岗情况添加选项
		jcpostevent.addItem("在职");
		jcpostevent.addItem("休假");
		jcpostevent.addItem("辞职");
		jcpostevent.addItem("辞退");
		jcpostevent.addItem("退休");
		
		//为单选框分组
		ButtonGroup bgsex=new ButtonGroup();
		  bgsex.add(jrbsexmale);
		  bgsex.add(jrbsexfemale);
		  jrbsexmale.setSelected(true);    //默认选中男性
		ButtonGroup bgtra=new ButtonGroup();
		  bgtra.add(jrbtrayes);
		  bgtra.add(jrbtrano);
		  jrbtrano.setSelected(true);     //默认选中否
		  
		//设置bounds
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
		setLocationRelativeTo(null);    //居中显示,强!!
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
		   //添加jcpostevent监听器
		  jcpostevent.addItemListener(
				  new ItemListener(){
					  public void itemStateChanged(ItemEvent e){
						  if(e.getItem().equals("在职")||e.getItem().equals("休假")){
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
    	ssex="男";}
    else ssex="女";
    smarriage=(String)jcmarriage.getSelectedItem();
	sedu=(String)jcedu.getSelectedItem();
	sbirth=jtbirth.getText();
	spostevent=(String)jcpostevent.getSelectedItem();
	spost=jtpost.getText();
	swage=jtwage.getText();
	if(jrbtrayes.isSelected()){
		stra="是";}
	else stra="否";
	sfuli=jtfuli.getText();
	
	if(sname.equals("")||ssex.equals("")||sbirth.equals("")||sedu.equals("")||smarriage.equals("")||stra.equals("")||sfuli.equals("")||spostevent.equals("")){
		JOptionPane.showMessageDialog(null,"添加失败:必填信息未满");
	}
	else{
	str="姓名:"+sname+"\n";
	str=str+"性别:"+ssex+"\n";
	str=str+"出生年月:"+sbirth+"\n";
	str=str+"学历:"+sedu+"\n";
	str=str+"婚姻状况:"+smarriage+"\n";
	str=str+"在职情况:"+spostevent+"\n";
	str=str+"职位:"+spost+"\n";
	str=str+"工资:"+swage+"\n";
	str=str+"是否培训:"+stra+"\n";
	str=str+"享受福利:"+sfuli+"\n";
	
	
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
			   JOptionPane.showMessageDialog(null,str+"\n"+"添加成功");
			   jbcancel(evt);
		   }
		   else{
			   JOptionPane.showMessageDialog(null,"添加失败");
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
		if(evt.getActionCommand().equals("添加")){
			wiap.jbok(evt);
		 }else if(evt.getActionCommand().equals("重填")){
			 wiap.jbcancel(evt);
		 }else if(evt.getActionCommand().equals("取消")){
			 wiap.jbclose(evt);
	}
}
}
}
