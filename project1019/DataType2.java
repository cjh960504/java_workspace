class  DataType2{
	public static void main(String[] args){
		char a='��';
		//char b=true; //���ڸ� ��ƾ� ������!
		//char c=-10; // char�� ��ǻ�, ���� �ڷ�����!!
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