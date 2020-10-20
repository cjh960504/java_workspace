/*
	자동차를 정의한다. (Car)
	색상
	가격
	자동주행모듈 장착 여부
	달린다
	멈춘다
*/
class  Car{
	//아래의 변수는, 클래스로부터 인스턴스가 생성될 때, 해당 인스턴스에 포함되어지는
	//인스턴스 변수로써, 생명력은 해당 인스턴스가 소멸될 때까지 함께 한다..

	//자동차의 부품이므로, 자동차와 생명을 같이 한다.
	//이러한 멤버변수는, 초기화하지 않으면 컴파일러가 최소한의 관여로 값을 자동 초기화한다!!
	String color; //null로 초기화됨 => 객체라
	char a;
	int price;//정수는 최소한의 값인 0으로 초기화 
	boolean self; //false

	public void go(){
		System.out.println("부릉부릉~");
	}

	public void stop(){
		System.out.println("끼익~");
	}

	public static void main(String[] args){
		/*
		Car클래스를 선언하면서, 해당 클래스가 보유한 변수인 멤버변수에 
		아무런 값도 초기화시키지 않았다면, 어떤 결과가 나올까??
		일반적인 프로그래밍언어에서는 변수의 값이 없는 상태로 다른 데이터와의
		연산을 수행하게 되면 에러가 발생한다..
		*/
		//int x;//초기화되지않은 변수, 굉장히 프로그래밍언어가 싫어하는 문법임..
		//모든 {지역}변수는, 초기화해야 연산이 가능하다!!(프로그램의 기본 원칙)
		//int z = x + 5;
		
		//자동차의 인스턴스를 한개 생성한 후, 그 인스턴스 안의 멤버변수들이 갖는
		//값을 출력해보자! (정말로 컴파일러에 의해 초기화되었는지...)
		Car c = new Car();
		System.out.println("색상: "+c.color);
		System.out.println("가격: "+c.price);
		System.out.println("자동주행여부: "+c.self);
		System.out.println("a: "+c.a);

	}
}
