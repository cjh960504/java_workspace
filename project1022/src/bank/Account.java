package bank; //bank��� ���� �ҽ��� ��� ��Ű���� ���� ��������.

/*���� ���¸� �����Ѵ�. : ������ ��������.. ������ �����͸� ���� �ٷ��*/
//��Ű���� ���� Ŭ������ public���� �������� ������, �ٸ� ��� Ŭ������ ��
//Ŭ������ ����� �� ����. �̰� ������ �ƴ϶�, �ǹ̾��� ���̴�.
//Ŭ������ ����� ����� ���̱� ������, public���� �����ϵ�, �׾��� ����鿡 ���� ����ó��
//���� public���� ����
public class  Account{
	/*���¿� �� ���� �Ӽ��� ����*/
	public String bank="��������";
	protected String customer = "������"; //�� �̸�
	String num=" 713-701-011-99090";//���¹�ȣ
	private int balance=100000; //�ݾ�

	//private���� ����� ������ ���� �ƹ��� �ܺο��� ������ �� �����Ƿ�
	//������ �����Ϸ���, �޼��带 �̿��ؾ��Ѵ�..
	//�Ʒ��� �޼���� public �̹Ƿ�, ��� ~ ��ü�� ������ ��  �ֵ�.
	//UseAccount���� �ܰ� �����ϰ�, ����ϰ�
	public void setBalance(int balance){
		this.balance = balance;
	}
	//�ܰ�Ȯ�� �޼��� ����
	//�̿Ͱ��� private���� ����� ������ ���� �����ϴ� �޼��带 ������ getter�� �մϴ�.
	// �׸��� ���Ͱ��� setBalanceó�� private ������ ���� �����ϴ� �޼��带 ������ setter�� ��.
	//���Ϳ� ���ʹ� ���� �����ϰ� �߿��� �޼��� ���� ����̴�.
	public int getBalance(){
		return balance;
	}

	public void setBank(String bank){
		this.bank = bank;
	}
	public String getBank(){
		return Bank;
	}
	public void setCustomer(String customer){
		this.customer = customer;
	}
	public void setNum(String num){
		this.num = num;
	}
	public String getNum(){
		return num;
	}

}
 
//is a ���� : ex) Duck is bird ������ ���� => ��Ӱ��踦 ��Ÿ���� ��
// extends Car  �ڵ����� ���� Ʈ�� �ýô� -> Bus is a Car

//has a ���� : �ڵ����� ������ ������ �ִ�. => ��ǰ����

