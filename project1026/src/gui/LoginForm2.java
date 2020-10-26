package gui;
import java.awt.*;//�������̶� ����..

//�ν��ͽ�ȭ�Ǹ鼭 �ٷ� �����츦 �޸𸮿� �ø���
class  LoginForm2 extends Frame{
	/* has a ����� ��������� ��ü���϶��� �ǹ��Ѵ�!!*/
	Label la_id, la_pass;
	TextField t_id, t_pass;
	Button bt_login, bt_regist;
	Panel p_center, p_south; // center:id,pw �Է�  south:��ư2��

	public LoginForm2(){
		//��ǰ����� ������ �������� ��� �ʱ�ȭ ��Ű��..
		//Ư�� ��ǰ�� �� ��ü�� �¾ �� ���� �Բ� �¾�� �ϹǷ�, �������� Ÿ�̹��� ��ġ������!!
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField(15);
		t_pass = new TextField(15);
		bt_login = new Button("Login");
		bt_regist = new Button("����");
		p_center = new Panel();
		p_south = new Panel();

		//������ �� ����, ���� �����̳� ��Ÿ�� �ο� X
		//Frame�� �����ڰ� ���̾ƿ��� �������� ������ ����Ʈ�� BorderLayout�̴�..
		//this.setLayout(new BorderLayout()); �ʿ� ����! �� �̹� ����Ʈ�� BorderLayout..
		
		//ó������ ��ü�� ���� ������ 1.���ϴ� ��ü���� �ľ� 2.�޸𸮿� �ø��� ��(�Ϲ�, �߻�, �������̽�)
		//����� �������� �ο��� �������̴�. final�� ���̻� ���� ������ �� ������, static���� �ν��Ͻ���
		//������ �����ϸ�, public���� �����Ͽ�, ��� ��ü�� ������ �� �ֵ��� ���������� Ǯ����� ������
		p_center.setBackground(Color.GRAY); //�ΰ��� ����ϱ� ���� API
		//�����г��� �������� BorderLayout���Ϳ� add 
		add(p_center, BorderLayout.CENTER);

		//p_center�� �׸��� ����
		p_center.setLayout(new GridLayout(2, 2)); //2�� 2��¥�� �׸��� ����
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);
		
		p_south.setBackground(new Color(000, 000, 102));

		//Panel�� �ƹ��� ��ġ�����ڸ� �������� ������ ����Ʈ�� FlowLayout�̴�!!
		p_south.add(bt_login);
		p_south.add(bt_regist);
		add(p_south, BorderLayout.SOUTH);
		
		/* this�� ��Ȯ�� �ǹ�? ���۷��� �����̴�. ��, �� �ڽ��� �ν��Ͻ��� �ּҰ��� ����..
		�ش� �ν��Ͻ��� �ڱ� �ڽ��� ����ų ��..*/
		setSize(400, 150);
		setVisible(true);
	}
	public static void main(String[] args){
		new LoginForm2();		
	}
}
