package Command;

public class OpenCommand implements abstructCommand{

	private  BoardScreen bs;
	public OpenCommand(){
		bs=new BoardScreen();
	}
	@Override
	public void execute() {
		bs.open();
	}

}
