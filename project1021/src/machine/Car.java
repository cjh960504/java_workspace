class  Car{
	String name="Benz";
	String color="red";
	//int wheel=2;// ����Ÿ�����
	//	������ wheel; 
	//the car has a wheel!!(has a ���� - �繰�� �繰) 
	//�ڵ����� ������ ������ �ִ�..
	Wheel wheel;//�� �ڵ尡 ������ ���� ����?
	//Ŭ���� �ȿ��� �ڷ����� �� �� �ִµ�, �ڹ��� �ڷ����� �� 4���̴�.
	//���� �� Ŭ���� �ȿ��� ����, ����, ���� �̿ܿ��� ��ü���� �� �� �ִ�..
	//��ü�ڷ����� �ڷ����̴ϱ�..
	int price=5000000;
	
	//Ŭ������� ������ �̸��� �޼��带 ������ �����ڶ� �ϰ�,
	//�����ڴ� �̸������� �� �� �ֵ���, ��ü�� ���� Ÿ�ӿ�, ���� �ʱ�ȭ �۾��� ������
	//�۾��� �����ϴ� �뵵�� �޼���
	public Car(){
		this.wheel = new Wheel();
	}

	public void go(){
		
	}
	public void stop(){
		
	}
	public static void main(String[] args){
		//�ڵ����� �����ϰ�, 
		//�ڵ����� �̸��� ����ϰ� 
		//�� �ڵ��� ������ �귣��, ����, ������ ��±��� �Ͻÿ�
		Car car = new Car();
		System.out.println("�ڵ����� �̸�: "+car.name);
		System.out.println("�ڵ��� ������ �귣��: "+car.wheel.brand);
		System.out.println("�ڵ��� ������ ����: "+car.wheel.color);
		System.out.println("�ڵ��� ������ ����: "+car.wheel.price);
	}
}
