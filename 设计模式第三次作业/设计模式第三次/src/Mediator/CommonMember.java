package Mediator;

public class CommonMember extends Member {
	
	public CommonMember(String name){
		super(name);
	}

	@Override
	public void sendText(String to, String Text) {
		System.out.println(this.name+"��"+to+"���͵��ı���"+Text);
		super.abstructChatRoom.sendText(this.name, to, Text);
	}

	@Override
	public void sendImage(String to, String Image) {
	     System.out.println("�Բ�����û�з���ͼƬ��Ȩ��");
	}

}
