package Command;

public class EditCommand implements abstructCommand{
	private  BoardScreen bs;
	public EditCommand(){
		bs=new BoardScreen();
	}
	@Override
	public void execute() {
		bs.edit();
	}
}
