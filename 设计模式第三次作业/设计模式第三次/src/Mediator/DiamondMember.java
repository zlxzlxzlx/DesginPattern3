package Mediator;

public class DiamondMember extends Member{
	
	public DiamondMember(String name){
		super(name);
	}
	@Override
	public void sendText(String to, String Text) {
		System.out.println(this.name+"向"+to+"发送的文本："+Text);
		super.abstructChatRoom.sendText(this.name, to, Text);
	}

	@Override
	public void sendImage(String to, String Image) {
		System.out.println(this.name+"向"+to+"发送的图片："+Image);
		super.abstructChatRoom.sendImage(this.name, to, Image);
	}

}
