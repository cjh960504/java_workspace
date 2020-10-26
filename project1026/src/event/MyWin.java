package event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Choice;

class MyWin extends Frame{
					//MyWin is a Frame
	Button bt; //MyWin has a bt
	TextField t;
	Choice ch; //html에서의 select 박스와 동일

	public MyWin(){
		bt = new Button("나 클릭");
		t = new TextField(15);
		ch = new Choice();
		//ch의 아이템 채우기
		ch.add("Java Programming");
		ch.add("JSP Programming");
		ch.add("Android Programming");
		ch.add("Spring Programming");
		ch.add("MyBatis Programming");

		setLayout(new FlowLayout());

		//버튼을 윈도우에 부착!
		add(bt);//프레임은 디폴트가 BorderLayout이므로, 센터영역에 크게 붙을 것임
		//TextField 윈도우에 부착!
		add(t);
		//Choice 윈도우에 부착!
		add(ch);
		
		bt.addActionListener(new MyListener()); // 버튼과 리스너 연결!!
		t.addKeyListener(new MyKey());//텍스트필드와 리스너 연결
		this.addMouseListener(new MyMouse());//frame과 리스너 연결
		ch.addItemListener(new MyItem()); //choice와 리스너 연결
		this.addWindowListener(new MyWindowListener());//frame과 window리스너연결
		setSize(300, 400);
		setLocation(800, 400);
		setVisible(true);
	}

	public static void main(String[] args){
		new MyWin();
	}
}
