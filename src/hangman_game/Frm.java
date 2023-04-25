package hangman_game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Canvas;

public class Frm extends JFrame implements ActionListener
{
	static int lives = 8;
	private static Frame fr;
	private JButton nxt,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m;
	private JLabel related,hidden,rem;
	private Main mna;
	private ArrayList<String> pr;
	private Man_Graphics mngrp;
	private JPanel contentPane,pnl_grp;
	StringBuilder titlestr;
	StringBuilder hiddenstr;
	StringBuilder userstr;
	public Frm() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mna = new Main();
		pr = mna.ret();
		
		titlestr = new StringBuilder(pr.get(0));
		hiddenstr = new StringBuilder(pr.get(1));
		userstr = new StringBuilder((pr.get(1).length()));
		for(int i=0;i<pr.get(1).length();i++) userstr.append('?');
		
		
		JPanel second = new JPanel();
		second.setBounds(328, 11, 217, 198);
		contentPane.add(second);
		second.setLayout(null);
		
		rem = new JLabel("8");
		rem.setHorizontalAlignment(SwingConstants.CENTER);
		rem.setFont(new Font("Verdana", Font.PLAIN, 15));
		rem.setBounds(128, 173, 79, 25);
		second.add(rem);
		
		JLabel chances = new JLabel("Chances :");
		chances.setFont(new Font("Verdana", Font.PLAIN, 15));
		chances.setHorizontalAlignment(SwingConstants.CENTER);
		chances.setBounds(10, 173, 108, 25);
		second.add(chances);
		
		pnl_grp = new JPanel();
		pnl_grp.setBounds(0, 0, 217, 171);
		second.add(pnl_grp);
		pnl_grp.setLayout(null);
		
		mngrp = new Man_Graphics();
		mngrp.setBounds(0, 0, 217, 172);
		pnl_grp.add(mngrp);
		
		JPanel first = new JPanel();
		first.setBounds(10, 11, 308, 186);
		contentPane.add(first);
		first.setLayout(null);
		
		JLabel title = new JLabel("HangMan Game");
		title.setForeground(new Color(95, 158, 160));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		title.setBounds(10, 11, 288, 39);
		first.add(title);
		
		related = new JLabel(titlestr.toString());
		related.setFont(new Font("Verdana", Font.PLAIN, 20));
		related.setHorizontalAlignment(SwingConstants.CENTER);
		related.setBounds(10, 61, 288, 31);
		first.add(related);
		
		nxt = new JButton("Next");
		nxt.setBackground(new Color(12, 113, 118));
		nxt.setForeground(Color.WHITE);
		nxt.setFocusable(false);
		nxt.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		nxt.setBounds(105, 144, 101, 31);
		first.add(nxt);
		
		hidden = new JLabel(userstr.toString());
		hidden.setHorizontalAlignment(SwingConstants.CENTER);
		hidden.setFont(new Font("Verdana", Font.PLAIN, 20));
		hidden.setBounds(10, 98, 288, 31);
		first.add(hidden);
		
		JPanel third = new JPanel();
		third.setBounds(10, 208, 536, 192);
		contentPane.add(third);
		third.setLayout(null);
		
		q = new JButton("Q");
		q.setFocusable(false);
		q.setForeground(new Color(202, 240, 208));
		q.setBackground(new Color(56, 167, 131));
		q.setFont(new Font("Verdana", Font.BOLD, 13));
		q.setBounds(10, 11, 48, 53);
		third.add(q);
		
		w = new JButton("W");
		w.setFocusable(false);
		w.setForeground(new Color(202, 240, 208));
		w.setBackground(new Color(56, 167, 131));
		w.setFont(new Font("Verdana", Font.BOLD, 13));
		w.setBounds(62, 11, 48, 53);
		third.add(w);
		
		e = new JButton("E");
		e.setFocusable(false);
		e.setForeground(new Color(202, 240, 208));
		e.setBackground(new Color(56, 167, 131));
		e.setFont(new Font("Verdana", Font.BOLD, 13));
		e.setBounds(113, 11, 48, 53);
		third.add(e);
		
