package Command;

public class client {

	public static void main(String[] args) {
    Menu menu=new Menu();
	abstructCommand  oc=new OpenCommand();
	 MenuItem item1=new MenuItem(oc);
	 menu.addMenuItem(item1);
	 abstructCommand  cc=new CreateCommand();
     MenuItem item2=new MenuItem(cc);
	 menu.addMenuItem(item2);
 	 abstructCommand  ec=new EditCommand();
     MenuItem item3=new MenuItem(ec);
	 menu.addMenuItem(item3);
      
	 menu.clickMenuItem(0);
	 menu.clickMenuItem(1);
	 menu.clickMenuItem(2);
	}
}
