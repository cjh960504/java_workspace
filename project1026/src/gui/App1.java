/*
�����쿡 �� �� �ִ� ���� ������Ʈ �˾ƺ���
ex) .��ư, �ؽ�Ʈ�ʵ�, �����ڽ�, üũ�ڽ�, ���̽�, �̹���, textarea..
*/
package gui;
import java.awt.Frame;//����Ϸ��� Ŭ������ ��ġ ���
import java.awt.Button;//��򰡿� .class�� �����ϱ� ������ ��밡���� ���̴�..
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Image;
import java.awt.Toolkit;

public class  App1{
	public static void main(String[] args){
		/*������ ����*/

		/*���� ó������ Ŭ������ ������ �� ��ó��
			[����/��ó�ڼ�] 
				0) "����Ϸ��� Ŭ������ ���� � �������� �����Ǵ� ������ �� �뵵 �ľ�"
				1) "�ڹ��� ��� ��ü�� �ᱹ 3���� �����ۿ� ����!"
				2) "Ŭ������ ����� ����� ���̴�, ���� �޸𸮿� �ø��� ���� �˸� �ȴ�"
			1) �Ϲ�Ŭ���� : new�ϸ�ȴ�! new ���� ������ ����(api������ ����)
			2) �߻�Ŭ���� : new�� �Ұ��ϹǷ�, �ڽ��� �����ؼ� new�ϰų� 
							  �̹� �����ϴ� �ν��Ͻ��� �̿��ϸ� �ȴ�.(api������ ���� )
			3) �������̽� : new �Ұ��ϹǷ�, �ڽ��� �����ؼ� new�ϰų� 
							  �̹� ������ �ν��Ͻ��� �̿��ϸ� �ȴ�.(api������ ���� )
		*/

		//ó��������, �Ϲ��̱� ������ new ������ ���� �����ڸ� �����ؼ� ����ϸ� ��
		Frame frame=new Frame(); // �ڹ� ������ ���α׷��ֿ����� ������!
		//�������� ����Ʈ�� ���� ������ �ʴ� ������, ���� ���̵��� �޼��� ȣ��!!
		frame.setVisible(true); //Window ��ü�κ��� ��ӹ��� �޼���
		//�Ű������δ� ������ ����� �� �ִ�..

		//�������� �ʺ�, ���̸� ������ �� �ִ� �޼��� ã��
		frame.setSize(300, 400);
		frame.setLocation(750, 400);
		//�����찡 �����Ǿ����Ƿ�, ������ �ȿ� ��ġ�� ���� ������Ʈ �÷����ƺ���~
		//��ư Button(�Ϲ�, �߻�, �������̽�)
		Button bt = new Button("�� ��ư");
		
		//��ư�� �����ϱ� ����, ���̾ƿ� ��Ÿ���� �����ؾ� �ϴµ�, ���̾ƿ��� ���� ���Ŵϱ�
		//�ϴ� FlowLayout�� ����غ���
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);//�����쿡 �÷ο� ����� ��ġ ����
		

		//��ư�� ������ �����̳ʿ� ��������~
		frame.add(bt); //add�޼����� �Ű������� Component���̹Ƿ�,
		//Button�� Component�� �ڽ��̱� ������ ���� �ڷ����� �ش��Ͽ�, add()�� 
		//�μ��� �� �� �ִ�!!
		//TextArea
		TextArea ta = new TextArea("This is TextArea's Zone...", 10, 30);
		frame.add(ta);
		//html������ input type="text"�� �ڹٿ����� TextField�� �Ѵ�.
		TextField tf = new TextField("�ȳ��ϼ���", 10);
		frame.add(tf);
		//Checkbox
		Checkbox cb1 = new Checkbox("Java");
		Checkbox cb2 = new Checkbox("C");
		Checkbox cb3 = new Checkbox("Spring");
		frame.add(cb1);
		frame.add(cb2);
		frame.add(cb3);
		
		//�׳� �ؽ�Ʈ
		Label la = new Label("This is Label..........");
		frame.add(la);
		
		//�̹��� �ֱ�!
		//Image�� �߻�Ŭ�����̸�, �÷���(window, mac, linux..)�� ������ ������� ���� �� �ִ�.
		//�÷����� �°� ����������, DefaultToolkitŬ�����κ��� �ڿ��� ���� �Ѵ�..
		Toolkit kit = Toolkit.getDefaultToolkit(); //static �޼���!! ���� Ŭ����������
																	//������ �� �ִ�!!!
																	//Sun�翡�� �ν��Ͻ�����!
		//��Ŷ�� �̹����� ���û��� ��ηκ��� ���� �� �ִ�..
		//��λ�� �� ������ ��: �������ô� ������ OS������ ����ϴ� ǥ���̹Ƿ�
		//���� �� �ڹ��ڵ尡 ��� OS����Ƿ���, ��� �߸����� ��η� �����Ѵ�!
		//Image img = kit.getImage("C:/java_workspace/project1026/res/girl.jpg");
		Image img = kit.getImage("../../res/girl.jpg");
		System.out.println("�̹��� �ּҰ��� "+img);
		//�ڹٿ� ���� �Ϲ����� �����ϱ���� ���α׷��� ������
		//������(���� �׸��� �۾�)�� �ؾ��ϱ� �����̴�...
	}
}
