package use;
import car.Truck;
import car.Bus;
import car.Taxi;

//만일 위에서 처럼 일일이 명시하는게 귀찮을경우
//import car.*; // *의 대상이 될수 있는 건 패키지명이 아닌 클래스명!
					//현업에서는 *를 잘 쓰지 않는다고 함
class  UseCar{
	public static void main(String[] args){
		//만일 택시를 사용하고 싶을 때, 부모인 Car를 인스턴스로 생성해줘여하나(new)?
		// X : 자식을 생성하면 부모도 자동으로 인스턴스화됨
		Taxi t = new Taxi(); //택시 인스턴스 생성
		//t = new Taxi("Audi"); //Taxi는 현재 디폴트 생성자만 가지고 있는 경우
		t.pass();
		t.move(); //분명 move()메서드는 택시에는 없는데 Car에 있는 메서드이기때문에
						//이것은 부모메서드를 접근
		t.showBrand();
	}	
}
