/*use��Ű������ Account ����Ŭ������ ����*/
package use;

//���� Ŭ������ public���� �ؾ��ұ�?
//X , ���� Ŭ������ ����� �Ϸ��� Ŭ������ ������ �ʿ䰡 ����. �����ϴ� Account�ʰ� ����
//Ŭ�����鸸 public���� �����ؾ���
import bank.Account; //bank ������ ��δ� �̹� classpath�� ��ϵǾ��ִ�.
class  UseAccount{
	public static void main(String[] args){
		Account acc = new Account(); // ���� Ŭ���� ����(public�̶� ���������
		//������ ������)
		
		//bank ������� public���� ����, ������ ���� ����
		System.out.println(acc.bank);

		//customer�� protected�� ����Ǿ� �����Ƿ� ��Ӱ��迡 �ְų�, ���� ��Ű��
		//��쿡�� ������ ����.. ���� UseAccount�� Account�� ��Ӱ��谡 ����
		//���� �ٸ� ��Ű���̹Ƿ�, ������ �Ұ���
		//System.out.println(acc.customer);

		//���¹�ȣ num������, �����ڰ� �ƹ��͵� ������� ����. �̷��� ���������ڸ� default
		//���������ڶ� �ϰ�, default��� Ű���带 ����ؼ��� �ȵȴ�.. �׳� ���־ߴ�
		//default ���� �����ڴ� ���� ��Ű���� �ִ� Ŭ���������� ������ ������ְ�, protected����
		//�Ѵܰ� �� ��ٷӴ�. (��, ��Ӱ��迡 �־, ���� ��Ű���� �ƴϸ� ���� �Ұ�..)
		//num is not public in Account; cannot be accessed from outside package	
		//���� ���͸����� �ǽ��ؿԱ� ������ �̷� ������ ������ ���ߴ� ��
		//System.out.println(acc.num);

		//���� �ܾ� balance
		//balance�� ���� ������ ������������ private�� ����Ǿ� �����Ƿ�, Account Ŭ���� 
		//�����θ� ������ ����.. Account�ڽ��� �ƴϸ� ���� �����
		//���� �����
		//balance has private access in Account
		//aac.balance=10; // �� ����� ���� �����̹Ƿ� �Ұ���
		acc.setBalance(10);//10������ ����, public �޼��带 ���� ���ٰ���
		//�ܰ� ������ �ƴ϶�, �ܰ� �����Ϸ� �� ���� �޼��� ���� �ʿ�

		System.out.println(acc.getBalance());
	}
}
