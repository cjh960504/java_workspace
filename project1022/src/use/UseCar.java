package use;
import car.Truck;
import car.Bus;
import car.Taxi;

//���� ������ ó�� ������ ����ϴ°� ���������
//import car.*; // *�� ����� �ɼ� �ִ� �� ��Ű������ �ƴ� Ŭ������!
					//���������� *�� �� ���� �ʴ´ٰ� ��
class  UseCar{
	public static void main(String[] args){
		//���� �ýø� ����ϰ� ���� ��, �θ��� Car�� �ν��Ͻ��� �������࿩�ϳ�(new)?
		// X : �ڽ��� �����ϸ� �θ� �ڵ����� �ν��Ͻ�ȭ��
		Taxi t = new Taxi(); //�ý� �ν��Ͻ� ����
		//t = new Taxi("Audi"); //Taxi�� ���� ����Ʈ �����ڸ� ������ �ִ� ���
		t.pass();
		t.move(); //�и� move()�޼���� �ýÿ��� ���µ� Car�� �ִ� �޼����̱⶧����
						//�̰��� �θ�޼��带 ����
		t.showBrand();
	}	
}
