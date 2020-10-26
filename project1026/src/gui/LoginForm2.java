package gui;
import java.awt.*;//나쁜짓이라 편함..

//인스터스화되면서 바로 윈도우를 메모리에 올리기
class  LoginForm2 extends Frame{
	/* has a 관계는 멤버변수가 객체형일때를 의미한다!!*/
	Label la_id, la_pass;
	TextField t_id, t_pass;
	Button bt_login, bt_regist;
	Panel p_center, p_south; // center:id,pw 입력  south:버튼2개

	public LoginForm2(){
		//부품관계로 보유한 변수들을 모두 초기화 시키자..
		//특히 부품은 이 객체가 태어날 때 같이 함께 태어나야 하므로, 생성자의 타이밍을 놓치지말자!!
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField(15);
		t_pass = new TextField(15);
		bt_login = new Button("Login");
		bt_regist = new Button("가입");
		p_center = new Panel();
		p_south = new Panel();

		//생성만 한 상태, 아직 조립이나 스타일 부여 X
		//Frame은 개발자가 레이아웃을 지정하지 않으면 디폴트가 BorderLayout이다..
		//this.setLayout(new BorderLayout()); 필요 없다! 왜 이미 디폴트가 BorderLayout..
		
		//처음보는 객체에 대한 대응법 1.뭐하는 객체인지 파악 2.메모리에 올리는 법(일반, 추상, 인터페이스)
		//상수는 직관성을 부여한 데이터이다. final로 더이상 값을 변경할 수 없으며, static으로 인스턴스간
		//공유가 가능하며, public으로 선언하여, 모든 객체가 접근할 수 있도록 접근제한을 풀어놓은 데이터
		p_center.setBackground(Color.GRAY); //인간이 사용하기 쉬운 API
		//센터패널을 윈도우의 BorderLayout센터에 add 
		add(p_center, BorderLayout.CENTER);

		//p_center에 그리드 적용
		p_center.setLayout(new GridLayout(2, 2)); //2행 2열짜리 그리드 적용
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);
		
		p_south.setBackground(new Color(000, 000, 102));

		//Panel은 아무런 배치관리자를 적용하지 않으면 디폴트가 FlowLayout이다!!
		p_south.add(bt_login);
		p_south.add(bt_regist);
		add(p_south, BorderLayout.SOUTH);
		
		/* this의 정확한 의미? 레퍼런스 변수이다. 단, 나 자신의 인스턴스의 주소값을 가진..
		해당 인스턴스가 자기 자신을 가리킬 때..*/
		setSize(400, 150);
		setVisible(true);
	}
	public static void main(String[] args){
		new LoginForm2();		
	}
}
