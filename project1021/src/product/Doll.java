class  Doll{
	public void walk(){ //겉는다
		
	}
	/*
	개발자가 정의하지 않으면, Sun에서 나선다..
	컴파일러에 의해 아주 기본적인 최소한의 관여를 통해 생성자를 정의한다..
	
	[디폴트 생성자]
	public Doll(){
	//로직은 없다.. 최소한의 관여만 하므로..(그냥 에러안나도록)
	}
	*/
	//개발자가 생성자를 정의하면, 더 이상 컴파일러에 의한 디폴트 생성자 정의는 없다
	//따라서 개발자가 정의한 생성자만 존재한다!
	public Doll(){ //생성자에 반환값이 있어도 실행이 되므로 아주 무서운 코드!
		
	}
	public Doll(int i){
		System.out.println(i);
	}
	//public Doll(String s){
		//System.out.println(s);
	//}
	public static void main(String[] args){
		Doll d = new Doll();
		d.walk();//존재하는 메서드 호출이므로 O
		//d.run();//존재하지 않는 메서드이므로 호출 X
	}
}
