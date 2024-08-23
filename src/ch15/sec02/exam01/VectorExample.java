package ch15.sec02.exam01;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		Thread threadA = new Thread() {
			
			@Override
			public void run() {
				for (int i = 1; i <=1000; i++) {
					list.add(new Board("제목" + i, ".내용" + i, "글쓴이" + i));
					if(i % 3 == 0) {
						list.remove(i - 1);
					}
				}
			}
	};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <=2000; i++) {
					list.add(new Board("제목" + i, ".내용" + i, "글쓴이" + i));
					if(i % 3 == 0) {
						list.remove(i - 1);
					}
				}
			}
	
	};

			threadA.start();
			threadB.start();
			
			try {
				threadA.join();
				threadB.join();
				
			} catch(Exception e) {
				
			}
			
			//저장된 객체수 알아내기
			int size = list.size();
			System.out.println("총 객체수 : " + size);
			
			if(size > 100) {
				size = 100;
			}
			
			
			//전체보기
			System.out.println("전체 보기---------------");
			for (int i = 0; i< 100; i++) {
				Board board = list.get(i);
				System.out.printf("제목:%s, 내용:%s, 글쓴이:%s \n",
						board.getSubject(), board.getContent(), board.getWriter());			
			}
		}
	}