		r = new JButton("R");
		r.setFocusable(false);
		r.setForeground(new Color(202, 240, 208));
		r.setBackground(new Color(56, 167, 131));
		r.setFont(new Font("Verdana", Font.BOLD, 13));
		r.setBounds(165, 11, 48, 53);
		third.add(r);
		
		t = new JButton("T");
		t.setFocusable(false);
		t.setForeground(new Color(202, 240, 208));
		t.setBackground(new Color(56, 167, 131));
		t.setFont(new Font("Verdana", Font.BOLD, 13));
		t.setBounds(216, 11, 48, 53);
		third.add(t);
		
		y = new JButton("Y");
		y.setFocusable(false);
		y.setForeground(new Color(202, 240, 208));
		y.setBackground(new Color(56, 167, 131));
		y.setFont(new Font("Verdana", Font.BOLD, 13));
		y.setBounds(268, 11, 48, 53);
		third.add(y);
		
		u = new JButton("U");
		u.setFocusable(false);
		u.setForeground(new Color(202, 240, 208));
		u.setBackground(new Color(56, 167, 131));
		u.setFont(new Font("Verdana", Font.BOLD, 13));
		u.setBounds(319, 11, 48, 53);
		third.add(u);
		
		i = new JButton("I");
		i.setFocusable(false);
		i.setForeground(new Color(202, 240, 208));
		i.setBackground(new Color(56, 167, 131));
		i.setFont(new Font("Verdana", Font.BOLD, 13));
		i.setBounds(371, 11, 48, 53);
		third.add(i);
		
		o = new JButton("O");
		o.setFocusable(false);
		o.setForeground(new Color(202, 240, 208));
		o.setBackground(new Color(56, 167, 131));
		o.setFont(new Font("Verdana", Font.BOLD, 13));
		o.setBounds(423, 11, 48, 53);
		third.add(o);
		
		p = new JButton("P");
		p.setFocusable(false);
		p.setForeground(new Color(202, 240, 208));
		p.setBackground(new Color(56, 167, 131));
		p.setFont(new Font("Verdana", Font.BOLD, 13));
		p.setBounds(476, 11, 48, 53);
		third.add(p);
		
		a = new JButton("A");
		a.setFocusable(false);
		a.setForeground(new Color(202, 240, 208));
		a.setBackground(new Color(56, 167, 131));
		a.setFont(new Font("Verdana", Font.BOLD, 13));
		a.setBounds(33, 71, 48, 53);
		third.add(a);
		
		s = new JButton("S");
		s.setFocusable(false);
		s.setForeground(new Color(202, 240, 208));
		s.setBackground(new Color(56, 167, 131));
		s.setFont(new Font("Verdana", Font.BOLD, 13));
		s.setBounds(84, 71, 48, 53);
		third.add(s);
		
		d = new JButton("D");
		d.setFocusable(false);
		d.setForeground(new Color(202, 240, 208));
		d.setBackground(new Color(56, 167, 131));
		d.setFont(new Font("Verdana", Font.BOLD, 13));
		d.setBounds(137, 71, 48, 53);
		third.add(d);
		
		f = new JButton("F");
		f.setFocusable(false);
		f.setForeground(new Color(202, 240, 208));
		f.setBackground(new Color(56, 167, 131));
		f.setFont(new Font("Verdana", Font.BOLD, 13));
		f.setBounds(190, 71, 48, 53);
		third.add(f);
		
		g = new JButton("G");
		g.setFocusable(false);
		g.setForeground(new Color(202, 240, 208));
		g.setBackground(new Color(56, 167, 131));
		g.setFont(new Font("Verdana", Font.BOLD, 13));
		g.setBounds(243, 71, 48, 53);
		third.add(g);
		
		h = new JButton("H");
		h.setFocusable(false);
		h.setForeground(new Color(202, 240, 208));
		h.setBackground(new Color(56, 167, 131));
		h.setFont(new Font("Verdana", Font.BOLD, 13));
		h.setBounds(296, 71, 48, 53);
		third.add(h);
		
		j = new JButton("J");
		j.setFocusable(false);
		j.setForeground(new Color(202, 240, 208));
		j.setBackground(new Color(56, 167, 131));
		j.setFont(new Font("Verdana", Font.BOLD, 13));
		j.setBounds(349, 71, 48, 53);
		third.add(j);
		
