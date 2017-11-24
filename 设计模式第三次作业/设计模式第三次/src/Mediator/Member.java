package Mediator;

public abstract class Member {

	protected String name;
	protected abstructChatRoom abstructChatRoom;
   public Member(String name) {
		this.name=name;
	}
   public String getName() {
		return name;
	}
  
	public abstructChatRoom getAbstructChatRoom() {
		return abstructChatRoom;
	}
	public void setAbstructChatRoom(abstructChatRoom abstructChatRoom) {
		this.abstructChatRoom = abstructChatRoom;
	}
	public abstract void sendText(String to,String Text);
    public abstract void sendImage(String to,String Image);
    public void reciveText(String from,String Text){
       System.out.println(this.name+"接收来自"+from+"的文本："+Text);
       }
    public void reciveImage(String from,String Image){
    	System.out.println(this.name+"接收来自"+from+"的图片："+Image);
       }

}
