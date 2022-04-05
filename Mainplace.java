package renshi;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Mainplace extends JFrame {
	
	public Mainplace(){
		this.setTitle("人事信息管理系统");	
		this.setResizable(false);
		this.setSize(1024,740);
//		setExtendedState(this.MAXIMIZED_BOTH);         //最大化显示

		Container cppp=this.getContentPane();
	    setLocationRelativeTo(null);   
	    cppp.setLayout(null);
	    ImageIcon image=new ImageIcon("D://back.jpg");
	    JLabel jlabel=new JLabel(image);
	    jlabel.setBounds(0,0,1024,760);
	    cppp.add(jlabel);
	   
	    
	    //cppp.setBackground(Color.blue);
	
	  
		JMenuBar jmb=new JMenuBar();


     
		JMenu jmsys=new JMenu("系统管理(S)");         //系统管理菜单项
		JMenu jminfo=new JMenu("员工信息管理");        //员工信息管理菜单项
		JMenu jmsly=new JMenu("工资管理");            //工资管理菜单项
		JMenu jmtrd=new JMenu("培训管理");            //培训管理菜单项
		JMenu jmwelfare=new JMenu("福利费管理");          //福利费管理菜单项
		JMenu jmpaint=new JMenu("打印工资报表");       //打印菜单项
		JMenu jmhelp=new JMenu("帮助");            //帮助菜单项
		
		//设置菜单项
		JMenuItem jitemadduser=new JMenuItem("添加用户(T)");    //系统管理菜单
		JMenuItem jitemupdatepsd=new JMenuItem("修改密码");
		JMenuItem jitemdeluser=new JMenuItem("删除用户");
		JMenuItem jitemexit=new JMenuItem("退出(X)");      //退出系统
		
		JMenuItem jitemhelp=new JMenuItem("帮助(H)");      //系统帮助
		JMenuItem jitemabout=new JMenuItem("关于...(A)");  
		
		JMenuItem jitemaddworker=new JMenuItem("添加员工信息(T)");    //员工信息管理
		JMenuItem jitemsearchworker=new JMenuItem("查询员工信息(F)");    
		JMenuItem jitemdeleteworker=new JMenuItem("删除员工信息(D)"); 
		
		JMenuItem jitemaddtrd=new JMenuItem("添加培训信息(T)");    //培训信息管理
		JMenuItem jitemsearchtrd=new JMenuItem("查询培训信息(F)");    
		JMenuItem jitemedittrd=new JMenuItem("编辑培训信息(D)");  
		
		JMenuItem jitemaddwelfare=new JMenuItem("添加福利信息(T)");    //福利信息管理
		JMenuItem jitemeditwelfare=new JMenuItem("编辑福利信息(F)");    
		JMenuItem jitemsearchwelfare=new JMenuItem("查询福利信息(D)"); 
		
		JMenuItem jitemaddsalary=new JMenuItem("添加工资信息(T)");    //员工工资信息管理
		JMenuItem jitemeditsalary=new JMenuItem("编辑员工信息(F)");    
		JMenuItem jitemsearchsalary=new JMenuItem("查询员工信息(D)");
		
		
		
		//为系统管理添加菜单项
		jmsys.add(jitemadduser);
		jmsys.add(jitemupdatepsd);
		jmsys.add(jitemdeluser);
		jmsys.add(jitemexit);
		//为系统管理添加菜单项
		jminfo.add(jitemaddworker);
		jminfo.add(jitemsearchworker);
		jminfo.add(jitemdeleteworker);
		//为帮助添加菜单项
		jmhelp.add(jitemhelp);
		jmhelp.add(jitemabout);
		//为培训信息添加菜单项
		jmtrd.add(jitemaddtrd);
		jmtrd.add(jitemsearchtrd);
		jmtrd.add(jitemedittrd);
		//为福利信息添加菜单项
		jmwelfare.add(jitemaddwelfare);
		jmwelfare.add(jitemeditwelfare);
		jmwelfare.add(jitemsearchwelfare);
		
		//为工资管理添加菜单项
		jmsly.add(jitemaddsalary);
		jmsly.add(jitemeditsalary);
		jmsly.add(jitemsearchsalary);
		//将菜单栏添加到窗体
		
		this.setJMenuBar(jmb);
		jmb.add(jmsys);
		jmb.add(jminfo);
		jmb.add(jmsly);
		jmb.add(jmtrd);
		jmb.add(jmwelfare);
		jmb.add(jmpaint);
		jmb.add(jmhelp);
		
		
		//添加监听器
		jitemaddworker.addActionListener(new MyAction(this));
		jitemabout.addActionListener(new MyAction(this));
		jitemupdatepsd.addActionListener(new MyAction(this));
		jitemexit.addActionListener(new MyAction(this));
		jitemhelp.addActionListener(new MyAction(this));
		jitemdeluser.addActionListener(new MyAction(this));
		jitemsearchworker.addActionListener(new MyAction(this));
		jitemdeleteworker.addActionListener(new MyAction(this));

		
    	}
		
//		/设置alt+?快捷键
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
		
		

	
	//"添加"菜单项事件
public void jitemaddworker(ActionEvent evt){
	Worker_info_add ad=new Worker_info_add();
	ad.setVisible(true);
}
	//修改密码菜单项事件
public void jitemupdatepsd(ActionEvent evt){
	Password_update psdup=new Password_update();
	psdup.setVisible(true);
}
//员工查询菜单项事件
public void jitemsearchworker(ActionEvent evt){
	Test1 sp=new Test1();
	sp.setVisible(true);
}
    //"关于"菜单项事件
public void jitemabout(ActionEvent evt){
	Aboutplace ab=new Aboutplace();
	ab.setVisible(true);
}
    //"退出"菜单项事件
public void jitemexit(ActionEvent evt){
	Exit_sure exs=new Exit_sure();
	exs.setVisible(true);
}
    //"帮助"菜单项事件
public void jitemhelp(ActionEvent evt){
	Helpplace hpp=new Helpplace();
	hpp.setVisible(true);
}
    //"查询"菜单项事件
public void jitemsearch(ActionEvent evt){
	Searchplace srp=new Searchplace();
	srp.setVisible(true);
}

class MyAction implements ActionListener{
	Mainplace mainp=null;
	  public MyAction(Mainplace mainp){
		  this.mainp=mainp;
	  }
	  public void actionPerformed(ActionEvent evt){    //actionPerformed方法  必须实现
         
		  
		  
		  if(evt.getActionCommand().equals("添加用户(T)")){
			  mainp.jitemaddworker(evt);		
             }
          else if(evt.getActionCommand().equals("关于...(A)")){
        	  mainp.jitemabout(evt);
          }
          else if(evt.getActionCommand().equals("退出(X)")){
        	  mainp.jitemexit(evt);
          }
          else if(evt.getActionCommand().equals("帮助(H)")){
        	  mainp.jitemhelp(evt);
          }
          else if(evt.getActionCommand().equals("查询(F)")){
        	  mainp.jitemsearch(evt);
          }
          else if(evt.getActionCommand().equals("添加员工信息(T)")){
         	 mainp.jitemaddworker(evt);
          }
	      else if(evt.getActionCommand().equals("查询员工信息(F)")){
     	      mainp.jitemsearchworker(evt);
      }
}

}
}
