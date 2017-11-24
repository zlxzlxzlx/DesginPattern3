package Mediator;

public class DiamondMember extends Member{
	
	public DiamondMember(String name){
		super(name);
	}
	@Override
	public void sendText(String to, String Text) {
		System.out.println(this.name+"��"+to+"���͵��ı���"+Text);
		super.abstructChatRoom.sendText(this.name, to, Text);
	}

	@Override
	public void sendImage(String to, String Image) {
		System.out.println(this.name+"��"+to+"���͵�ͼƬ��"+Image);
		super.abstructChatRoom.sendImage(this.name, to, Image);
	}

}
