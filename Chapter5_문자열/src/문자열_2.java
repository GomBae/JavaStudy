//concat : 문자열 결합
//문자열.concat(문자열) ==> 문자열+문자열
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello ";
		String s2 = "Java";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		//문자열 ==> 기능 수행 ==> 문자열 변경하지 않는다.
		
		String msg="Hello Java";
		// a=>b ==> Hello Jbvb
		System.out.println(msg.replace("a", "b"));
		

	}

}
