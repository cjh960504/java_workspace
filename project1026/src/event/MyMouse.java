/*마우스 이벤트 감지하기*/
package event;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MyMouse implements MouseListener{
	public void mouseClicked(MouseEvent e){
		System.out.println(" Mouse Clicked Call..");
	}
	public void mouseEntered(MouseEvent e){
		//System.out.println(" Mouse Entered Call..");
	}
	public void mouseExited(MouseEvent e){
		//System.out.println(" Mouse Exited Call..");
	}
	public void mousePressed(MouseEvent e){
		//System.out.println(" Mouse Pressed Call..");
	}
	public void mouseReleased(MouseEvent e){
		//System.out.println(" Mouse Released Call..");
	}
}
