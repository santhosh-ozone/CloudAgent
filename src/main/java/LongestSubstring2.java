import java.util.LinkedHashMap;

public class LongestSubstring2 {
	
	public void longestsubstring(String str) {
		char[] chars=str.toCharArray();
		int	longestsubstring_length=0;
		String longestsubstring =null;
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char ch=chars[i];
			if(map.get(ch)==null)
				map.put(ch, i);
			else {
					i=map.get(ch);
					map.clear();		
				}
			if(map.size()>longestsubstring_length) {
				longestsubstring_length=map.size();
				longestsubstring =map.keySet().toString();
				}	
			
		}
		
		
			System.out.println("longest sub string of:' "+str+" '  is  "+longestsubstring);
			
	}

	public static void main(String[] args) {
		LongestSubstring2 ls=new LongestSubstring2();
		ls.longestsubstring("longest sub string of");
		}

}
