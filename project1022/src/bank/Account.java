package bank; //bank라는 원본 소스를 담는 패키지는 직접 만들어야함.

/*고객의 계좌를 정의한다. : 업무가 신중해짐.. 예민한 데이터를 많이 다룬다*/
//패키지에 넣은 클래스를 public으로 공개하지 않으면, 다른 어떠한 클래스도 이
//클래스를 사용할 수 없다. 이건 보안이 아니라, 의미없는 짓이다.
//클래스를 쓰라고 만드는 것이기 때문에, public으로 공개하되, 그안의 내용들에 대해 보안처리
//따라서 public으로 공개
public class  Account{
	/*계좌에 들어갈 만한 속성들 정의*/
	public String bank="국민은행";
	protected String customer = "최준혁"; //고객 이름
	String num=" 713-701-011-99090";//계좌번호
	private int balance=100000; //금액

	//private으로 선언된 변수는 절대 아무도 외부에서 접근할 수 없으므로
	//변수에 접근하려면, 메서드를 이용해야한다..
	//아래의 메서드는 public 이므로, 모든 ~ 객체가 접근할 수  있따.
	//UseAccount에서 잔고를 수정하고, 출력하고
	public void setBalance(int balance){
		this.balance = balance;
	}
	//잔고확인 메서드 정의
	//이와같이 private으로 선언된 변수의 값을 리턴하는 메서드를 가리켜 getter라 합니다.
	// 그리고 위와같이 setBalance처럼 private 변수의 값을 변경하는 메서드를 가리켜 setter라 함.
	//게터와 세터는 아주 유명하고 중요한 메서드 정의 기법이다.
	public int getBalance(){
		return balance;
	}

	public void setBank(String bank){
		this.bank = bank;
	}
	public String getBank(){
		return Bank;
	}
	public void setCustomer(String customer){
		this.customer = customer;
	}
	public void setNum(String num){
		this.num = num;
	}
	public String getNum(){
		return num;
	}

}
 
//is a 관계 : ex) Duck is bird 오리는 새다 => 상속관계를 나타내는 말
// extends Car  자동차와 버스 트럭 택시는 -> Bus is a Car

//has a 관계 : 자동차는 바퀴를 가지고 있다. => 부품관계

