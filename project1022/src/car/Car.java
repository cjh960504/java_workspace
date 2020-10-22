//이 클래스는 모든 자동차류의 최상위 클래스로서, 가장 보편적인 기능과 속성들만을
//보유하면 됩니다.

//부모인 Car를 먼저 컴파일
package car;
public class  Car{
	//자동차의 보편적인 메서드는 뭐가 있을까요??
	String brand; // 제조사는 정해져있으면 안됨
	
	//부모의 생성자
	/*
	public Car(){
		System.out.println("자식의 super()호출에 의한 출력입니다.");
	}
	*/
	//개발자가 매개변수 있는 생성자만 정의함, 개발자가 생성자를 정의하면 컴파일러에 의한 디폴트 생성자
	//자동 삽입은 없음
	//따라서 Car클래스는 생성자가 오직 딱 1개만 있게 됨
	public Car(String brand){ 
		//매개변수 있는 생성자라서, new Car("벤츠") 등 방법으로 호출해야됨
		this.brand = brand;
		System.out.println("매개변수 있는 생성자 호출~");
	}
	public Car(){//매개변수 없는 생성자 추가, 매개변수 개수가 다르므로 오버로딩
		//이렇게하면, Taxi()생성자에서 매개변수 없는 super()호출		
		//에러가 나지 않게 된다.. 정말 그런지 테스트해보자
		System.out.println("매개변수 없는 디폴트 생성자 호출~");
	}
	public void move(){
		System.out.println("자동차가 갑니다.");
	}

	public void showBrand(){
		System.out.println("자동차의 Brand : "+brand);
	}
}
