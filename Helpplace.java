package renshi;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Helpplace extends JFrame{
	public Helpplace(){
		
		this.setTitle("ϵͳ����");
		this.setSize(360,200);
		
		JLabel jlhelp=new JLabel("��ô�򵥵�ССС����Ҫ��������???�Լ��о�ȥ!!!");
		JButton jbok=new JButton("Ŷ...");

		jlhelp.setBounds(20,40,320,20);
		jbok.setBounds(120,100,120,40); 

		
		
		Container cpp=this.getContentPane();
		setLocationRelativeTo(null);      //������ʾ,ǿ!!
		cpp.setLayout(null);
		cpp.add(jlhelp);
		cpp.add(jbok);

//		cpp.addSeparator();
		
		jbok.addActionListener(new MyAction(this));

	}
//"Ŷ"��ť�¼�
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
