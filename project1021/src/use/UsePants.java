package use;

//����� ����.. �Ʒ�ó�� ����ϸ�, d: ��΋����� ������ �߻�..
//�� �ڹ� �ڵ�� ������, ������, ��.. ���� ��� ����Ǿ�� �ϹǷ�, ��θ� Ư�� OS�� �������� ��η�
//����ϸ� �ȵȴ�!

//OSȯ�溯�� : path �����ϰ��� ������ ��� ��ġ
//					classpath �����ϰ��� Ŭ���� ������ ����� ��ġ
import fashion.down.Pants;
//[����]�� ���ؼ���... ����ϰ��� Ŭ������ ��ġ ���!! src(X) bin(O)
class  UsePants{
	public static void main(String[] args){
		//���� Ŭ�����ʹ� ���������� ������ �ִ�, �� �ٸ� ��Ű���� ����ִ�
		//Ŭ���� ����غ���!
		//js:<script src="���/���ϸ�"></script>
		Pants p = new Pants();
		System.out.println(p);
	}
}
