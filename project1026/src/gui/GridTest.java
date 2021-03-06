/*
awt/swing/fx --> 안드로이드
*/
package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout; 
import java.awt.FlowLayout; 
import java.awt.Panel;

class  GridTest{
	public static void main(String[] args){
		Frame frame = new Frame("그리드 레이아웃");
		
		//레이아웃 매니저 생성 및 등록
		GridLayout layout = new GridLayout(1, 3);

		//플로우배치는 컴포넌트가 자신의 본래크기를 가질 수 있다..
		//FlowLayout layout = new FlowLayout();

		//그리드를 유지하면서, 컴포넌트가 본래의 크기를 유지하는 방법은?
		//두개는 양자택일이지 공존하지 못함
		//해결책) 컴포넌트 중 배치관리자 적용이 가능한 패널을 이용하면 된다.
		//즉, 부분적으로 다른 배치관리자를 적용할 때, 많이 사용된다.
		

		frame.setLayout(layout); // 프레임의 레이아웃적용
		Panel p = new Panel();//눈에 보이지 않음
	
		Button bt1 = new Button("버튼1");
		Button bt2 = new Button("버튼2");
		Button bt3 = new Button("버튼3");

		p.add(bt1); // 패널에 버튼 넣기
	//	p.setLayout(new FlowLayout()); //
		frame.add(p); //프레임에 패널넣기
		frame.add(bt2);//프레임에 버튼 넣긴
		frame.add(bt3);

		/*for (int i=0; i<6; i++)
		{
				frame.add(new Button("버튼"+i));
		}*/

		//프레임 설정
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
}
