package gui;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.FlowLayout;

class  LoginForm{
	public static void main(String[] args){
		Frame frame = new Frame("·Î±×ÀÎ");
		frame.setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2, 0));
		
		Panel tp1 = new Panel();
		tp1.add(new Label("ID", 1));
		tp1.add(new TextField(15), 1);
		p1.add(tp1);

		Panel tp2 = new Panel();
		tp2.add(new Label("PW", 1));
		tp2.add(new TextField(15), 1);
		p1.add(tp2);

		frame.add(p1, BorderLayout.CENTER);

		Panel p2 = new Panel();
		p2.add(new Button("Login"));
		p2.add(new Button("Cancle"));
		frame.add(p2, BorderLayout.SOUTH);

		frame.setSize(400,150);
		frame.setVisible(true);
	}
}
