package database;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import database.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase_view extends Frame implements ActionListener, WindowListener{


	
	public DataBase_view() {
		int id,ton;
		String name,year;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();
		addWindowListener(this);
		setTitle("Graph");
		setLayout(new FlowLayout(FlowLayout.CENTER));

		DefaultCategoryDataset data = new DefaultCategoryDataset();
		
		try {
			while(rs.next()){
			    id = rs.getInt("id");
			    name = rs.getString("name");
			    year = rs.getString("year");
			    ton = rs.getInt("ton");
			    System.out.println("ID：" + id);
			    System.out.println("name：" + name);
			    System.out.println("year：" + year);
			    System.out.println("ton：" + ton);
			    data.addValue(+ ton, ""+ name, ""+ year);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*data.addValue(300,"USA","2005");
        data.addValue(500, "USA", "2006");
        data.addValue(120, "USA", "2007");

        data.addValue(200, "China", "2005");
        data.addValue(400, "China", "2006");
        data.addValue(320, "China", "2007");
        */
		JFreeChart chart = 
	     ChartFactory.createBarChart3D("Import Volume","Year","Ton",data,PlotOrientation.VERTICAL,true,false,false);

	    ChartPanel cpanel = new ChartPanel(chart);
	    add(cpanel, BorderLayout.CENTER);
	    


	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

	}


}
