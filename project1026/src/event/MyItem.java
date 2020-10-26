package event;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
class MyItem implements ItemListener{
	public void itemStateChanged(ItemEvent e){
		System.out.println("³ª ¹Ù…f¾î?");
	}
}
