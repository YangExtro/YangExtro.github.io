package renshi;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Mainplace extends JFrame {
	
	public Mainplace(){
		this.setTitle("������Ϣ����ϵͳ");	
		this.setResizable(false);
		this.setSize(1024,740);
//		setExtendedState(this.MAXIMIZED_BOTH);         //�����ʾ

		Container cppp=this.getContentPane();
	    setLocationRelativeTo(null);   
	    cppp.setLayout(null);
	    ImageIcon image=new ImageIcon("D://back.jpg");
	    JLabel jlabel=new JLabel(image);
	    jlabel.setBounds(0,0,1024,760);
	    cppp.add(jlabel);
	   
	    
	    //cppp.setBackground(Color.blue);
	
	  
		JMenuBar jmb=new JMenuBar();


     
		JMenu jmsys=new JMenu("ϵͳ����(S)");         //ϵͳ����˵���
		JMenu jminfo=new JMenu("Ա����Ϣ����");        //Ա����Ϣ����˵���
		JMenu jmsly=new JMenu("���ʹ���");            //���ʹ���˵���
		JMenu jmtrd=new JMenu("��ѵ����");            //��ѵ����˵���
		JMenu jmwelfare=new JMenu("�����ѹ���");          //�����ѹ���˵���
		JMenu jmpaint=new JMenu("��ӡ���ʱ���");       //��ӡ�˵���
		JMenu jmhelp=new JMenu("����");            //�����˵���
		
		//���ò˵���
		JMenuItem jitemadduser=new JMenuItem("����û�(T)");    //ϵͳ����˵�
		JMenuItem jitemupdatepsd=new JMenuItem("�޸�����");
		JMenuItem jitemdeluser=new JMenuItem("ɾ���û�");
		JMenuItem jitemexit=new JMenuItem("�˳�(X)");      //�˳�ϵͳ
		
		JMenuItem jitemhelp=new JMenuItem("����(H)");      //ϵͳ����
		JMenuItem jitemabout=new JMenuItem("����...(A)");  
		
		JMenuItem jitemaddworker=new JMenuItem("���Ա����Ϣ(T)");    //Ա����Ϣ����
		JMenuItem jitemsearchworker=new JMenuItem("��ѯԱ����Ϣ(F)");    
		JMenuItem jitemdeleteworker=new JMenuItem("ɾ��Ա����Ϣ(D)"); 
		
		JMenuItem jitemaddtrd=new JMenuItem("�����ѵ��Ϣ(T)");    //��ѵ��Ϣ����
		JMenuItem jitemsearchtrd=new JMenuItem("��ѯ��ѵ��Ϣ(F)");    
		JMenuItem jitemedittrd=new JMenuItem("�༭��ѵ��Ϣ(D)");  
		
		JMenuItem jitemaddwelfare=new JMenuItem("��Ӹ�����Ϣ(T)");    //������Ϣ����
		JMenuItem jitemeditwelfare=new JMenuItem("�༭������Ϣ(F)");    
		JMenuItem jitemsearchwelfare=new JMenuItem("��ѯ������Ϣ(D)"); 
		
		JMenuItem jitemaddsalary=new JMenuItem("��ӹ�����Ϣ(T)");    //Ա��������Ϣ����
		JMenuItem jitemeditsalary=new JMenuItem("�༭Ա����Ϣ(F)");    
		JMenuItem jitemsearchsalary=new JMenuItem("��ѯԱ����Ϣ(D)");
		
		
		
		//Ϊϵͳ������Ӳ˵���
		jmsys.add(jitemadduser);
		jmsys.add(jitemupdatepsd);
		jmsys.add(jitemdeluser);
		jmsys.add(jitemexit);
		//Ϊϵͳ������Ӳ˵���
		jminfo.add(jitemaddworker);
		jminfo.add(jitemsearchworker);
		jminfo.add(jitemdeleteworker);
		//Ϊ������Ӳ˵���
		jmhelp.add(jitemhelp);
		jmhelp.add(jitemabout);
		//Ϊ��ѵ��Ϣ��Ӳ˵���
		jmtrd.add(jitemaddtrd);
		jmtrd.add(jitemsearchtrd);
		jmtrd.add(jitemedittrd);
		//Ϊ������Ϣ��Ӳ˵���
		jmwelfare.add(jitemaddwelfare);
		jmwelfare.add(jitemeditwelfare);
		jmwelfare.add(jitemsearchwelfare);
		
		//Ϊ���ʹ�����Ӳ˵���
		jmsly.add(jitemaddsalary);
		jmsly.add(jitemeditsalary);
		jmsly.add(jitemsearchsalary);
		//���˵�����ӵ�����
		
		this.setJMenuBar(jmb);
		jmb.add(jmsys);
		jmb.add(jminfo);
		jmb.add(jmsly);
		jmb.add(jmtrd);
		jmb.add(jmwelfare);
		jmb.add(jmpaint);
		jmb.add(jmhelp);
		
		
		//��Ӽ�����
		jitemaddworker.addActionListener(new MyAction(this));
		jitemabout.addActionListener(new MyAction(this));
		jitemupdatepsd.addActionListener(new MyAction(this));
		jitemexit.addActionListener(new MyAction(this));
		jitemhelp.addActionListener(new MyAction(this));
		jitemdeluser.addActionListener(new MyAction(this));
		jitemsearchworker.addActionListener(new MyAction(this));
		jitemdeleteworker.addActionListener(new MyAction(this));

		
    	}
		
//		/����alt+?��ݼ�
//		jmsys.setMnemonic('S');
//		jminfo.setMnemonic('G');
//		jmhelp.setMnemonic('H');
//		jitemexit.setMnemonic('X');
//		jitemhelp.setMnemonic('H');
//		jitemadd.setMnemonic('T');
//		jitemsearch.setMnemonic('F');
//		jitemdelete.setMnemonic('D');
//		jitemabout.setMnemonic('A');
//		
		
		

	
	//"���"�˵����¼�
public void jitemaddworker(ActionEvent evt){
	Worker_info_add ad=new Worker_info_add();
	ad.setVisible(true);
}
	//�޸�����˵����¼�
public void jitemupdatepsd(ActionEvent evt){
	Password_update psdup=new Password_update();
	psdup.setVisible(true);
}
//Ա����ѯ�˵����¼�
public void jitemsearchworker(ActionEvent evt){
	Test1 sp=new Test1();
	sp.setVisible(true);
}
    //"����"�˵����¼�
public void jitemabout(ActionEvent evt){
	Aboutplace ab=new Aboutplace();
	ab.setVisible(true);
}
    //"�˳�"�˵����¼�
public void jitemexit(ActionEvent evt){
	Exit_sure exs=new Exit_sure();
	exs.setVisible(true);
}
    //"����"�˵����¼�
public void jitemhelp(ActionEvent evt){
	Helpplace hpp=new Helpplace();
	hpp.setVisible(true);
}
    //"��ѯ"�˵����¼�
public void jitemsearch(ActionEvent evt){
	Searchplace srp=new Searchplace();
	srp.setVisible(true);
}

class MyAction implements ActionListener{
	Mainplace mainp=null;
	  public MyAction(Mainplace mainp){
		  this.mainp=mainp;
	  }
	  public void actionPerformed(ActionEvent evt){    //actionPerformed����  ����ʵ��
         
		  
		  
		  if(evt.getActionCommand().equals("����û�(T)")){
			  mainp.jitemaddworker(evt);		
             }
          else if(evt.getActionCommand().equals("����...(A)")){
        	  mainp.jitemabout(evt);
          }
          else if(evt.getActionCommand().equals("�˳�(X)")){
        	  mainp.jitemexit(evt);
          }
          else if(evt.getActionCommand().equals("����(H)")){
        	  mainp.jitemhelp(evt);
          }
          else if(evt.getActionCommand().equals("��ѯ(F)")){
        	  mainp.jitemsearch(evt);
          }
          else if(evt.getActionCommand().equals("���Ա����Ϣ(T)")){
         	 mainp.jitemaddworker(evt);
          }
	      else if(evt.getActionCommand().equals("��ѯԱ����Ϣ(F)")){
     	      mainp.jitemsearchworker(evt);
      }
}

}
}
