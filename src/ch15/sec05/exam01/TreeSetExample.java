package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//treeSet 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		//Integer 객체 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 정렬된 Integer 객체를 하나씩 가져오기
		for(Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println(" \n");
		
		
		// 특정 Integer 객체를 가져오기
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위의 점수 : " + scores.higher(95));
		System.out.println("95점 이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("85점 이거나 바로 위의 점수 : " + scores.ceiling(85) + "\n");
		
		
		// 내림차순으로 정렬
		NavigableSet<Integer> descScores = scores.descendingSet();
		System.out.println("\n--------------------------");
		
		for(Integer s : descScores) {
			System.out.print(s + " ");
			
		}
		
		
		//범위 검색
		NavigableSet<Integer> rangSet = scores.subSet(80, true, 95, false);
		System.out.println("\n- 80 <= A <95--------------------");
		
		for(Integer s : rangSet) {
			System.out.print(s + " ");
			
		}
		
		

	}

}









