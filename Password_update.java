package renshi;

import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;

//import renshiadmin.Worker_info_add.MyAction;

public class Password_update extends JFrame{

	JPasswordField jpoldpsd;
	JPasswordField jpnewpsd;
	JPasswordField jpnewpsd2;
	JButton jbok,jbcancel,jbclose;
public Password_update(){
	    this.setResizable(false);              //����̶���С
	    this.setTitle("�޸�����");
	    this.setSize(280,200);
	
	    JLabel jloldpsd=new JLabel("ԭ    ��    ��:");
	    JLabel jlnewpsd=new JLabel("��    ��    ��:");
    	JLabel jlnewpsd2=new JLabel("ȷ��������:");
    	jbok=new JButton("ȷ��");
	    jbcancel=new JButton("����");
	    jbclose=new JButton("ȡ��");
	    
	    jpoldpsd=new JPasswordField();
	    jpnewpsd=new JPasswordField();
	    jpnewpsd2=new JPasswordField();
		
	    jloldpsd.setBounds(40,20,70,20);
	    jlnewpsd.setBounds(40,50,70,20);
	    jlnewpsd2.setBounds(40,80,70,20);
	    jpoldpsd.setBounds(120,20,110,20);
	    jpnewpsd.setBounds(120,50,110,20);
	    jpnewpsd2.setBounds(120,80,110,20);
	    jbok.setBounds(30,120,60,20);
	    jbcancel.setBounds(105,120,60,20);
	    jbclose.setBounds(180,120,60,20);
	    
	    Container addcp=this.getContentPane();
		setLocationRelativeTo(null);         //������ʾ
		  addcp.setLayout(null);
		  addcp.add(jloldpsd);
		  addcp.add(jlnewpsd);
		  addcp.add(jlnewpsd2);
		  addcp.add(jpoldpsd);
		  addcp.add(jpnewpsd);
		  addcp.add(jpnewpsd2);
		  addcp.add(jbok);
		  addcp.add(jbcancel);
		  addcp.add(jbclose);
		  
		  jbok.addActionListener(new MyAction(this));
		  jbcancel.addActionListener(new MyAction(this));
		  jbclose.addActionListener(new MyAction(this));
		  
	}
public void jbok(ActionEvent evt){
	String snewpsd1,snewpsd2;
	snewpsd1=jpnewpsd.getText();
	snewpsd2=jpnewpsd2.getText();
	if (snewpsd1!=snewpsd2){
		JOptionPane.showMessageDialog(null,"��������������벻��ͬ������������");
	}
	else{
	//��user�����û���ͬtemp��ƥ�����password��jpoldpsd.getText()��Ƚ�
	//����ͬ��user�����û���Ϊtemp��user��password��Ϊjpnewpsd.getText()
	//������ͬ�򱨴�
	}
}
public void jbcancel(ActionEvent evt){

	jpoldpsd.setText("");
	jpnewpsd.setText("");
	jpnewpsd2.setText("");
	jpoldpsd.requestFocus();

}
public void jbclose(ActionEvent evt){
	this.setVisible(false);
}
class MyAction implements ActionListener{
	Password_update pwup=null;
	public MyAction(Password_update pwup){
		 this.pwup=pwup;
	 }
	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals("���")){
			pwup.jbok(evt);
		 }else if(evt.getActionCommand().equals("����")){
			 pwup.jbcancel(evt);
		 }else if(evt.getActionCommand().equals("ȡ��")){
			 pwup.jbclose(evt);
	}
}
}
}
