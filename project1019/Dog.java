/*강아지를 정의한다.*/
class  Dog{
	/*
	결국 클래스안에 올 수 있는 문법 구성요소는?
	1) 변수 = property
	2) 함수 = method
	*/
	//색상, 이름, 나이 (상수)
	String color;
	String name;
	int age;
	
	public Dog(String color, String name, int age){
		this.color = color;
		this.name = name;
		this.age = age;
	}

	//짖는다, 뛴다 (메서드)
	//반환형이 없는 함수는 void를 명시
	public void run(){
		System.out.println(name + ": 터벅터벅..");
	}

	public void bark(){
		System.out.println(name + ": 왈왈!");
	}
	
}
