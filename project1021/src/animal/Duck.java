class  Duck{
	/*
	변수명과, 메서드명은 신중하게 (뜻을 부여, 직관적일수록 더 좋은) O 
	*/

	//메서드 즉 동작이 비슷한 경우, 메서드명을 여러개 정의하지 말고, 
	//동일한 메서드로 정의하되, 매개변수의 자료형, 개수로 구분하라!!
	//따라서, 개발자는 메서드명을 정하는 고통에서 해방됨...
	//메서드 오버로딩(OverLoading) : 메서드 중첩기법(중복정의)
	//오리가 먹는다
	public void eat(){
		
	}
	public void moreEat(String name){
		//오리가 더먹는다
	}
	//public void overEat(Bug bug, Meat meat){
		//오리가 과식한다
	//}
	//public void crazyEat(All all){
		//오리가 미친듯이 먹는다		
	//}
}
