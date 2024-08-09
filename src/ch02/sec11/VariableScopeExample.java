package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;  //var2는 사용 못함 변수 사용범위때문
	}

}
