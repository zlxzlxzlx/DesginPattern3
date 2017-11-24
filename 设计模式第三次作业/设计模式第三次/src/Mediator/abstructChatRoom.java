package Mediator;

public abstract class abstructChatRoom {
	public abstract  void addRoom(Member member);
  public abstract  void sendText(String form,String to,String text);
  public abstract void sendImage(String form,String to,String image);
}
