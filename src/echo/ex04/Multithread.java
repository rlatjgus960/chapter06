package echo.ex04;

public class Multithread {

	public static void main(String[] args) throws Exception {

		//DisitRunableImpl digit = new DisitRunableImpl();
		Thread tread = new Thread(new DisitRunableImpl());
		tread.start();
		
		for (char C = 'A'; C <= 'Z'; C++) {
			System.out.println(C);
			Thread.sleep(1000);
			
		}
				

	}

}
