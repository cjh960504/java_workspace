package use;
//����ϰ��� �ϴ� Ŭ������ ��ġ ����
import animal.Dog;
//Dog�̶�� Ŭ������ package ����θ� �״�� ���´�.
class  UseDog{
	public static void main(String[] args){
		//���� Ŭ������ �ٸ� ��ο� �ִ� Ŭ������ ����ؾ� �ϴµ�,
		//�����Ϸ��� ��� Dog.class�� ã�� �� �ִ��� �˾ƾ� �մϴ�.
		//����μ��� �����Ϸ��� UseDog�� ���� ���͸��� ã�� ��ʴϴ�.
		//���� �Ʒ��� �ڵ�� cant find symbol ���� ���̴ϴ�.
		//�� ������ �ذ��Ϸ���, Ŭ������ ��θ� �˷������
		//�Ϲ������� ��θ� ����� ���� ȯ�溯���� �̿�
		//��ΰ� �Ϲ� ������ ���� path ȯ�溯�� ������,
		//��ΰ� Ŭ���� ������ ��� classpath ȯ�溯���� �̿��ϸ� ��
		//�̶�, classpath ȯ�溯���� ��� ��θ� ����ؿ� ���� ����..

		Dog d = new Dog();
		d.run();
	}
}