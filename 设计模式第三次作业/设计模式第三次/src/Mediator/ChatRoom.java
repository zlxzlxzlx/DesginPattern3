package Mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom extends abstructChatRoom{

	Map<String, Member> map=new HashMap<String,Member>();
	@Override
	public void addRoom(Member member) {
		map.put(member.getName(), member);
		member.setAbstructChatRoom(this);
	}
	
	@Override
	public void sendText(String from, String to, String text) {
          Member memberToText=map.get(to);
          memberToText.reciveText(from, text);
	}

	@Override
	public void sendImage(String from, String to, String image) {
		 Member memberToImage=map.get(to);
		 memberToImage.reciveImage(from, image);
	}
}
