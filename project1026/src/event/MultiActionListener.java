/**/
package event;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
class  MultiActionListener implements ActionListener{
	
	//�� �޼����, ������ ��� ��ư�� ������ �Ѿ�´�!
	public void actionPerformed(ActionEvent e){
		//������ ����Ų �̺�Ʈ�� ���� ��� ������ Event�ν��Ͻ��� ���޵Ǿ� ���Ƿ�
		//� ��ư�� ���ȴ� ���� �� �� �ִ�!!
		//�̺�Ʈ ��ü�� �޼��� �߿�, �̺�Ʈ�� ����Ų ������Ʈ(�̺�Ʈ �ҽ�)�� �����ϴ� �޼���
		Button bt = (Button)e.getSource();
		if(bt.getLabel()=="��ư1"){
			System.out.println("��ư1 Ŭ��!");	
		}else if(bt.getLabel()=="��ư2"){
			System.out.println("��ư2 Ŭ��!");
		}
	}	
}
