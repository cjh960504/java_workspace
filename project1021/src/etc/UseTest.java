class  Test{
	String a="abc";
}

class UseTest{
	public void changString(Test t){
		t.a="def";
	}
	public static void main(String[] args){
		Test t = new Test();
		UseTest ut = new UseTest();
		System.out.println(t.a);
		ut.changString(t);
		System.out.println(t.a);
	}
}
