import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Dhanush extends Frame implements Runnable, ActionListener
{	
	Thread t;
	Button j;
	Random ran;
	int a=190,b=390,c=380,d=388,e=387,f=183,l=215,h=222,p=200,q=201,i;
	Dhanush()
	{
		ran=new Random();
		t=new Thread(this);
		setSize(1300,700);
		setVisible(true);
		setLayout(null);
		j=new Button("Shoot");
		j.setBounds(300,550,50,25);
		add(j);
		j.addActionListener(this);
		//t.start();
	}

	public void actionPerformed(ActionEvent e)
	{
	
		t.start();
	}
	
	public void run()
	{
		/*for(i=0;i<=11;i++)
		{
			p+=5;
			q+=5;
			try
			{
					Thread.sleep(400);
			}
			catch(Exception e)
			{
			}
			repaint();
		}*/
		for(i=0;i<=152;i++)
		{
			while(i<12)
			{
				p+=5;
				q+=5;
				break;
			}
			a+=5;
			b+=5;
			c+=5;
			d+=5;
			e+=5;
			f+=5;
			l+=5;
			h+=5;
			
			try
			{
				Thread.sleep(4);
			}
			catch(Exception e)
			{
			}
			repaint();
		}
		
	}
	

	public void paint(Graphics g)
	{
		System.out.println(i);

		//   dhanush curved area


		
		setBackground(Color.blue);
		g.setColor(Color.white);
		g.drawArc(260,200,80,150,30,-50);
		g.drawArc(250,200,80,150,30,-50);
		g.drawArc(260,250,80,150,20,-60);
		g.drawArc(250,250,80,150,20,-60);
		g.drawArc(185,185,150,118,0,80);
		g.drawArc(175,185,150,118,0,80);
		g.drawArc(185,295,150,118,-370,-75);
		g.drawArc(175,295,150,118,-370,-75);
		g.drawArc(215,75,190,115,208,40);
		g.drawArc(205,75,190,115,208,40);
		g.drawArc(215,407,190,115,100,60);
		g.drawArc(205,407,190,115,100,60);


		//  Line

		g.drawLine(p,300,260,180);
		g.drawLine(q,300,261,180);

		g.drawLine(p,301,260,415);
		g.drawLine(q,301,261,415);



		//   Arrow


		g.drawLine(a,300,b,300);
		g.drawLine(c,290,b,300);
		g.drawLine(c,290,d,300);
		g.drawLine(c,310,b,300);
		g.drawLine(c,310,d,300);
		
		g.drawLine(a,299,e,299);
		g.drawLine(a,301,e,301);

		g.drawLine(f,293,a,300);
		g.drawLine(f,293,l,293);
		g.drawLine(l,293,h,300);
		g.drawLine(f,307,a,300);
		g.drawLine(f,307,l,307);
		g.drawLine(l,307,h,300);


		//  Goal

		g.drawOval(1100,230,100,140);
		g.drawOval(1115,240,70,120);
		g.drawOval(1130,250,40,100);
		g.setColor(Color.red);
		g.fillOval(1145,280,10,40);


		if(i==153)
		{
			g.setColor(Color.green);
			g.fillOval(1145,280,10,40);

		}

	}
	public static void main(String[] args) 
	{
		new Dhanush();
	}
}
