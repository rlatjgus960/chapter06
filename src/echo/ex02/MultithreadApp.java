package echo.ex02;

public class MultithreadApp {

	public static void main(String[] args) {

		DigitThread thread = new DigitThread();
		thread.start(); //start 메소드 내부에 run() 실행하는게 있음, 준비가 되면 런 실행시킴
		//thread.run(); 으로 하면 그냥 런만 냅다 실행됨
		
		for(char ch ='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);  //트라이캐치로 예외처리
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
	}

}
