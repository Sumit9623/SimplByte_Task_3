package hangman_game;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JOptionPane;

public class Man_Graphics extends Canvas
{
	Man_Graphics()
	{
		setSize(217,172);
		setVisible(true);
		repaint();
	}
	public void paint(Graphics g)
	{
		Graphics2D g2 =  (Graphics2D) g;
		g2.setStroke(new BasicStroke(4));
		Shape s1 = new Line2D.Float(20,20,180,20);
		Shape s2 = new Line2D.Float(100,20,100,50);
		Shape s3 = new Ellipse2D.Float(85,52,30,30);
		Shape s4 = new Line2D.Float(100,85,100,130);
		Shape s5 = new Line2D.Float(100,95,130,125);
		Shape s6 = new Line2D.Float(100,95,70,125);
		Shape s7 = new Line2D.Float(100,130,130,160);
		Shape s8 = new Line2D.Float(100,130,70,160);
		
		if(Frm.lives==8) {};
		if(Frm.lives<=7) g2.draw(s1);
		if(Frm.lives<=6) g2.draw(s2);
		if(Frm.lives<=5) g2.draw(s3);
		if(Frm.lives<=4) g2.draw(s4);
		if(Frm.lives<=3) g2.draw(s5);
		if(Frm.lives<=2) g2.draw(s6);
		if(Frm.lives<=1) g2.draw(s7);
		if(Frm.lives<=0) g2.draw(s8);
		
	}
}
