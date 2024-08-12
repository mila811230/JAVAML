package ch05.sec05;

import java.util.Scanner;

public class CharAt2Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 주민등록번호 입력받기
        System.out.print("주민등록번호를 입력하세요 (예: 990101-1234567): ");
        String idNumber = scanner.nextLine();

        // 요금 계산
        int fee = calculateFee(idNumber);

        // 결과 출력
        System.out.println("요금: " + fee + "원");

        // Scanner 닫기
        scanner.close();
    }

    public static int calculateFee(String idNumber) {
        // 주민등록번호에서 생년월일 추출
        int birthYear = Integer.parseInt(idNumber.substring(0, 2));
        int birthMonth = Integer.parseInt(idNumber.substring(2, 4));
        int birthDay = Integer.parseInt(idNumber.substring(4, 6));
        int genderCode = Integer.parseInt(idNumber.substring(7, 8));

        // 현재 날짜 구하기
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) % 100; // 2자리 연도
        int currentMonth = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH) + 1; // 월은 0부터 시작
        int currentDay = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_MONTH);

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
        if (age < 18) {
            return 500; // 18세 미만
        } else if (age >= 65) {
            return 0; // 65세 이상
        } else {
            return 1000; // 일반인
        }
    }
}