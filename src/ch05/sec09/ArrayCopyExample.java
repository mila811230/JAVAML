package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 길이 3인 배열
		String[] oldStrArray = {"java", "array", "copy", "baby", "darling"};
		
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[4];
		
		//배열 항목 복사
		System.arraycopy(oldStrArray, 1, newStrArray, 0, newStrArray.length);
		
		//배열 항목 출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}

	}

}
