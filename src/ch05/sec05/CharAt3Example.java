package ch05.sec05;

import java.util.Scanner;

public class CharAt3Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 주민등록번호 입력받기
        System.out.print("주민등록번호를 입력하세요 (예: 990101-1234567): ");
        String idNumber = scanner.nextLine();

        // 주민등록번호에서 생년월일 추출
        int birthYear = Integer.parseInt(idNumber.substring(0, 2));
        // 입력받은 주민등록 번호의 인덱스 0번(첫번째)자리부터 두자리를 추출한다
        //(0, 2)에서 0은 인덱스 0번째부터 인덱스 2번에서 종료한다는 뜻이므로 인덱스2는 해당 안됨
        
        int birthMonth = Integer.parseInt(idNumber.substring(2, 4));
        // 입력받은 주민등록 번호의 인덱스2번(세번째)자리부터 두자리를 추출한다.
        //(2, 4)에서 2는 인덱스 세번째부터인덱스 4번째에서 종료한다는 뜻이므로 인덱스2, 3만 해당됨
        
        int birthDay = Integer.parseInt(idNumber.substring(4, 6));
        // 입력받은 주민등록 번호의 인덱스4번(다섯번째) 자리부터 두자리를 추출한다
        //(4, 6)에서 4는 인덱스 다섯번부터 인덱스 6번째에서종료한다는 뜻이므로 인덱스4, 5만 해당됨
        
        int genderCode = Integer.parseInt(idNumber.substring(7, 8));
        // 입력받은 주민등록 번호의 인덱스7번(여덟번째) 자리부터 두자리를 추출한다
        //(7 , 8)에서 7은 인덱스 여덟번째 자리에서 시작하고  인덱스 8에서 종료하므로
        // 인덱스 7 (여덟번째)자리만 해당됨
        

        // 현재 날짜 구하기
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int currentYear = calendar.get(java.util.Calendar.YEAR) % 100; // 2자리 연도
        int currentMonth = calendar.get(java.util.Calendar.MONTH) + 1; // 월은 0부터 시작
        int currentDay = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        // 2000년 이전 출생이면 1900년대, 이후 출생이면 2000년대
        if (genderCode == 1 || genderCode == 2) {
            birthYear += 1900;
        } else {
            birthYear += 2000;
        }

        // 나이 계산
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        // 요금 결정
        int fee;
        if (age < 18) {
            fee = 500; // 18세 미만
        } else if (age >= 65) {
            fee = 0; // 65세 이상
        } else {
            fee = 1000; // 일반인
        }

        // 결과 출력
        System.out.println("요금: " + fee + "원");

        // Scanner 닫기
        scanner.close();
        
    }
}











