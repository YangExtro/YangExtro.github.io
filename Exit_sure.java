package renshi;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exit_sure extends JFrame{
		public Exit_sure(){
				
				this.setTitle("ȷ���˳�");
				this.setSize(240,170);
				
				JLabel jlhelp=new JLabel("ȷ��Ҫ�˳����¹���ϵͳ��?");
				JButton jbok=new JButton("ȷ��");
				JButton jbcancel=new JButton("ȡ��");
				
				jlhelp.setBounds(40,30,320,20);
				jbok.setBounds(50,90,60,20);
				jbcancel.setBounds(120,90,60,20);

				
				Container cpp=this.getContentPane();
				setLocationRelativeTo(null);         //������ʾ
				cpp.setLayout(null);
				cpp.add(jlhelp);
				cpp.add(jbok);
				cpp.add(jbcancel);
				
		    	jbok.addActionListener(new MyAction(this));
		    	jbcancel.addActionListener(new MyAction(this));

			}
		public void jbok(ActionEvent evt){
			System.exit(0);
		}
		public void jbcancel(ActionEvent evt){
			this.setVisible(false);
		}
		class MyAction implements ActionListener{
			Exit_sure exs=null;
			public MyAction(Exit_sure exs){
				this.exs=exs;
			}
			public void actionPerformed(ActionEvent evt){
				if(evt.getActionCommand().equals("ȷ��")){
					exs.jbok(evt);
				}
				else if(evt.getActionCommand().equals("ȡ��")){
					exs.jbcancel(evt);
				}
			}
		}
}

