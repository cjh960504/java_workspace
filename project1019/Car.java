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
	String color;
	int price;
	boolean self;

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
		int x;//초기화되지않은 변수, 굉장히 프로그래밍언어가 싫어하는 문법임..
		//모든 {지역}변수는, 초기화해야 연산이 가능하다!!(프로그램의 기본 원칙)
		int z = x + 5;

	}
}
