class  Car{
	String name="Benz";
	String color="red";
	//int wheel=2;// 숫자타고오니
	//	바퀴형 wheel; 
	//the car has a wheel!!(has a 관계 - 사물과 사물) 
	//자동차가 바퀴를 가지고 있다..
	Wheel wheel;//이 코드가 낯설지 않은 이유?
	//클래스 안에는 자료형을 둘 수 있는데, 자바의 자료형은 총 4개이다.
	//따라서 이 클래스 안에는 문자, 숫자, 논리값 이외에도 객체형도 올 수 있다..
	//객체자료형도 자료형이니깐..
	int price=5000000;
	
	//클래스명과 동일한 이름의 메서드를 가리켜 생성자라 하고,
	//생성자는 이름에서도 알 수 있듯이, 객체의 생성 타임에, 무언가 초기화 작업이 있을때
	//작업을 수행하는 용도의 메서드
	public Car(){
		this.wheel = new Wheel();
	}

	public void go(){
		
	}
	public void stop(){
		
	}
	public static void main(String[] args){
		//자동차를 생성하고, 
		//자동차의 이름을 출력하고 
		//이 자동차 바퀴의 브랜드, 색상, 가격을 출력까지 하시오
		Car car = new Car();
		System.out.println("자동차의 이름: "+car.name);
		System.out.println("자동차 바퀴의 브랜드: "+car.wheel.brand);
		System.out.println("자동차 바퀴의 색상: "+car.wheel.color);
		System.out.println("자동차 바퀴의 가격: "+car.wheel.price);
	}
}
