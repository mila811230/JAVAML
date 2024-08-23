package ch15.sec02.exam03;

import java.util.LinkedList;
import java.util.List;

import ch15.sec02.exam01.Board;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<Board> list = new LinkedList<>();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		
		//저장 된 객체 수 알아내기
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("-----------------------");
		
		Board board = list.get(2);
		System.out.printf("제목 : %s, 내용 : %s, 글쓴이 : %s \n",
				board.getSubject(), board.getContent(), board.getWriter());
		System.out.println("-----------------------");
		
		
		//전체보기
		System.out.println("전체보기");
		for(int i = 0; i < list.size(); i++) {
			board  = list.get(i);
			System.out.printf("제목 : %s, 내용 : %s, 글쓴이 : %s \n",
					board .getSubject(), board.getContent(), board.getWriter());
		}
		
		System.out.println("-----------------------");
		
		
		//삭제 후 전체보기
		list.remove(2);
		for(Board bd : list) {
		System.out.printf("제목 : %s, 내용 : %s, 글쓴이 : %s \n",
					bd.getSubject(), bd.getContent(), bd.getWriter());
		}

	}

}


