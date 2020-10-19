class  DataType2{
	public static void main(String[] args){
		char a='한';
		//char b=true; //문자를 담아야 정상임!
		//char c=-10; // char는 사실상, 숫자 자료형임!!
		char $ab = 'a';
		int test = $ab + 3;
		$ab=$ab + true;
		System.out.println($ab);
	}	
}

//1) 3, 4
//2) 2, 3
//3) 3
//4) 3
//5) 1, 3, 4
//6)  2
//7) 1, 2
//8) 2, 
//9) 1