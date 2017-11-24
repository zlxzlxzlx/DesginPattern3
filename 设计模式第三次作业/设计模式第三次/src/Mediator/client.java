package Mediator;

public class client {

	public static void main(String[] args) {
		abstructChatRoom chatRoom=new ChatRoom();
		Member member1=new CommonMember("zlx");
		chatRoom.addRoom(member1);
		
		Member member2=new DiamondMember("lj");
		chatRoom.addRoom(member2);
		
		Member member3=new CommonMember("tf");
		chatRoom.addRoom(member3);
		
		member1.sendText("lj", "hello");
		member1.sendImage("ft", "image");
		
		member2.sendText("zlx", "fine");
		
		member3.sendText("zlx", "thank");
		member3.sendImage("lj", "image");
			

	}

}
