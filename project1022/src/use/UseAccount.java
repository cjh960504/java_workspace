/*use패키지에서 Account 계좌클래스에 접근*/
package use;

//현재 클래스는 public으로 해야할까?
//X , 현재 클래스는 사용을 하려는 클래스로 공개할 필요가 없다. 사용당하는 Account쪽과 같은
//클래스들만 public으로 공개해야함
import bank.Account; //bank 이전의 경로는 이미 classpath에 등록되어있다.
class  UseAccount{
	public static void main(String[] args){
		Account acc = new Account(); // 계좌 클래스 생성(public이라 여기까지는
		//무조건 가능함)
		
		//bank 은행명은 public으로 선언, 무조건 접근 가능
		System.out.println(acc.bank);

		//customer는 protected로 선언되어 있으므로 상속관계에 있거나, 같은 페키지
		//경우에만 접근이 가능.. 현재 UseAccount는 Account와 상속관계가 없고
		//서로 다른 패키지이므로, 접근이 불가능
		//System.out.println(acc.customer);

		//계좌번호 num변수는, 개발자가 아무것도 명시하지 않음. 이러한 접근제한자를 default
		//접근제한자라 하고, default라는 키워드를 명시해서는 안된다.. 그냥 냅둬야댐
		//default 접근 제한자는 같은 패키지에 있는 클래스끼리만 접근을 허용해주고, protected보다
		//한단계 더 까다롭다. (즉, 상속관계에 있어도, 같은 패키지가 아니면 접근 불가..)
		//num is not public in Account; cannot be accessed from outside package	
		//같은 디렉터리에서 실습해왔기 떄문에 이런 에러를 만나지 못했던 것
		//System.out.println(acc.num);

		//계좌 잔액 balance
		//balance는 가장 강력한 접근제한자인 private이 적용되어 있으므로, Account 클래스 
		//스스로만 접근이 가능.. Account자신이 아니면 절대 못사용
		//완전 폐쇄적
		//balance has private access in Account
		//aac.balance=10; // 이 방법은 직접 접근이므로 불가능
		acc.setBalance(10);//10원으로 수정, public 메서드를 통해 접근가능
		//잔고 수정이 아니라, 잔고에 접근하려 것 또한 메서드 제공 필요

		System.out.println(acc.getBalance());
	}
}
