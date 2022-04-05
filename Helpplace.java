package renshi;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Helpplace extends JFrame{
	public Helpplace(){
		
		this.setTitle("系统帮助");
		this.setSize(360,200);
		
		JLabel jlhelp=new JLabel("这么简单的小小小程序还要看帮助啊???自己研究去!!!");
		JButton jbok=new JButton("哦...");

		jlhelp.setBounds(20,40,320,20);
		jbok.setBounds(120,100,120,40); 

		
		
		Container cpp=this.getContentPane();
		setLocationRelativeTo(null);      //居中显示,强!!
		cpp.setLayout(null);
		cpp.add(jlhelp);
		cpp.add(jbok);

//		cpp.addSeparator();
		
		jbok.addActionListener(new MyAction(this));

	}
//"哦"按钮事件
public void jbok(ActionEvent evt){
	this.setVisible(false);
}
class MyAction implements ActionListener{
	Helpplace helpp=null;
	public MyAction(Helpplace helpp){
		this.helpp=helpp;
	}
	 public void actionPerformed(ActionEvent evt){
		 helpp.jbok(evt);
}
}
}
