/*
�ýø� �����մϴ�.
*/
package car;
public class  Taxi extends Car{
	String brand="benz";
	/*�̹� Car�� ��ӹ޾����Ƿ�, ���⼭�� ���������� �ýø��� Ư¡�� �߰�*/
	/*�ڵ差�� ������ �ٰ�, �ߺ��ۼ� ���� �ʾƵ� �ǹǷ� ���������� ��!*/
	/*OOP����� ������ �ٷ� ���!*/
	
	//TaxiŬ������ ����Ʈ �����ڿ����� ������ super()�� ��������Ƿ�, �Ű����� ���� ��������
	//Car()�� ȣ���ϰ� �ִ�. ���� ���� Car���� Car() ������ ��ſ� Car(String brand)
	//�� �����ϹǷ�, ������ ȣ�� �� ������ ����.
	public Taxi(){	
		super(); 
	}
	
	public Taxi(String brand){
		super(brand);
	}
	//�ýø��� Ư¡
	public void pass(){
		System.out.println(brand + super.brand);
		System.out.println("�°��� �¿���");
		
	}
}
