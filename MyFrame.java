package clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	//Calendar calendar;
	SimpleDateFormat time;
	SimpleDateFormat day;
	SimpleDateFormat date;
	JLabel label;
	JLabel daylabel;
	JLabel datelabel;
	String t;
	String d;
	String dat;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(350,200);
		this.setLayout(new FlowLayout());
		this.setTitle("Clock");
		
		time=new SimpleDateFormat("hh:mm:ss a");
		day=new SimpleDateFormat("EEEE");
		date=new SimpleDateFormat("MMMMM dd, yyyy");
		
		label=new JLabel();
//		t=time.format(Calendar.getInstance().getTime());
//		label.setText(t);
		label.setFont(new Font("Verdana",Font.PLAIN,50));
		label.setForeground(new Color(0x00ff000));
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		daylabel=new JLabel();
		daylabel.setFont(new Font("Verdana",Font.PLAIN,35));
		
		datelabel=new JLabel();
		datelabel.setFont(new Font("Verdana",Font.PLAIN,25));
		
		this.add(label);
		this.add(daylabel);
		this.add(datelabel);
		this.setVisible(true);
		setTime();
	}
	public void setTime() {
		while(true) {
		t=time.format(Calendar.getInstance().getTime());
		label.setText(t);
		
		d=day.format(Calendar.getInstance().getTime());
		daylabel.setText(d);
		
		dat=date.format(Calendar.getInstance().getTime());
		datelabel.setText(dat);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
