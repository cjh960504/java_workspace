class  Dog{
	String name="����";
	int age=5;
	static String color="white"; //�� ������ , Ŭ�����κ��� ������ �ν��Ͻ��� �����ö�������
	//����ƽ�������� �� �پ��־��!
	public void bark(){
		System.out.println("����");
	}
	public static void main(String[] args){
		System.out.println(Dog.color);
		Dog.color="black"; //Dog�̶�� Ŭ������ ���������� ����!
		//main�޼ҵ尡 Dog�̶�� Ŭ������ ���� �Ҽ��̱⶧���� color��� �ᵵ ����!
		System.out.println(Dog.color);
		int a=8;
		Dog d1= new Dog();
		Dog d2= new Dog();
		boolean k=true;
		d1.age=10;
	}
}