		k = new JButton("K");
		k.setFocusable(false);
		k.setForeground(new Color(202, 240, 208));
		k.setBackground(new Color(56, 167, 131));
		k.setFont(new Font("Verdana", Font.BOLD, 13));
		k.setBounds(401, 71, 48, 53);
		third.add(k);
		
		l = new JButton("L");
		l.setFocusable(false);
		l.setForeground(new Color(202, 240, 208));
		l.setBackground(new Color(56, 167, 131));
		l.setFont(new Font("Verdana", Font.BOLD, 13));
		l.setBounds(453, 71, 48, 53);
		third.add(l);
		
		z = new JButton("Z");
		z.setFocusable(false);
		z.setForeground(new Color(202, 240, 208));
		z.setBackground(new Color(56, 167, 131));
		z.setFont(new Font("Verdana", Font.BOLD, 13));
		z.setBounds(76, 130, 48, 53);
		third.add(z);
		
		x = new JButton("X");
		x.setFocusable(false);
		x.setForeground(new Color(202, 240, 208));
		x.setBackground(new Color(56, 167, 131));
		x.setFont(new Font("Verdana", Font.BOLD, 13));
		x.setBounds(127, 130, 48, 53);
		third.add(x);
		
		c = new JButton("C");
		c.setFocusable(false);
		c.setForeground(new Color(202, 240, 208));
		c.setBackground(new Color(56, 167, 131));
		c.setFont(new Font("Verdana", Font.BOLD, 13));
		c.setBounds(179, 130, 48, 53);
		third.add(c);
		
		v = new JButton("V");
		v.setFocusable(false);
		v.setForeground(new Color(202, 240, 208));
		v.setBackground(new Color(56, 167, 131));
		v.setFont(new Font("Verdana", Font.BOLD, 13));
		v.setBounds(230, 130, 48, 53);
		third.add(v);
		
		b = new JButton("B");
		b.setFocusable(false);
		b.setForeground(new Color(202, 240, 208));
		b.setBackground(new Color(56, 167, 131));
		b.setFont(new Font("Verdana", Font.BOLD, 13));
		b.setBounds(282, 130, 48, 53);
		third.add(b);
		
		n = new JButton("N");
		n.setFocusable(false);
		n.setForeground(new Color(202, 240, 208));
		n.setBackground(new Color(56, 167, 131));
		n.setFont(new Font("Verdana", Font.BOLD, 13));
		n.setBounds(333, 130, 48, 53);
		third.add(n);
		
