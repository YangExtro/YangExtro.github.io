package renshi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Aboutplace extends JFrame {
	
public Aboutplace(){
	this.setResizable(false); 
  	this.setTitle("关于 第一大队人事管理系统");
  	this.setSize(400,200);

  	JLabel jlmaker=new JLabel("作   者:第一大队    QQ:307499631");
    JLabel jladd=new JLabel("  长春网络联合创意中心");
    JLabel jlmail=new JLabel("Email:   jsqqing@163.com");
	JButton jbline=new JButton("");  
	JLabel jlcopy=new JLabel("CopyRight 2009-2109 CCNIC Corporation,All Rights Reserved");
	JButton jbok=new JButton("");
	
    jlmaker.setBounds(200,40,220,20);
    jladd.setBounds(230,60,220,20);
    jlmail.setBounds(200,80,220,20);
	jbline.setBounds(10,120,375,1);
	jlcopy.setBounds(20,125,375,20);
	jbok.setBounds(40,20,80,80);
        
    Container cppp=this.getContentPane();
    setLocationRelativeTo(null);   
    cppp.setLayout(null);
  	cppp.add(jlmaker);
  	cppp.add(jladd);
  	cppp.add(jlmail);
  	cppp.add(jbline);
  	cppp.add(jlcopy);
  	cppp.add(jbok);
  	
  	jbok.addActionListener(new MyAction(this));
    }
public void jbok(ActionEvent evt){
	this.setVisible(false);
}
class MyAction implements ActionListener{
	Aboutplace abp=null;
	public MyAction(Aboutplace abp){
		this.abp=abp;
	}
	public void actionPerformed(ActionEvent evt){
	        abp.jbok(evt);
	}
}
}