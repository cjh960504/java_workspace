class  Dog{
	String name="도그";
	int age=5;
	static String color="white"; //이 변수는 , 클래스로부터 생성된 인스턴스에 딸려올라가지말고
	//스태틱영역에서 딱 붙어있어라!
	public void bark(){
		System.out.println("웍웍");
	}
	public static void main(String[] args){
		System.out.println(Dog.color);
		Dog.color="black"; //Dog이라는 클래스의 전역변수와 같다!
		//main메소드가 Dog이라는 클래스와 같은 소속이기때문에 color라고 써도 무방!
		System.out.println(Dog.color);
		int a=8;
		Dog d1= new Dog();
		Dog d2= new Dog();
		boolean k=true;
		d1.age=10;
	}
}
