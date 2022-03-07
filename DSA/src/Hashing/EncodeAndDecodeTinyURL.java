package Hashing;

import java.util.HashMap;
import java.util.UUID;

public class EncodeAndDecodeTinyURL {
	static HashMap<String,String> map = new HashMap<>();

	public static void main(String[] args) {
		EncodeAndDecodeTinyURL obj = new EncodeAndDecodeTinyURL();
		String tinyurl = obj.encode("https://leetcode.com/problems/design-tinyurl");
		String longurl = obj.decode(tinyurl);
		System.out.println(longurl);
		System.out.println(tinyurl);
		
	}

	private String decode(String tinyurl) {
		if(map.containsKey(tinyurl)) return map.get(tinyurl);
		return "" ;
	}

	private String encode(String str) {
		String tiny = str.substring(0,8) + "tinyurl.com/"+ UUID.randomUUID().toString();
		map.put(tiny, str);
		return tiny;
	}

}
