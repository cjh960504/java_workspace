/*������ �����Ѵ�*/
package animal;

public class  Sparrow extends Bird{
		String name="�� ����";
		public void jjack(){
			System.out.println("����");
		}

		//�ڽ�Ŭ�������� [�θ��  <100% ������ �޼���>�� ����]�ϴ� �����
		//�������̵��̶��Ѵ�. (Overriding)
		//�� �����ϴ°�?? �θ��� �޼��带 �ڽĿ���, ����� ����, �߰�
		//�ϴ� ���� ���׷��̵��ϰ� ���� ��...

		/*
			����!)
			�����ε� vs �������̵�
			:[�����ε�]�� ���� Ŭ����������, ����� ����� �޼������ ���� ���� ������ ����, �Ű�����
			������ �ڷ������� �����ϸ� <�ߺ�����>�� �������ְڴ�.

			[�������̵�]�� <��Ӱ���>����..�ڽ��� �θ��� �޼��带 <������>�ϴ� ���
			�޼��� �� ����� ���׷��̵� ������, �ڽ��� [�޼���]�� �켱�Ͽ� ȣ�����ִ� ���
			������ ������ �ƴϱ⿡ �� ����� �� �� ����..
		*/
		public void fly(){
			System.out.println("������ ���ƿ�");
		}

		public static void main(String[] args){
			Sparrow sp = new Sparrow();
			sp.fly(); //������ �޼��� ȣ��

			Bird bird = new Bird();
			bird.fly();//�θ��� ���� �޼��� ȣ��
			System.out.println(bird.name);

			Bird bird2 = new Sparrow(); //�ڽ��� �������̵��� �޼��带 ����!
			System.out.println(bird2.name)2;
		}
}
