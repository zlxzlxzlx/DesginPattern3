package Command;

import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> menuItemsList = new ArrayList<MenuItem>();
	public void addMenuItem(MenuItem item){
		this.menuItemsList.add(item);
	}
	
	 public void clickMenuItem(int index) {
		 menuItemsList.get(index).click();
	    }
}