		m = new JButton("M");
		m.setFocusable(false);
		m.setForeground(new Color(202, 240, 208));
		m.setBackground(new Color(56, 167, 131));
		m.setFont(new Font("Verdana", Font.BOLD, 13));
		m.setBounds(385, 130, 48, 53);
		third.add(m);
		add_com();
	}
	public void add_com()
	{
		nxt.addActionListener(this);
		q.addActionListener(this);
		w.addActionListener(this);
		e.addActionListener(this);
		r.addActionListener(this);
		t.addActionListener(this);
		y.addActionListener(this);
		u.addActionListener(this);
		i.addActionListener(this);
		o.addActionListener(this);
		p.addActionListener(this);
		a.addActionListener(this);
		s.addActionListener(this);
		d.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		z.addActionListener(this);
		x.addActionListener(this);
		c.addActionListener(this);
		v.addActionListener(this);
		b.addActionListener(this);
		n.addActionListener(this);
		m.addActionListener(this);	
	}
	public void check()
	{
		if(lives<=0) JOptionPane.showMessageDialog(this,"You Loose ...");
		else if(userstr.toString().equals(hiddenstr.toString())) JOptionPane.showMessageDialog(this,"You Win ...!");	
		
	}
	@Override
	public void actionPerformed(ActionEvent evn) 
	{
		if(evn.getSource()==nxt)
		{
			lives=8;
			pr = mna.ret();
			titlestr = new StringBuilder(pr.get(0));
			hiddenstr = new StringBuilder(pr.get(1));
			userstr = new StringBuilder((pr.get(1).length()));
			for(int i=0;i<pr.get(1).length();i++) userstr.append('?');
			related.setText(titlestr.toString());
			hidden.setText(userstr.toString());
			
			a.setText("A"); a.setBackground(new Color(56,167,131));
			b.setText("B"); b.setBackground(new Color(56,167,131));
			c.setText("C"); c.setBackground(new Color(56,167,131));
			d.setText("D"); d.setBackground(new Color(56,167,131));
			e.setText("E"); e.setBackground(new Color(56,167,131));
			f.setText("F"); f.setBackground(new Color(56,167,131));
			g.setText("G"); g.setBackground(new Color(56,167,131));
			h.setText("H"); h.setBackground(new Color(56,167,131));
			i.setText("I"); i.setBackground(new Color(56,167,131));
			j.setText("J"); j.setBackground(new Color(56,167,131));
			k.setText("K"); k.setBackground(new Color(56,167,131));
			l.setText("L"); l.setBackground(new Color(56,167,131));
			m.setText("M"); m.setBackground(new Color(56,167,131));
			n.setText("N"); n.setBackground(new Color(56,167,131));
			o.setText("O"); o.setBackground(new Color(56,167,131));
			p.setText("P"); p.setBackground(new Color(56,167,131));
			q.setText("Q"); q.setBackground(new Color(56,167,131));
			r.setText("R"); r.setBackground(new Color(56,167,131));
			s.setText("S"); s.setBackground(new Color(56,167,131));
			t.setText("T"); t.setBackground(new Color(56,167,131));
			u.setText("U"); u.setBackground(new Color(56,167,131));
			v.setText("V"); v.setBackground(new Color(56,167,131));
			w.setText("W"); w.setBackground(new Color(56,167,131));
			x.setText("X"); x.setBackground(new Color(56,167,131));
			y.setText("Y"); y.setBackground(new Color(56,167,131));
			z.setText("Z"); z.setBackground(new Color(56,167,131));

		}
		else if(evn.getSource()==a)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='A') 
				{
					userstr.setCharAt(i,'A');
					flag=true;
				}
			}
			if(flag)
			{
				a.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(a.getText()=="A")
			{
				a.setText("-");
				a.setBackground(Color.red);
				lives--;
			}
			
		}
		else if(evn.getSource()==b)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='B') 
				{
					userstr.setCharAt(i,'B');
					flag=true;
				}
			}
			if(flag)
			{
				b.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(b.getText()=="B")
			{
				lives--;
				b.setText("-");
				b.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==c)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='C') 
				{
					userstr.setCharAt(i,'C');
					flag=true;
				}
			}
			if(flag)
			{
				c.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(c.getText()=="C")
			{
				lives--;
				c.setText("-");
				c.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==d)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='D') 
				{
					userstr.setCharAt(i,'D');
					flag=true;
				}
			}
			if(flag)
			{
				d.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(d.getText()=="D")
			{
				lives--;
				d.setText("-");
				d.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==e)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='E') 
				{
					userstr.setCharAt(i,'E');
					flag=true;
				}
			}
			if(flag)
			{
				e.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(e.getText()=="E")
			{
				lives--;
				e.setText("-");
				e.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==f)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='F') 
				{
					userstr.setCharAt(i,'F');
					flag=true;
				}
			}
			if(flag)
			{
				f.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(f.getText()=="F")
			{
				lives--;
				f.setText("-");
				f.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==g)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='G') 
				{
					userstr.setCharAt(i,'G');
					flag=true;
				}
			}
			if(flag)
			{
				g.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(g.getText()=="G")
			{
				lives--;
				g.setText("-");
				g.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==h)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='H') 
				{
					userstr.setCharAt(i,'H');
					flag=true;
				}
			}
			if(flag)
			{
				h.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(h.getText()=="H")
			{
				lives--;
				h.setText("-");
				h.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==i)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='I') 
				{
					userstr.setCharAt(i,'I');
					flag=true;
				}
			}
			if(flag)
			{
				i.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(i.getText()=="I")
			{
				lives--;
				i.setText("-");
				i.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==j)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='J') 
				{
					userstr.setCharAt(i,'J');
					flag=true;
				}
			}
			if(flag)
			{
				j.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(j.getText()=="J")
			{
				lives--;
				j.setText("-");
				j.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==k)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='K') 
				{
					userstr.setCharAt(i,'K');
					flag=true;
				}
			}
			if(flag)
			{
				k.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(k.getText()=="K")
			{
				lives--;
				k.setText("-");
				k.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==l)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='L') 
				{
					userstr.setCharAt(i,'L');
					flag=true;
				}
			}
			if(flag)
			{
				l.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(l.getText()=="L")
			{
				lives--;
				l.setText("-");
				l.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==m)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='M') 
				{
					userstr.setCharAt(i,'M');
					flag=true;
				}
			}
			if(flag)
			{
				m.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(m.getText()=="M")
			{
				lives--;
				m.setText("-");
				m.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==n)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='N') 
				{
					userstr.setCharAt(i,'N');
					flag=true;
				}
			}
			if(flag)
			{
				n.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(n.getText()=="N")
			{
				lives--;
				n.setText("-");
				n.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==o)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='O') 
				{
					userstr.setCharAt(i,'O');
					flag=true;
				}
			}
			if(flag)
			{
				o.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(o.getText()=="O")
			{
				lives--;
				o.setText("-");
				o.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==p)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='P') 
				{
					userstr.setCharAt(i,'P');
					flag=true;
				}
			}
			if(flag)
			{
				p.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(p.getText()=="P")
			{
				lives--;
				p.setText("-");
				p.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==q)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='Q') 
				{
					userstr.setCharAt(i,'Q');
					flag=true;
				}
			}
			if(flag)
			{
				q.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(q.getText()=="Q")
			{
				lives--;
				q.setText("-");
				q.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==r)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='R') 
				{
					userstr.setCharAt(i,'R');
					flag=true;
				}
			}
			if(flag)
			{
				r.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(r.getText()=="R")
			{
				lives--;
				r.setText("-");
				r.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==s)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='S') 
				{
					userstr.setCharAt(i,'S');
					flag=true;
				}
			}
			if(flag)
			{
				s.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(s.getText()=="S")
			{
				lives--;
				s.setText("-");
				s.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==t)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='T') 
				{
					userstr.setCharAt(i,'T');
					flag=true;
				}
			}
			if(flag)
			{
				t.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(t.getText()=="T")
			{
				lives--;
				t.setText("-");
				t.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==u)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='U') 
				{
					userstr.setCharAt(i,'U');
					flag=true;
				}
			}
			if(flag)
			{
				u.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(u.getText()=="U")
			{
				lives--;
				u.setText("-");
				u.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==v)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='V') 
				{
					userstr.setCharAt(i,'V');
					flag=true;
				}
			}
			if(flag)
			{
				v.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(v.getText()=="V")
			{
				lives--;
				v.setText("-");
				v.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==w)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='W') 
				{
					userstr.setCharAt(i,'W');
					flag=true;
				}
			}
			if(flag)
			{
				w.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(w.getText()=="W")
			{
				lives--;
				w.setText("-");
				w.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==x)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='X') 
				{
					userstr.setCharAt(i,'X');
					flag=true;
				}
			}
			if(flag)
			{
				x.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(x.getText()=="X")
			{
				lives--;
				x.setText("-");
				x.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==y)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='Y') 
				{
					userstr.setCharAt(i,'Y');
					flag=true;
				}
			}
			if(flag)
			{
				y.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(y.getText()=="Y")
			{
				lives--;
				y.setText("-");
				y.setBackground(Color.red);
			}
		}
		else if(evn.getSource()==z)
		{
			boolean flag = false;
			for(int i=0;i<hiddenstr.length();i++)
			{
				if(hiddenstr.charAt(i)=='Z') 
				{
					userstr.setCharAt(i,'Z');
					flag=true;
				}
			}
			if(flag)
			{
				z.setBackground(Color.green);
				hidden.setText(userstr.toString());
			}
			else if(z.getText()=="Z")
			{
				lives--;
				z.setText("-");
				z.setBackground(Color.red);
			}
		}
		
		rem.setText(Integer.toString(lives));
		mngrp.repaint(); 
		check(); 
	}
	public static void main(String[] args) 
	{
		Frm fr = new Frm();
		fr.setVisible(true);	
	}
}
