package Command;

public class MenuItem {
     private abstructCommand command;
     public MenuItem(abstructCommand command){
    	this.command=command; 
     }
     public void click(){
    	 this.command.execute();
     }
}
