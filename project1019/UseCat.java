class  UseCat{
	public static void main(String[] args){
		Cat cat = new Cat();
		System.out.println("[����� ����]");
		System.out.println("=> ����� �̸�: "+cat.name);
		System.out.println("=> ����� ����: "+cat.age);
		System.out.println("=> ����� ��ȥ����: "+cat.isMarried );
		cat.walk();
		cat.cry();
	}
}
