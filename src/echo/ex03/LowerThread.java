package echo.ex03;

public class LowerThread extends Thread {

	@Override
	public void run() {

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
