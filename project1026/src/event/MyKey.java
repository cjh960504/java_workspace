package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//키보드와 관련한 이벤트가 발생하면, 자바 가성머신이 KeyListener에게 KeyEvent
//인스턴스를 전달한다..
//이 전달된 인스턴스는 KeyListener가 보유한 추상메서드에게 전달되어지므로,
//개발자는 추상메서드를 재정의하면서 원하는 로직을 작성하면 됨!!
public class MyKey implements KeyListener{
	//오버라이딩하고, 키보드 누를때마다 눌렀어? 메시지 나오게 처리
	public void keyPressed(KeyEvent e){
		//System.out.println("키 누를 때, keyPressed called...");
	}
	public void keyReleased(KeyEvent e){
		System.out.println("키 눌렀다 땔 때, key Realesed called..");
	}
	public void keyTyped(KeyEvent e){
		//System.out.println("키를 칠 때, keyTyped called...");
	}
}
