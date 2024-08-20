package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		
		try(MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
			
		}
		catch(Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
			
		}
		
		try(MyResource res = new MyResource("B")) {
			String data = res.read2();
			int value = Integer.parseInt(data);
			
		}
		catch(Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
			
		}
		
		MyResource resC = new MyResource("C");
		MyResource resD = new MyResource("D");
				
		try(resC; resD) {
			String data1 = resC.read1();
			String data2 = resD.read1();
//			int value = Integer.parseInt(data);
			
		}
		catch(Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
			
		}

	}

}
