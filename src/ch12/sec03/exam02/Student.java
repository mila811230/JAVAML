package ch12.sec03.exam02;

public class Student {
	
	private int no;
	private String name;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	@Override
	public String toString() {
		return "학번 :" + this.no + ", 이름 : " + this.name;
	}



	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student target) {
			if((this.no ==target.no) && (this.name.equals(target.name))) {
				return true;
			}
		}
		return false;
		
		
	}
	
	
	

}








