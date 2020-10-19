class  UseTest2{
	int x=2; //이 변수를 쓰려면 UseTest2가 인스턴스화가 되어야한다.
	//즉, 거푸집에 쇳물을 붇지도 않았는데 쓰려고 하니 문제..

		public static void main(String[] args){
		//x값을 10으로 변경하고 출력하시오..
		Test2 t = new Test2();
		t.x=10;
		System.out.println(t.x);
	}
}
