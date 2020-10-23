package animal;

public class  Duck extends Bird{
				/*Duck is Bird*/
				/*Duck형은 Bird형이다*/
				/*오리는 새다*/
	String name="난 오리";

	public void quack(){
		System.out.println("꽥꽥");
	}

	public static void main(String[] args){
		Duck d1 = new Duck();
		Duck d2 = new Duck();

		Bird b = new Bird();

		int x=6;
		byte c=3;
		x=c;//당연함
	
		//b=d1; //새 = 오리, 오리를 새라 할 수 있다!
		//b=new duck()

		//객체자료형도 자료형
		Bird r = new Bird();
		Duck a = (Duck)new  Bird();
		System.out.println(a.name);
		r = a; // 큰 <--- 작  (O) 
		a = (Duck)r; //작 <---- 큰  (강제형변환해야가능(CAST)) - downcasting
		r = (Bird)a; //작은자료형에서 큰 자료형으로 올라감
							//up casting

		// 결론 : 객체자료형도 자료형이므로, 기본자료형의 원칙이 상당부분 그대로 적용되고 있다...
		/*
		자바의 기본자료형간 발생하는 형변환에서는 데이터의 손실이 발생할 수도 있지만, 자바의 객체
		자료형간 발생하는 형변환은 레퍼런스가 가리킬 수 있는 메모리 범위의 문제이므로, 데이터의 기본자료형
		간의 형변환과는 차이가 있다.O
		*/	
	}
}
