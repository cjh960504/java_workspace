/*�������� �����Ѵ�.*/
class  Dog{
	/*
	�ᱹ Ŭ�����ȿ� �� �� �ִ� ���� ������Ҵ�?
	1) ���� = property
	2) �Լ� = method
	*/
	//����, �̸�, ���� (���)
	String color;
	String name;
	int age;
	
	public Dog(String color, String name, int age){
		this.color = color;
		this.name = name;
		this.age = age;
	}

	//¢�´�, �ڴ� (�޼���)
	//��ȯ���� ���� �Լ��� void�� ���
	public void run(){
		System.out.println(name + ": �͹��͹�..");
	}

	public void bark(){
		System.out.println(name + ": �п�!");
	}
	
}
