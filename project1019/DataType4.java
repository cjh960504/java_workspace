class  DataType4{
	public static void main(String[] args){
		short s = 7;
		byte b = 5;

		s=b; // ����? �Ұ���? 
		//����, ������ �ϴ� �;ƴϱ⶧���� int�� �Ǵ� ���� �ƴ϶�, 
		//s�� �ڷ����� short���� �ڵ�����ȯ  promotion
		b=(byte)s; //���� ����ȯ ū -> �� demotion 
	}
}