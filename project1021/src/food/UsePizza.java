class  UsePizza{
		
	//피자를 먹는다..
	public void eat(Pizza p){
		p.slice=3;
	}
	//개수를 조정한다.
	public void setSlice(int slice){
		slice = 3;
	}

	public static void main(String[] args){
		Pizza p1= new Pizza("피자헛");
		Pizza p2 = new Pizza("도미노");

		UsePizza up = new UsePizza();
		up.setSlice(5);
		up.setSlice(p1.slice);//Pizza 객체의 상관 x
		up.eat(p2); //PIzza 객체 전체가 가는게 아니라, p2의 주소값만 슝
	}
}
