package renshi;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
public class Searchplace extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel jlno;
	JTextField jtno;
	JButton jbsearch1;

	
	public Searchplace(){
		this.setTitle("员工查询");
		this.setSize(300,200);
		jlno=new JLabel("员工姓名:");
		jtno=new JTextField();
		jbsearch1=new JButton("查找");





				
		jlno.setBounds(60,40,80,20);
		jtno.setBounds(150,40,80,20);
		jbsearch1.setBounds(90,100,100,20);

		Container cp=this.getContentPane();
	    setLocationRelativeTo(null);   
	    cp.setLayout(null);
		cp.add(jlno);
		cp.add(jtno);
		cp.add(jbsearch1);
		
		
	
	
        //添加监听器
		jbsearch1.addActionListener(this);

	}


public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
          String strs="";
		try {
			if(jbsearch1.getActionCommand().equals("查找")){
            Conn conn=new Conn();
            Statement stmt;
		    stmt = Conn.getConn().createStatement();
            String name1=jtno.getText();
          ResultSet rs = stmt.executeQuery("select * from employees where name='");
				while(rs.next()){
					strs=rs.getString("name")+"\n";
					strs=strs+rs.getString(2)+"\n";
					strs=strs+rs.getString(3)+"\n";
					strs=strs+rs.getString(4)+"\n";
					strs=strs+rs.getString(5)+"\n";
					strs=strs+rs.getString(6)+"\n";
					strs=strs+rs.getString(7)+"\n";
					strs=strs+rs.getString(8)+"\n";
					strs=strs+rs.getString(9)+"\n"; 
					strs=strs+rs.getString(10)+"\n";
				}
				
			JOptionPane.showMessageDialog(null,strs+"\n"+"结果");
				

			}} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
            
            
       
	 }
}
		

	
