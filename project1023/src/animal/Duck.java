package animal;

public class  Duck extends Bird{
				/*Duck is Bird*/
				/*Duck���� Bird���̴�*/
				/*������ ����*/
	String name="�� ����";

	public void quack(){
		System.out.println("�в�");
	}

	public static void main(String[] args){
		Duck d1 = new Duck();
		Duck d2 = new Duck();

		Bird b = new Bird();

		int x=6;
		byte c=3;
		x=c;//�翬��
	
		//b=d1; //�� = ����, ������ ���� �� �� �ִ�!
		//b=new duck()

		//��ü�ڷ����� �ڷ���
		Bird r = new Bird();
		Duck a = (Duck)new  Bird();
		System.out.println(a.name);
		r = a; // ū <--- ��  (O) 
		a = (Duck)r; //�� <---- ū  (��������ȯ�ؾ߰���(CAST)) - downcasting
		r = (Bird)a; //�����ڷ������� ū �ڷ������� �ö�
							//up casting

		// ��� : ��ü�ڷ����� �ڷ����̹Ƿ�, �⺻�ڷ����� ��Ģ�� ���κ� �״�� ����ǰ� �ִ�...
		/*
		�ڹ��� �⺻�ڷ����� �߻��ϴ� ����ȯ������ �������� �ս��� �߻��� ���� ������, �ڹ��� ��ü
		�ڷ����� �߻��ϴ� ����ȯ�� ���۷����� ����ų �� �ִ� �޸� ������ �����̹Ƿ�, �������� �⺻�ڷ���
		���� ����ȯ���� ���̰� �ִ�.O
		*/	
	}
}
