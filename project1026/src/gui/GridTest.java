/*
awt/swing/fx --> �ȵ���̵�
*/
package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout; 
import java.awt.FlowLayout; 
import java.awt.Panel;

class  GridTest{
	public static void main(String[] args){
		Frame frame = new Frame("�׸��� ���̾ƿ�");
		
		//���̾ƿ� �Ŵ��� ���� �� ���
		GridLayout layout = new GridLayout(1, 3);

		//�÷ο��ġ�� ������Ʈ�� �ڽ��� ����ũ�⸦ ���� �� �ִ�..
		//FlowLayout layout = new FlowLayout();

		//�׸��带 �����ϸ鼭, ������Ʈ�� ������ ũ�⸦ �����ϴ� �����?
		//�ΰ��� ������������ �������� ����
		//�ذ�å) ������Ʈ �� ��ġ������ ������ ������ �г��� �̿��ϸ� �ȴ�.
		//��, �κ������� �ٸ� ��ġ�����ڸ� ������ ��, ���� ���ȴ�.
		

		frame.setLayout(layout); // �������� ���̾ƿ�����
		Panel p = new Panel();//���� ������ ����
	
		Button bt1 = new Button("��ư1");
		Button bt2 = new Button("��ư2");
		Button bt3 = new Button("��ư3");

		p.add(bt1); // �гο� ��ư �ֱ�
	//	p.setLayout(new FlowLayout()); //
		frame.add(p); //�����ӿ� �гγֱ�
		frame.add(bt2);//�����ӿ� ��ư �ֱ�
		frame.add(bt3);

		/*for (int i=0; i<6; i++)
		{
				frame.add(new Button("��ư"+i));
		}*/

		//������ ����
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
}
