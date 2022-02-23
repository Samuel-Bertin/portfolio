
public class Main {
	public static void main(String[]args) {
		String str = "salutations";
		char[] tdc = str.toCharArray();
		MyString test = new MyString(tdc);
		System.out.println(test.lastIndexOf('a'));
	}
}
