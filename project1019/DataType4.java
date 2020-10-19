class  DataType4{
	public static void main(String[] args){
		short s = 7;
		byte b = 5;

		s=b; // 가능? 불가능? 
		//가능, 연산을 하는 것아니기때문에 int가 되는 것이 아니라, 
		//s의 자료형인 short으로 자동형변환  promotion
		b=(byte)s; //강제 형변환 큰 -> 작 demotion 
	}
}