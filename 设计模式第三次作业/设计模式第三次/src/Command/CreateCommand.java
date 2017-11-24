package Command;

public class CreateCommand implements abstructCommand{

	private  BoardScreen bs;
	public CreateCommand(){
		bs=new BoardScreen();
	}
	@Override
	public void execute() {
		bs.create();
	}
}
