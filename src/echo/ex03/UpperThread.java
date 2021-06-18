package echo.ex03;

public class UpperThread extends Thread {

	@Override
	public void run() {

		for (char C = 'A'; C <= 'Z'; C++) {
			System.out.println(C);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
