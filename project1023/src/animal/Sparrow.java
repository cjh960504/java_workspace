/*참새를 정의한다*/
package animal;

public class  Sparrow extends Bird{
		String name="난 참새";
		public void jjack(){
			System.out.println("쨲쨲");
		}

		//자식클래스에서 [부모와  <100% 동일한 메서드>를 정의]하는 기법을
		//오버라이딩이라한다. (Overriding)
		//왜 지원하는가?? 부모의 메서드를 자식에서, 기능을 변경, 추가
		//하는 등의 업그레이드하고 싶을 때...

		/*
			주의!)
			오버로딩 vs 오버라이딩
			:[오버로딩]은 같은 클래스내에서, 기능이 비슷한 메서드명을 굳이 새로 만들지 말고, 매개변수
			개수와 자료형으로 구분하면 <중복정의>를 인정해주겠다.

			[오버라이딩]은 <상속관계>에서..자식이 부모의 메서드를 <재정의>하는 기법
			메서드 즉 기능을 업그레이드 했을때, 자식의 [메서드]를 우선하여 호출해주는 기법
			변수는 로직이 아니기에 그 대상이 될 수 없다..
		*/
		public void fly(){
			System.out.println("참새가 날아요");
		}

		public static void main(String[] args){
			Sparrow sp = new Sparrow();
			sp.fly(); //참새의 메서드 호출

			Bird bird = new Bird();
			bird.fly();//부모인 새의 메서드 호출
			System.out.println(bird.name);

			Bird bird2 = new Sparrow(); //자식이 오버라이딩한 메서드를 존중!
			System.out.println(bird2.name)2;
		}
}
