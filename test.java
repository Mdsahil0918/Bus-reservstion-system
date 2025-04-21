package Library;

public class test {
public static void main(String[] args) {
	String s="developer";
	String name="devloperjava";
	boolean firstthree =s.substring(0, 0).equalsIgnoreCase(name.substring(0, 3));
	String s2=name.substring(name.length()-3,name.length());
	System.out.println(s2);
}
}
