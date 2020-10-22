package study;
//이렇게도 가능
//주의할점 반드시 클래스명만이 *의 대상이 된다.
//import *.* (X)
import pet.*;
class  UseCat{
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.eat();
	}	
}
