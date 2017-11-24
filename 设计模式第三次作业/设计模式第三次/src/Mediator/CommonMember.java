package Mediator;

public class CommonMember extends Member {
	
	public CommonMember(String name){
		super(name);
	}

	@Override
	public void sendText(String to, String Text) {
		System.out.println(this.name+"向"+to+"发送的文本："+Text);
		super.abstructChatRoom.sendText(this.name, to, Text);
	}

	@Override
	public void sendImage(String to, String Image) {
	     System.out.println("对不起您没有发送图片的权限");
	}

}
