public class RecursiveReversal {
    public static void main(String[] args) {
	System.out.println(reverse("The world is a beautiful place"));
    }

    public static String reverse(String s) {
	return reverseHelper(s, 0, s.length() - 1);
    }

    private static String reverseHelper(String s, int start, int end) {
	if (start >= end) {
	    return s;
	}
	String newString = s.substring(0, start) + s.charAt(end) + s.substring(start + 1, end) + s.charAt(start) + s.substring(end + 1, s.length());
	return reverseHelper(newString, ++start, --end);
    }
}
