package echo.ex02;

public class DigitThread extends Thread {

	@Override
	public void run() {
		
		for(int i=0; i<=9; i++) { //로직 코드는 반드시 run() 메소드에 작성해야함
			System.out.println(i);
			
			try {
				Thread.sleep(1000);  //트라이캐치로 예외처리
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		
	}

}
