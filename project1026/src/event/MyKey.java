package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//Ű����� ������ �̺�Ʈ�� �߻��ϸ�, �ڹ� �����ӽ��� KeyListener���� KeyEvent
//�ν��Ͻ��� �����Ѵ�..
//�� ���޵� �ν��Ͻ��� KeyListener�� ������ �߻�޼��忡�� ���޵Ǿ����Ƿ�,
//�����ڴ� �߻�޼��带 �������ϸ鼭 ���ϴ� ������ �ۼ��ϸ� ��!!
public class MyKey implements KeyListener{
	//�������̵��ϰ�, Ű���� ���������� ������? �޽��� ������ ó��
	public void keyPressed(KeyEvent e){
		//System.out.println("Ű ���� ��, keyPressed called...");
	}
	public void keyReleased(KeyEvent e){
		System.out.println("Ű ������ �� ��, key Realesed called..");
	}
	public void keyTyped(KeyEvent e){
		//System.out.println("Ű�� ĥ ��, keyTyped called...");
	}
}
