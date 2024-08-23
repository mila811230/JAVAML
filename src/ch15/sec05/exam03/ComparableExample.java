package ch15.sec05.exam03;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 35));
		treeSet.add(new Person("강감찬", 56));
		treeSet.add(new Person("이순신", 68));
		treeSet.add(new Person("박희동", 42));
		
		System.out.println(treeSet.size());
		
		for(Person person : treeSet) {
			System.out.println(person.name + " : " + person.age);
			
		}
		

	}

}
