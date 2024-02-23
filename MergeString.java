public class MergeString {
	
	public static void main(String args[]) {
		MergeString ms= new MergeString();
		System.out.println(ms.merge("aced"," "));
	}
StringBuilder ret = new StringBuilder();
public String merge(String s, String t) {
if(s == null || s.isEmpty()) {
ret.append(t);
return ret.toString();
}
if(t == null || t.isEmpty()) {
ret.append(s);
return ret.toString();
}
if(s.charAt(0) <= t.charAt(0)) {
ret.append(s.charAt(0));
return merge(s.substring(1), t);
} else {
ret.append(t.charAt(0));
return merge(s, t.substring(1));
}
}
}