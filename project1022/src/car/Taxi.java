/*
택시를 정의합니다.
*/
package car;
public class  Taxi extends Car{
	String brand="benz";
	/*이미 Car를 상속받았으므로, 여기서도 마찬가지로 택시만의 특징을 추가*/
	/*코드량이 현저히 줄고, 중복작성 하지 않아도 되므로 유지보수에 굿!*/
	/*OOP언어의 목적은 바로 상속!*/
	
	//Taxi클래스의 디폴트 생성자에서는 무조건 super()가 들어있으므로, 매개변수 없는 생성자인
	//Car()를 호출하고 있다. 따라서 현재 Car에는 Car() 생성자 대신에 Car(String brand)
	//만 존재하므로, 생성자 호출 시 에러가 난다.
	public Taxi(){	
		super(); 
	}
	
	public Taxi(String brand){
		super(brand);
	}
	//택시만의 특징
	public void pass(){
		System.out.println(brand + super.brand);
		System.out.println("승객을 태워요");
		
	}
}
