/*
이번엔 트럭을 정의
*/
package car;
public class  Truck extends Car{ //이 한줄로, 우리는 Car를 상속받게되고, 
										//지금부터 Car의 자원들에 접근 가능

	//트럭에도 move 메서드를 둬야 하나요?
	//우리가 원하는 건, 중복제거
	//이때 사용되는 기술이 상속..
	//이제 트럭만이 갖는 특징을 작성
	public void dump(){
		System.out.println("물건을 대량으로 옮깁니다.");
	}
}
