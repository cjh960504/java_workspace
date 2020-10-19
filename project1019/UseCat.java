class  UseCat{
	public static void main(String[] args){
		Cat cat = new Cat();
		System.out.println("[고양이 생성]");
		System.out.println("=> 고양이 이름: "+cat.name);
		System.out.println("=> 고양이 나이: "+cat.age);
		System.out.println("=> 고양이 결혼여부: "+cat.isMarried );
		cat.walk();
		cat.cry();
	}
}
