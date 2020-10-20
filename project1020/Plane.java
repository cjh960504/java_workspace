class  Plane{
	String name="보잉747";
	static int price=9000;
	//객체지향언어에서 전역변수로 사용을 지원
	//같은 클래스로 찍어낸 인스턴스들이 static변수들을 공유한다!!
	//heap영역에 있는 인스턴스들도 사용가능
	String color="white";
	
	public void setPrice(){
		price = 10;
	}

	public static void main(String[] args){
		Plane p1 = new Plane();
		Plane p2 = new Plane();

		p1.price=3000;//Plane.price=3000
		System.out.println(p2.price); //System.out.println(Plane.price); 
		price=5000;//Plane.price=3000
		System.out.println(p1.price); //System.out.println(Plane.price); 
	}
}
